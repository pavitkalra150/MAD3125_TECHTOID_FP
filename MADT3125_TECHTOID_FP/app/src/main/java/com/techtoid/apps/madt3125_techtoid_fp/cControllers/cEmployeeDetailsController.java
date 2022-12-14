package com.techtoid.apps.madt3125_techtoid_fp.cControllers;

import com.techtoid.apps.madt3125_techtoid_fp.dData.Employee;
import com.techtoid.apps.madt3125_techtoid_fp.dData.EmployeeData;
import com.techtoid.apps.madt3125_techtoid_fp.mModels.mEmployeeDetailsModel;

public class cEmployeeDetailsController {
    public static EmployeeData getEmployeeDetails(int index) {
        return mEmployeeDetailsModel.getEmployeeFromDatabase(index);
    }
    public static void deleteEmployee(int index) {
        mEmployeeDetailsModel.deleteEmployeeFromDatabase(index);
    }
}
