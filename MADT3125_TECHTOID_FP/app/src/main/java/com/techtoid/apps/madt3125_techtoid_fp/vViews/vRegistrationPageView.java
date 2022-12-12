package com.techtoid.apps.madt3125_techtoid_fp.vViews;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class vRegistrationPageView {

    private static EditText et_empID;
    private static EditText et_fname;
    private static EditText et_lname;
    private static EditText et_dob;
    private static TextView tv_male;
    private static TextView tv_female;
    private static Spinner spnr_empType;
    private static TextView tv_bonus1;
    private static EditText et_bonus1;
    private static TextView tv_bonus2;
    private static EditText et_bonus2;
    private static EditText et_salary;
    private static EditText et_occupationrate;
    private static TextView tv_car;
    private static TextView tv_motorcycle;
    private static Spinner spnr_vehicle_make;
    private static TextView tv_carType;
    private static Spinner spnr_carType;
    private static Spinner spnr_category;
    private static EditText et_plateNumber;
    private static TextView tv_gearType;
    private static Spinner spnr_gearType;
    private static Spinner spnr_color;
    private static LinearLayout lnr_sidecar;
    private static CheckBox chckbx_sidecar;


    public static void initUIComponents(
            EditText empID,
            EditText firstName,
            EditText lastName,
            EditText dob,
            TextView male,
            TextView female,
            Spinner empType,
            TextView tvbonus1,
            EditText etbonus1,
            TextView tvbonus2,
            EditText etbonus2,
            EditText salary,
            EditText occupationRate,
            TextView car,
            TextView motorcycle,
            Spinner vehicleMake,
            TextView tvCarType,
            Spinner spnrCarType,
            Spinner category,
            EditText plateNumber,
            TextView tvGearType,
            Spinner spnrGearType,
            Spinner color,
            LinearLayout lnrSideCar,
            CheckBox cbSideCar){
        et_empID = empID;
        et_fname = firstName;
        et_lname = lastName;
        et_dob = dob;
        tv_male = male;
        tv_female = female;
        spnr_empType = empType;
        tv_bonus1 = tvbonus1;
        et_bonus1 = etbonus1;
        tv_bonus2 = tvbonus2;
        et_bonus2 = etbonus2;
        et_salary = salary;
        et_occupationrate = occupationRate;
        tv_car = car;
        tv_motorcycle = motorcycle;
        spnr_vehicle_make = vehicleMake;
        tv_carType = tvCarType;
        spnr_carType = spnrCarType;
        spnr_category = category;
        et_plateNumber = plateNumber;
        tv_gearType = tvGearType;
        spnr_gearType = spnrGearType;
        spnr_color = color;
        lnr_sidecar = lnrSideCar;
        chckbx_sidecar = cbSideCar;
    }


    public static boolean showError(){
        String fName = et_fname.getText().toString();
        String lName = et_lname.getText().toString();
        String salary = et_salary.getText().toString();
        String occupationRate = et_occupationrate.getText().toString();
        String model = vehicle_model.getText().toString();
        String plate = plate_Number.getText().toString();


        if(fName.isEmpty()){
            et_fname.setError("Please give value for First Name");
            return false;
        }
        if(lName.isEmpty()){
            et_lname.setError("Please give value for Last Name");
            return false;
        }
        if(salary.isEmpty()){
            et_salary.setError("Please give value for Salary");
            return false;
        }
        if(occupationRate.isEmpty()){
            et_occupationrate.setError("Please give value for Occupation Rate");
            return false;
        }
        if(model.isEmpty()){
            vehicle_model.setError("Please give value for Vehicle Model");
            return false;
        }
        if(plate.isEmpty()){
            plate_Number.setError("Please give value for Plate number");
            return false;
        }
        return true;
    }

    public static void DateOfBirthClicked(View view) {


    }

    public static void RegisterIsClicked(){

        if(!showError()){
           System.out.println("error");
           return;
        }
        else{
            System.out.println("no error");
            return;
        }

    }

    public static void GenderButtonClicked(View view) {

    }
}
