package com.techtoid.apps.madt3125_techtoid_fp.mModels;

import com.techtoid.apps.madt3125_techtoid_fp.mvc.mPageModel;
import com.techtoid.apps.madt3125_techtoid_fp.dData.*;

public class mRegistrationPageModel extends mPageModel {
    public static boolean employeeIsAdded = false;
    public static void addNewEmployeeToDatabase(String firstName, String lastName, String dateOfBirth, String gender, String role, String bonus1, String bonus2,
                                                String salary, String occupationRate, String vehicle, String make, String category, String color, String plate,
                                                String extra1, String extra2, String extra3) {
//        Vehicle _vehicle = new ;
//        Employee _employee;
        String year = getYear(dateOfBirth);
        if(role.equals("Manager")) {
            dDatabase.Employees.addNewEmployeeToEmployeeList(new Manager(dDatabase.Employees.getIDcount(),(firstName+" "+lastName),Integer.parseInt(year),
                    gender,Integer.parseInt(bonus1),Integer.parseInt(bonus2), Double.parseDouble(salary),Double.parseDouble(occupationRate),
                    (vehicle.equals("Car")?(new Car(make, plate, color, category, extra1, extra2)):
                            (vehicle.equals("Motorcycle"))?(new Motorcycle(make, plate, color, category, Boolean.parseBoolean(extra3))):null)));
            employeeIsAdded = true;
        } else if(role.equals("Programmer")) {
            dDatabase.Employees.addNewEmployeeToEmployeeList(new Programmer(dDatabase.Employees.getIDcount(),(firstName+" "+lastName),Integer.parseInt(year),
                    gender,Integer.parseInt(bonus1), Double.parseDouble(salary),Double.parseDouble(occupationRate),
                    (vehicle.equals("Car")?(new Car(make, plate, color, category, extra1, extra2)):
                            (vehicle.equals("Motorcycle"))?(new Motorcycle(make, plate, color, category, Boolean.parseBoolean(extra3))):null)));
            employeeIsAdded = true;
        } else if(role.equals("Tester")) {
            dDatabase.Employees.addNewEmployeeToEmployeeList(new Tester(dDatabase.Employees.getIDcount(),(firstName+" "+lastName),Integer.parseInt(year),
                    gender,Integer.parseInt(bonus1), Double.parseDouble(salary),Double.parseDouble(occupationRate),
                    (vehicle.equals("Car")?(new Car(make, plate, color, category, extra1, extra2)):
                            (vehicle.equals("Motorcycle"))?(new Motorcycle(make, plate, color, category, Boolean.parseBoolean(extra3))):null)));
            employeeIsAdded = true;
        }
    }git
    public static int getEmployeeIDcount() {
        return dDatabase.Employees.getIDcount();
    }

    public static String getYear(String dateOfBirth) {
        System.out.println("Date of Birth : " + dateOfBirth);
        int index1 = dateOfBirth.indexOf('/');
        System.out.println("Index 1 : "+index1);
        int index2 = dateOfBirth.indexOf('/',index1+1);
        System.out.println("Index 2 : "+index2);
        int length = dateOfBirth.length();
        System.out.println("Length : " + length);
        String year = dateOfBirth.substring(index2+1);
        System.out.println("Year : " + year);
        return year;
    }
}
