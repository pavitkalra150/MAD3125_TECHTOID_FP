package com.techtoid.apps.madt3125_techtoid_fp.mModels;

import com.techtoid.apps.madt3125_techtoid_fp.dData.*;

public class mEmployeeDetailsModel {
    public static EmployeeData getEmployeeFromDatabase(int index) {
        final int empid = 0;
        final int fullname = 1;
        final int age = 4;
        final int gender = 3;
        final int emptype = 2;
        final int bonus1 = 13;
        final int bonus2 = 14;
        final int salary = 15;
        final int occupationrate = 12;
        final int vehicle = 5;
        final int vehiclemake = 6;
        final int category = 9;
        final int platenumber = 7;
        final int color = 8;
        final int extra1 = 10;
        final int extra2 = 11;

        String strEmp = dDatabase.Employees.getEmployeeDataFromEmployeeList(index);
        System.out.println(strEmp);
        String[] data = strEmp.split("#");
        EmployeeData empData = new EmployeeData();
        empData.empID = data[empid];
        empData.fullname = data[fullname];
        empData.age = data[age];
        empData.gender = data[gender];
        empData.empType = data[emptype];
        empData.salary = data[salary];
        empData.occupationrate = data[occupationrate];
        empData.bonus1 = data[bonus1];
        empData.bonus2 = data[bonus2];
        empData.vehicle = data[vehicle];
        empData.vehicle_make = data[vehiclemake];
        empData.plateNumber = data[platenumber];
        empData.color = data[color];
        empData.category = data[category];
        empData.extra1 = data[extra1];
        empData.extra2 = data[extra2];
        return empData;
    }
    public static EmployeeData getEmployeeDataObject(int index) {
        final int fullname = 0;
        final int age = 1;
        final int gender = 2;
        final int emptype = 3;
        final int salary = 4;
        final int occupationrate = 5;
        final int bonus1 = 6;
        final int bonus2 = 7;
        final int vehicle = 8;
        final int vehiclemake = 9;
        final int platenumber = 10;
        final int color = 11;
        final int category = 12;
        final int extra1 = 13;
        final int extra2 = 14;

        String strEmp = dDatabase.Employees.getEmployeeDataFromEmployeeList(index);
        System.out.println(strEmp);
        String[] data = strEmp.split("#");
        EmployeeData empData = new EmployeeData();
        empData.empID = String.valueOf(index);
        empData.fullname = data[fullname];
        empData.age = data[age];
        empData.gender = data[gender];
        empData.empType = data[emptype];
        empData.salary = data[salary];
        empData.occupationrate = data[occupationrate];
        empData.bonus1 = data[bonus1];
        empData.bonus2 = data[bonus2];
        empData.vehicle = data[vehicle];
        empData.vehicle_make = data[vehiclemake];
        empData.plateNumber = data[platenumber];
        empData.color = data[color];
        empData.category = data[category];
        empData.extra1 = data[extra1];
        empData.extra2 = data[extra2];
        return empData;
    }
    public static void deleteEmployeeFromDatabase(int id){
        dDatabase.Employees.deleteEmployeeFromEmployeeList(id);
    }

}
