package com.example.domain;

import java.util.ArrayList;

public class Manager extends Employee {
    private String deptName;
    private ArrayList employees;

    public Manager(String name, String ssn, double salary, String deptName) {
        super(name, ssn, salary);
        this.deptName = deptName;
        employees = new ArrayList();
    }

    public String getDeptName() {
        return deptName;
    }

    public boolean addEmployee(Employee e) {
        if (employees.contains(e)) {
            return false;
        }
        else {
            employees.add(e);
            return true;
        }
    }

    public boolean removeEmployee(Employee e) {
        if (employees.contains(e)) {
            employees.remove(e);
            return true;
        }
        else {
            return false;
        }
    }

    public void printStaffDetails() {
        if(!employees.isEmpty()) {
            System.out.print(this.getName() + " manage staffs: ");
            for (Object obj : employees) {
                if (obj instanceof Employee) {
                    Employee e = (Employee) obj;
                    System.out.printf(" %s(%d)", e.getName(), e.getEmpId());
                }
            }
            System.out.println();
        }
    }

    public String getStaffDetails() {
        StringBuilder stringbuilder = new StringBuilder();
        if (employees.size() > 0) {
            stringbuilder.append(getName() + "is the manager of");
            for (Object obj : employees) {
                if (obj instanceof Employee) {
                    Employee e = (Employee) obj;
                    stringbuilder.append(String.format(" %s(%d)", e.getName(), e.getEmpId()));
                }
            }
            stringbuilder.append("\n");
        }
        return stringbuilder.toString();
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Department: " + deptName);
        this.printStaffDetails();
    }
}
