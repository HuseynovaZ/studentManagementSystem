package studentManagementSystem.service;

import studentManagementSystem.bean.Config;
import studentManagementSystem.bean.Student;
import studentManagementSystem.serviceInterMenu.MenuAddStudentServiceInter;

import java.util.Scanner;

public class MenuAddStudentService implements MenuAddStudentServiceInter {
    @Override
    public void processLogic() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
        String name = sc.nextLine();
        System.out.println("enter surname");
        Scanner sc2 = new Scanner(System.in);
        String surname = sc2.nextLine();
        Student s = new Student();
        s.setName(name);
        s.setSurname(surname);
        Config.instance().appendStudent(s);
        System.out.println("Student added");
    }
}
