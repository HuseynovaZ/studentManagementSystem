package studentManagementSystem.util;


import java.util.Scanner;

public class MenuUtil {

    public static void showMenu() throws IllegalAccessException {
        System.out.println("Please select menu");
        System.out.println("1.Login");
        System.out.println("2.Register");
        Menu.showAllMenu();
        Scanner sc = new Scanner(System.in);
        int selectedMenuNumber = sc.nextInt();
        Menu selectedMenu = Menu.find(selectedMenuNumber);
        selectedMenu.process();
    }

    public static void processMenu(Menu menu) throws IllegalAccessException {
        menu.process();
    }

}
