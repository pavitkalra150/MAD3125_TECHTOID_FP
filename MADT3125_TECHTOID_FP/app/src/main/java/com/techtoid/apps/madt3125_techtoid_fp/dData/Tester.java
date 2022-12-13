package com.techtoid.apps.madt3125_techtoid_fp.dData;

public class Tester extends Employee {
    private int _Bugs;
    public Tester(int id, String name, int birthYear, String gender, int bugs, double salary, double occupationRate, Vehicle vehicle) {
        super(id, name, birthYear, gender, occupationRate, salary, "Tester", vehicle);
        this._Bugs = bugs;
        print();
    }
    public int getBugs() {
        return this._Bugs;
    }
    public double getAnnualIncome() {
        double baseAnnualIncome = super.getAnnualIncome();
        double projectBonus = getBugs() * 500;
        return baseAnnualIncome + projectBonus;
    }
    public String toString() {
        return super.toString() + getBugs() + "#" + "null" + "#" + getAnnualIncome();
    }

}
