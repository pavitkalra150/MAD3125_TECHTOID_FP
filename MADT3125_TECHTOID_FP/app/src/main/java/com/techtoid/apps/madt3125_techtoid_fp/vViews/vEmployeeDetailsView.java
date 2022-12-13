package com.techtoid.apps.madt3125_techtoid_fp.vViews;

import android.content.Context;
import android.view.View;
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
    public static TextView uiBonus1Lbl;
    public static TextView uiBonus1txt;
    public static TextView uiBonus2Lbl;
    public static TextView uiBonus2txt;
    public static TextView uiSalaryLabel;
    public static TextView uiOccupationRateLabel;
    public static ImageView uiVehicleImage;
    public static TextView uiSidecarLabel;
    public static TextView uiSidecarText;
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
            TextView bonus1lbl,
            TextView uiBonus1,
            TextView bonus2lbl,
            TextView uiBonus2,
            TextView salary,
            TextView occupationRate,
            TextView sidecarlbl,
            TextView sidecartxt,
            TextView category,
            TextView model,
            TextView plate,
            TextView color
            ) {
        uiGenderImage = gender;
        uiNameLabel = name;
        uiAgeLabel = age;
        uiEmpTypeLabel = empType;
        uiBonus1Lbl = bonus1lbl;
        uiBonus1txt = uiBonus1;
        uiBonus2Lbl = bonus2lbl;
        uiBonus2txt = uiBonus2;
        uiSalaryLabel = salary;
        uiOccupationRateLabel = occupationRate;
        uiVehicleCategoryLabel = category;
        uiSidecarLabel = sidecarlbl;
        uiSidecarText = sidecartxt;
        uiVehicleMakeLabel = model;
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
        if (employee.empType.equals("Manager")) {
            uiBonus1txt.setText(employee.bonus2);
            uiBonus2txt.setText(employee.bonus1);
        }
        if(employee.empType.equals("Programmer")) {
            uiBonus1Lbl.setText("Projects");
            uiBonus1txt.setText(employee.bonus1);
            uiBonus2Lbl.setVisibility(View.GONE);
            uiBonus2txt.setVisibility(View.GONE);
        }
        if(employee.empType.equals("Tester")) {
            uiBonus1Lbl.setText("Bugs");
            uiBonus1txt.setText(employee.bonus1);
            uiBonus2Lbl.setVisibility(View.GONE);
            uiBonus2txt.setVisibility(View.GONE);
        }
        if(employee.vehicle.equals("Car")){
            uiSidecarLabel.setVisibility(View.GONE);
            uiSidecarText.setVisibility(View.GONE);
        }
        if(employee.vehicle.equals("Motorcycle")){
            uiSidecarLabel.setText("Side Car");
            String res = ((employee.extra1.equals("with"))?"has":((employee.extra1.equals("without"))?"doesn't have":null));
            uiSidecarText.setText("It "+ res + " a Side Car");
        }
        uiSalaryLabel.setText(employee.salary);
        uiOccupationRateLabel.setText(employee.occupationrate);
        uiVehicleCategoryLabel.setText(employee.category);
        uiVehicleMakeLabel.setText(employee.vehicle_make);
        uiVehiclePlateLabel.setText(employee.plateNumber);
        uiVehicleColorLabel.setText(employee.color);
    }
}
