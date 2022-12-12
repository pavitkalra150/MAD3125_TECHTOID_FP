package com.techtoid.apps.madt3125_techtoid_fp.mModels;

import com.techtoid.apps.madt3125_techtoid_fp.mvc.mPageModel;
import com.techtoid.apps.madt3125_techtoid_fp.dData.*;

public class mRegistrationPageModel extends mPageModel {
    public static void addNewEmployeeToDatabase(String firstName, String lastName, String dateOfBirth, String gender, String role, String bonus1, String bonus2,
                                                String salary, String occupationRate, String vehicle, String make, String category, String color, String plate,
                                                String extra1, String extra2, String extra3) {
//        Vehicle _vehicle = new ;
//        Employee _employee;
        String year = dateOfBirth.substring(dateOfBirth.indexOf('/',dateOfBirth.indexOf('/')+1),dateOfBirth.length()-1);
        if(role.equals("Manager")) {
            dDatabase.Employees.addNewEmployeeToEmployeeList(new Manager(dDatabase.Employees.getIDcount(),(firstName+" "+lastName),Integer.parseInt(year),
                    gender,Integer.parseInt(bonus1),Integer.parseInt(bonus2), Double.parseDouble(salary),Double.parseDouble(occupationRate),
                    (vehicle.equals("Car")?(new Car(make, plate, color, category, extra1, extra2)):
                            (vehicle.equals("Motorcycle"))?(new Motorcycle(make, plate, color, category, Boolean.parseBoolean(extra3))):null)));
        } else if(role.equals("Programmer")) {
            dDatabase.Employees.addNewEmployeeToEmployeeList(new Programmer(dDatabase.Employees.getIDcount(),(firstName+" "+lastName),Integer.parseInt(year),
                    gender,Integer.parseInt(bonus1), Double.parseDouble(salary),Double.parseDouble(occupationRate),
                    (vehicle.equals("Car")?(new Car(make, plate, color, category, extra1, extra2)):
                            (vehicle.equals("Motorcycle"))?(new Motorcycle(make, plate, color, category, Boolean.parseBoolean(extra3))):null)));
        } else if(role.equals("Tester")) {
            dDatabase.Employees.addNewEmployeeToEmployeeList(new Programmer(dDatabase.Employees.getIDcount(),(firstName+" "+lastName),Integer.parseInt(year),
                    gender,Integer.parseInt(bonus1), Double.parseDouble(salary),Double.parseDouble(occupationRate),
                    (vehicle.equals("Car")?(new Car(make, plate, color, category, extra1, extra2)):
                            (vehicle.equals("Motorcycle"))?(new Motorcycle(make, plate, color, category, Boolean.parseBoolean(extra3))):null)));
        }
    }
    public static int getEmployeeIDcount() {
        return dDatabase.Employees.getIDcount();
    }
}
