package com.techtoid.apps.madt3125_techtoid_fp.mModels;

import com.techtoid.apps.madt3125_techtoid_fp.dData.*;

import java.util.ArrayList;

public class mHomePageModel {
    public static ArrayList<Employee> getEmployeeList() {
        return dDatabase.Employees.getEmployeeListFromDatabase();
    }
}
