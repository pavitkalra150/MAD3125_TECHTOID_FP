package com.techtoid.apps.madt3125_techtoid_fp.dData;

public class Car extends Vehicle {
    private String _Gear;
    private String _Type;
    public Car(String make, String plate, String color, String category, String gear, String type) {
        super(make, plate, color, category);
        this._Gear = gear;
        this._Type = type;
    }
    public String getGear() {
        return this._Gear;
    }
    public String getType() {
        return this._Type;
    }
    public String toString() {
        return super.toString() + getGear() + "#" + getType() + "#";
    }
}
