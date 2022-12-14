package com.techtoid.apps.madt3125_techtoid_fp.dData;

public class EmployeeData {
    public String empID;
    public String et_fname;
    public String et_lname;
    public String fullname;
    public String age;
    public String gender;
    public String empType;
    public String bonus1;
    public String bonus2;
    public String salary;
    public String occupationrate;
    public String vehicle;
    public String vehicle_make;
    public String extra1;
    public String category;
    public String plateNumber;
    public String extra2;
    public String color;
    public static EmployeeData getEmployeeDataObjectFrom(String[] rec) {
        EmployeeData emp = new EmployeeData();
        emp.fullname = rec[0];
        emp.empType = rec[1];
        emp.gender = rec[2];
        emp.age = rec[3];
        emp.vehicle = rec[4];
        emp.vehicle_make = rec[5];
        emp.plateNumber = rec[6];
        emp.color = rec[7];
        emp.category = rec[8];
        emp.extra1 = rec[9];
        emp.extra2 = rec[10];
        emp.occupationrate = rec[11];
        emp.bonus1 = rec[12];
        emp.bonus2 = rec[13];
        emp.salary = rec[14];
        return emp;
    }
    public static String[] getStringArrayFromEmployeeDataObject(EmployeeData emp) {
        String[] res = new String[15];
        res[0] = emp.fullname;
        res[1] = emp.age;
        res[2] = emp.gender;
        res[3] = emp.empType;
        res[4] = emp.salary;
        res[5] = emp.occupationrate;
        res[6] = emp.bonus1;
        res[7] = emp.bonus2;
        res[8] = emp.vehicle;
        res[9] = emp.vehicle_make;
        res[10] = emp.plateNumber;
        res[11] = emp.color;
        res[12] = emp.category;
        res[13] = emp.extra1;
        res[14] = emp.extra2;
        return res;
    }
}
