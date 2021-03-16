package studentManagementSystem.main;

import studentManagementSystem.bean.Config;
import studentManagementSystem.util.MenuUtil;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Config.initialize();
        MenuUtil.showMenu();

    }
}
