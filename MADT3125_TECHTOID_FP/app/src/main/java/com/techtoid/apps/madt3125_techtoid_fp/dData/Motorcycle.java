package com.techtoid.apps.madt3125_techtoid_fp.dData;

public class Motorcycle extends Vehicle {
    private boolean _HasSideCar;
    public Motorcycle(String make, String plate, String color, String category, boolean hasSidecar) {
        super("Motorcycle", make, plate, color, category);
        this._HasSideCar = hasSidecar;
    }
    public boolean hasSidecar() {
        return this._HasSideCar;
    }
    public String toString() {
        return super.toString() + (hasSidecar() ? "with" : "without") + "#" + "null" + "#";
    }
}
