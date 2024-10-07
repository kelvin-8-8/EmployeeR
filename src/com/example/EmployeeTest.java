package com.example;

import com.example.domain.*;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] employee = new Employee[5];
        employee[0] = new Employee("Sean", "A1234567", 50000);
        employee[1] = new Admin("Amy", "B210987654", 70000);
        employee[2] = new Engineer("David", "C109876543", 80000);
        employee[3] = new Manager("Louis", "D124680135", 100000, "TW Sales");
        employee[4] = new Director("Nicole", "R202468135", 120000, "Global Sales", 1000000);

        for (int i = 0; i < employee.length; i++) {
            employee[i].displayInformation();
        }

        System.out.println();
        System.out.println("Raise & Rename of Amy");
        employee[1].setName("Amy Wang");
        employee[1].raiseSalary(1000);


        System.out.println();
        System.out.println("David learn to code with Java, Python");
        if (employee[2] instanceof Engineer) {
            Engineer eng = (Engineer) employee[2];
            eng.addSkill("Java");
            eng.addSkill("Python");
        }

        System.out.println();
        System.out.println("Department assignment.....");
        if (employee[3] instanceof Manager) {
            Manager m = (Manager) employee[3];
            m.addEmployee(employee[0]);
            m.addEmployee(employee[1]);
            m.addEmployee(employee[2]);
        }

        ((Manager)employee[4]).addEmployee(employee[3]);

        for (int i = 0; i < employee.length; i++) {
            employee[i].displayInformation();
        }
    }
}
