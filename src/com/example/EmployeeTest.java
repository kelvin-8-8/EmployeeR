package com.example;

import com.example.domain.*;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Sean", "A1234567", 50000);
        Admin employee2 = new Admin("Amy", "B210987654", 70000);
        Engineer employee3 = new Engineer("David", "C109876543", 80000);
        Manager employee4 = new Manager("Louis", "D124680135", 100000, "TW Sales");
        Director employee5 = new Director("Nicole", "R202468135", 120000, "Global Sales", 1000000);

        employee1.displayInformation();
        employee2.displayInformation();
        employee3.displayInformation();
        employee4.displayInformation();
        employee5.displayInformation();

        System.out.println("Raise & Rename of Amy");
        employee2.setName("Amy Wang");
        employee2.raiseSalary(1000);
        employee2.displayInformation();

        System.out.println("David learn to code with Java, Python");
        employee3.addSkill("Java");
        employee3.addSkill("Python");
        employee3.displayInformation();
    }
}
