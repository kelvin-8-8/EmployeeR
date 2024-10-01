package com.example;

import com.example.domain.*;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Sean", "A1234567", 50000);
        Employee employee2 = new Employee("Amy", "B9876543", 70000);

        employee1.displayInformation();
        employee2.displayInformation();

        System.out.println("Raise & Rename of Amy");
        employee2.setName("Amy Wang");
        employee2.raiseSalary(1000);

        employee1.displayInformation();
        employee2.displayInformation();
    }
}
