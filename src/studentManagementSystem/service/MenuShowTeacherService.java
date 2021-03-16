package studentManagementSystem.service;

import studentManagementSystem.bean.Config;
import studentManagementSystem.bean.Teacher;
import studentManagementSystem.serviceInterMenu.MenuShowTeacherServiceInter;

public class MenuShowTeacherService implements MenuShowTeacherServiceInter {
    @Override
    public void processLogic() {
        Teacher[] all = Config.instance().getTeachers();
        for (int i = 0; i < all.length; i++) {
            System.out.println(all[i]);

        }
    }
}
