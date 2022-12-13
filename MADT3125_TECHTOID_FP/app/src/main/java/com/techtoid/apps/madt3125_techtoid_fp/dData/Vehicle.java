package com.techtoid.apps.madt3125_techtoid_fp.dData;

public abstract class Vehicle {
    private String _VehicleType;
    private String _Make;
    private String _Plate;
    private String _Color;
    private String _Category;
    public Vehicle(String vechileType, String make, String plate, String color, String category) {
        this._VehicleType =vechileType;
        this._Make = make;
        this._Plate = plate;
        this._Color = color;
        this._Category = category;
    }
    public String getVehicleType() { return this._VehicleType; }
    public String getMake() {
        return this._Make;
    }
    public String getPlate() {
        return this._Plate;
    }
    public String getColor() {
        return this._Color;
    }
    public String getCategory() {
        return this._Category;
    }
    public String toString() {
        return getVehicleType() + "#" + getMake() + "#" + getPlate() + "#" + getColor() + "#" + getCategory() + "#";
    }

}
