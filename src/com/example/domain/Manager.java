package com.example.domain;

public class Manager extends Employee {
    private String deptName;

    public Manager(String name, String ssn, double salary, String deptName) {
        super(name, ssn, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Department: " + deptName);
    }
}
