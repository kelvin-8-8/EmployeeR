package com.example.domain;

public class Employee {
    public static int nextId = 1;
    private int empId ;
    private String name;
    private String ssn;
    private double salary;

    // Constructor
    public Employee(String name, String ssn, double salary) {
        this.empId = nextId++;
        if (name != null && name.isEmpty()) {
            this.name = name;
        }
        if (ssn != null && ssn.isEmpty()) {
            this.ssn = ssn;
        }
        if (salary > 27490) {
            this.salary = salary;
        }
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public String getSsn() {
        return ssn;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        if (name != null && name.length() != 0) {
            this.name = name;
        }
        else {
            System.out.println("Fail to change name (argument invalid)!");
        }
    }

    public void raiseSalary(double salary) {
        if (salary > 0) {
            this.salary += salary;
        }
        else {
            System.out.println("Fail to raise salary (argument invalid)");
        }
    }

    public void displayInformation() {
        System.out.println("====Employee INFO====");
        System.out.println("No.: " + this.empId);
        System.out.println("Name: " + this.name);
        System.out.println("SSN: " + this.ssn);
        System.out.println("Salary: " + this.salary);
    }
}
