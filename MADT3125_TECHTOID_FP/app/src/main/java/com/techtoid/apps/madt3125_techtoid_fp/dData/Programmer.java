package com.techtoid.apps.madt3125_techtoid_fp.dData;

public class Programmer extends Employee {
    private int _Projects;
    public Programmer(int id, String name, int birthYear, String gender, int projects, double salary, double occupationRate, Vehicle vehicle) {
        super(id, name, birthYear, gender, occupationRate, salary , "Programmer", vehicle);
        this._Projects = projects;
        print();
    }
    public int getProjects() {
        return this._Projects;
    }
    public double getAnnualIncome() {
        double baseAnnualIncome = super.getAnnualIncome();
        double projectBonus = getProjects() * 200;
        return baseAnnualIncome + projectBonus;
    }
    public String toString() {
        return super.toString() + getProjects() + "#" + "null" + "#" + getAnnualIncome() + "&";
    }

}
