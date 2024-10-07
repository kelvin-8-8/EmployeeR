package com.example.domain;

public class Engineer extends Employee{
    private String[] skills;
    private int skillCount;

    public Engineer(String name, String ssn, double salary) {
        super(name, ssn, salary);
        skills = new String[5];
        skillCount = 0;
    }

    public void addSkill(String skill) {
        if (skillCount < 5) {
            skills[skillCount++] = skill;
        }
        else {
            System.out.println("Maximum skills only up to five. Add skill fail.");
        }
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        if (skillCount > 0) {
            System.out.print("Skills:");
            for (int i = 0; i < skillCount; i++) {
                System.out.print(" " + skills[i]);
            }
            System.out.println();
        }
    }
}
