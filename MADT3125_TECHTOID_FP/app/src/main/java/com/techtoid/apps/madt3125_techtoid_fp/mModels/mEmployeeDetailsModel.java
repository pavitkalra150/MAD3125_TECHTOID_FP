package com.techtoid.apps.madt3125_techtoid_fp.mModels;

import com.techtoid.apps.madt3125_techtoid_fp.dData.*;

public class mEmployeeDetailsModel {
    public static EmployeeData getEmployeeFromDatabase(int index) {
        String strEmp = dDatabase.Employees.getEmployeeDataFromEmployeeList(index);
        System.out.println(strEmp);

        EmployeeData empData = new EmployeeData();
        empData.et_fname = strEmp;
        return empData;
    }
}
