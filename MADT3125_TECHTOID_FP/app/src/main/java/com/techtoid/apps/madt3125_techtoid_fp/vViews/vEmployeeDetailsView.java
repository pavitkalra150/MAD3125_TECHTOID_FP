package com.techtoid.apps.madt3125_techtoid_fp.vViews;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;

import com.techtoid.apps.madt3125_techtoid_fp.R;
import com.techtoid.apps.madt3125_techtoid_fp.cControllers.cEmployeeDetailsController;
import com.techtoid.apps.madt3125_techtoid_fp.dData.Employee;
import com.techtoid.apps.madt3125_techtoid_fp.dData.EmployeeData;

public class vEmployeeDetailsView {
    private static Context _context;
    public static ImageView uiGenderImage;
    public static TextView uiNameLabel;
    public static TextView uiAgeLabel;
    public static TextView uiEmpIdLabel;
    public static TextView uiEmpTypeLabel;
    public static TextView uiBonus1Label;
    public static TextView uiBonus2Label;
    public static TextView uiSalaryLabel;
    public static TextView uiOccupationRateLabel;
    public static ImageView uiVehicleImage;
    public static TextView uiVehicleMakeLabel;
    public static TextView uiVehiclePlateLabel;
    public static TextView uiVehicleColorLabel;
    public static TextView uiVehicleCategoryLabel;
    public static TextView uiVehicleExtra1Label;
    public static TextView uiVehicleExtra2Label;
    public static void setActivityContext(Context context) {
        _context = context;
    }
    public static void initUIComponents(
            ImageView gender,
            TextView name,
            TextView age,
            TextView empType,
            TextView salary,
            TextView occupationRate,
            TextView vehicleType,
            TextView make,
            TextView plate,
            TextView color
            ) {
        uiGenderImage = gender;
        uiNameLabel = name;
        uiAgeLabel = age;
        uiEmpTypeLabel = empType;
        uiSalaryLabel = salary;
        uiOccupationRateLabel = occupationRate;
        uiVehicleCategoryLabel = vehicleType;
        uiVehicleMakeLabel = make;
        uiVehiclePlateLabel = plate;
        uiVehicleColorLabel = color;
    }
    public static void PageIsCreated(int index) {
        EmployeeData employee = cEmployeeDetailsController.getEmployeeDetails(index);
        uiGenderImage.setImageResource(R.drawable.male);
        if(employee.gender.equalsIgnoreCase("Female")) uiGenderImage.setImageResource(R.drawable.female);
        uiNameLabel.setText(employee.fullname);
        uiAgeLabel.setText(employee.age);
        uiEmpTypeLabel.setText(employee.empType);
        uiSalaryLabel.setText(employee.salary);
        uiOccupationRateLabel.setText(employee.occupationrate);
        uiVehicleCategoryLabel.setText(employee.category);
        uiVehicleMakeLabel.setText(employee.vehicle_make);
        uiVehiclePlateLabel.setText(employee.plateNumber);
        uiVehicleColorLabel.setText(employee.color);
    }
}
