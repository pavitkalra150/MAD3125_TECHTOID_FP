package com.techtoid.apps.madt3125_techtoid_fp.dData;

import java.time.LocalDate;

public abstract class Employee {
    private String _Name;
    private int _ID;
    private int _BirthYear;
    private String _Gender;
    private double _MonthlyIncome;
    private double _OccupationRate;
    private String _Role;
    private Vehicle _Vehicle;
    private static final int DEFAULT_OCC_RATE = 100;
//    public Employee(int id, String name, int birthYear, long monthlyIncome, double occupationRate) {
//        this._ID = id;
//        this._Name = name;
//        this._BirthYear = birthYear;
//        this._MonthlyIncome = monthlyIncome;
//        this._OccupationRate = validateOccupationRate(occupationRate);
//    }
//    public Employee(int id, String name, int birthYear, String role) {
//        this._ID = id;
//        this._Name = name;
//        this._BirthYear = birthYear;
//        this._OccupationRate = DEFAULT_OCC_RATE;
//        this._Role = role;
//    }
//    public Employee(int id, String name, int birthYear, double occupationRate, String role) {
//        this._ID = id;
//        this._Name = name;
//        this._BirthYear = birthYear;
//        this._OccupationRate = validateOccupationRate(occupationRate);
//        this._Role = role;
//    }
//    public Employee(int id, String name, int birthYear, String role, Vehicle vehicle) {
//        this._ID = id;
//        this._Name = name;
//        this._BirthYear = birthYear;
//        this._OccupationRate = DEFAULT_OCC_RATE;
//        this._Role = role;
//        this._Vehicle = vehicle;
//    }
    public Employee(int id, String name, int birthYear, String gender, double occupationRate, double salary, String role, Vehicle vehicle) {
        this._ID = id;
        this._Name = name;
        this._BirthYear = birthYear;
        this._Gender = gender;
        this._OccupationRate = validateOccupationRate(occupationRate);
        this._MonthlyIncome = salary;
        this._Role = role;
        this._Vehicle = vehicle;
    }
    public int getAge() {
        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();
        return currentYear - this._BirthYear;
    }
    public void setID(int id) { this._ID = id; }
    public int getID() { return this._ID; }
    public void setName(String name) {
        this._Name = name;
    }
    public String getName() {
        return this._Name;
    }
    public void setBirthYear(int year) {
        this._BirthYear = year;
    }
    public int getBirthYear() {
        return this._BirthYear;
    }
    public String getGender() { return this._Gender; }
    public void setGender(String gender) { this._Gender = gender; }
    public void setMonthlyIncome(long monthlyIncome) {
        this._MonthlyIncome = monthlyIncome;
    }
    public double getMonthlyIncome() {
        return this._MonthlyIncome;
    }
    public void setOccupationRate(int occupationRate) {
        this._OccupationRate = occupationRate;
    }
    public double getOccupationRate() {
        return this._OccupationRate;
    }
    public void setRole(String role) {
        this._Role = role;
    }
    public String getRole() {
        return this._Role;
    }
    public Vehicle getVehicle() {
        return this._Vehicle;
    }
    public double getAnnualIncome() {
        return this._MonthlyIncome * 12;
    }
    public double validateOccupationRate(double occupationRate) {
        return (occupationRate > 100) ? 100 : (Math.max(occupationRate, 10));
    }
    public String contractInfo() {
        return this.getName() + ", a " + this.getRole() + ".";
    }
    public void print() {
        System.out.println("We have a new Employee: " + getName() + ", a " + getRole());
    }
    public String toString() {
        String desc = "$" + getName() + "#" + getRole() + "#" + getAge() + "#";
        Vehicle vehicle = getVehicle();
        if (vehicle != null) {
            desc += vehicle + "#";
        }
        desc += getOccupationRate() + "#";
        return desc;
    }

}
