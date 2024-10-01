package com.example.domain;

public class Director extends Manager{
    private double budget;

    public Director(String name, String ssn, double salary, String deptName, double budget) {
        super(name, ssn, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Budget: " + formatter.format(budget));
    }
}
