package studentManagementSystem.util;

import studentManagementSystem.ServiceInter.Proses;
import studentManagementSystem.bean.Config;
import studentManagementSystem.service.*;

public enum Menu {
    LOGIN(1, "Login", new MenuLoginService()),
    REGISTER(2, "Register", new MenuRegisterService()),
    ADD_TEACHER(3, "Add teacher", new MenuAddTeacherService()),
    ADD_STUDENT(4, "Add student", new MenuAddStudentService()),
    SHOW_ALL_TEACHER(5, "Show all teacher", new MenuShowTeacherService()),
    SHOW_ALL_STUDENT(6, "Show all student", new MenuShowStudentService()),
    UNKNOWN;
    private int number;
    private String label;
    private Proses service;

    Menu() {

    }

    Menu(int number, String label, Proses service) {
        this.label = label;
        this.service = service;
        this.number = number;
    }


    public String getLabel() {
        return label;
    }


    @Override
    public String toString() {
        return number + "." + label;
    }

    public void process() throws IllegalAccessException {
        service.process();
        MenuUtil.showMenu();
    }

    public int getNumber() {
        return this.number;
    }

    public static Menu find(int number) {
        Menu[] menus = Menu.values();

        for (int i = 0; i < menus.length; i++) {
            if (menus[i].getNumber() == number) {
                return menus[i];
            }
        }
        return Menu.UNKNOWN;

    }

    public static void showAllMenu() {
        Menu[] menus = Menu.values();

        for (int i = 0; i < menus.length; i++) {
            if (menus[i] != UNKNOWN) {
                if (menus[i] != LOGIN && menus[i] != REGISTER) {
                    if (Config.isLoggedIn()) {
                        System.out.println(menus[i]);
                    }
                }


            }
        }
    }
}

