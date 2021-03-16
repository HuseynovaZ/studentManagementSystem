package studentManagementSystem.service;

import studentManagementSystem.bean.Config;
import studentManagementSystem.bean.Student;
import studentManagementSystem.serviceInterMenu.MenuShowStudentServiceInter;

public class MenuShowStudentService implements MenuShowStudentServiceInter {
    @Override
    public void processLogic()  {
        Student[]allStudent= Config.instance().getStudents();
        for (int i=0;i<allStudent.length;i++){
            System.out.println(allStudent[i]);

        }
    }
}
