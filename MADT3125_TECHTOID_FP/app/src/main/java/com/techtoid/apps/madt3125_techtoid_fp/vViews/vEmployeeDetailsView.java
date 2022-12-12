package com.techtoid.apps.madt3125_techtoid_fp.vViews;

import android.content.Context;
import com.techtoid.apps.madt3125_techtoid_fp.cControllers.cEmployeeDetailsController;
import com.techtoid.apps.madt3125_techtoid_fp.dData.Employee;
import com.techtoid.apps.madt3125_techtoid_fp.dData.EmployeeData;

public class vEmployeeDetailsView {
    private static Context _context;
    public static void setActivityContext(Context context) {
        _context = context;
    }
    public static void PageIsCreated(int index) {
        EmployeeData employee = cEmployeeDetailsController.getEmployeeDetails(index);

    }
}
