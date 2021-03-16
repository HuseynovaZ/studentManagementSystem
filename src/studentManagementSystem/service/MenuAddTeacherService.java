package studentManagementSystem.service;

import studentManagementSystem.bean.Config;
import studentManagementSystem.bean.Teacher;
import studentManagementSystem.serviceInterMenu.MenuAddTeacherServiceInter;

import java.util.Scanner;

public class MenuAddTeacherService implements MenuAddTeacherServiceInter {
    @Override
    public void processLogic() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
        String name = sc.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("enter surname");
        String surname = sc2.nextLine();

        Teacher t = new Teacher();
        t.setName(name);
        t.setSurname(surname);
        Config.instance().appendTeacher(t);
        System.out.println("Teacher added");
    }
}
