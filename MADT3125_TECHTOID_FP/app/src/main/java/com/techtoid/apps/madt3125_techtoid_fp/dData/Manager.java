package com.techtoid.apps.madt3125_techtoid_fp.dData;

public class Manager extends Employee {
    private int _TravelDays;
    private int _NewClients;
    public Manager(int id, String name, int birthYear, String gender, int newClients, int travelDays, double salary, double occupationRate, Vehicle vehicle) {
        super(id, name, birthYear, gender, occupationRate, salary, "Manager", vehicle);
        this._NewClients = newClients;
        this._TravelDays = travelDays;
        print();
    }
    public int getNewClients() {
        return this._NewClients;
    }
    public int getTravelDays() {
        return this._TravelDays;
    }
    public double getAnnualIncome() {
        double baseAnnualIncome = super.getAnnualIncome();
        double projectBonus = getNewClients() * 500;
        double travelBonus = getTravelDays() * 100;
        return baseAnnualIncome + projectBonus + travelBonus;
    }
    public String toString() {
        return super.toString() + getTravelDays() + "#" + getNewClients() + "#" + getAnnualIncome() + "&";
    }

}
