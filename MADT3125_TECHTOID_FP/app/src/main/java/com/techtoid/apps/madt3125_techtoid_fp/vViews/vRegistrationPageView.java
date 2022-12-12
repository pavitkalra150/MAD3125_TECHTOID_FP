package com.techtoid.apps.madt3125_techtoid_fp.vViews;

import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import com.techtoid.apps.madt3125_techtoid_fp.cControllers.cRegistrationPageController;
import org.w3c.dom.Text;

public class vRegistrationPageView {

    private static EditText et_empID;
    private static EditText et_fname;
    private static EditText et_lname;
    private static TextView et_dob;
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
            TextView dob,
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
        et_empID.setText(cRegistrationPageController.getNewEmployeeID());
        spnr_empType.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                EmployeeTypeItemSelected(adapterView, view, i, l);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }


    public static boolean showError(){
        String fName = et_fname.getText().toString();
        String lName = et_lname.getText().toString();
        String salary = et_salary.getText().toString();
        String occupationRate = et_occupationrate.getText().toString();
//        String model = vehicle_model.getText().toString();
//        String plate = plate_Number.getText().toString();


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
//        if(model.isEmpty()){
//            vehicle_model.setError("Please give value for Vehicle Model");
//            return false;
//        }
//        if(plate.isEmpty()){
//            plate_Number.setError("Please give value for Plate number");
//            return false;
//        }
        return true;
    }

    public static void DateOfBirthClicked(View view) {


    }

    public static void RegisterIsClicked(){

        if(!showError()){
           System.out.println("error");
        }
        cRegistrationPageController.registerEmployee(
                et_fname.getText().toString(),
                et_lname.getText().toString(),
                et_dob.getText().toString(),
                getSelectedGender(),
                getSelectedEmployeeType(),
                et_bonus1.getText().toString(),
                et_bonus2.getText().toString(),
                et_salary.getText().toString(),
                et_occupationrate.getText().toString(),
                getSelectedVehicle(),
                getVehicleMakeTypeSelected(),
                getCategorySelected(),
                getColorSelected(),
                et_plateNumber.getText().toString(),
                getCarTypeSelected(),
                getGearTypeSelected(),
                getSideCarChecked()
        );
    }
    public static String getVehicleMakeTypeSelected() {
        return "";
    }
    public static String getCarTypeSelected() {
        return "";
    }
    public static String getCategorySelected() {
        return "";
    }
    public static String getGearTypeSelected() {
        return "";
    }
    public static String getColorSelected() {
        return "";
    }
    public static String getSideCarChecked() {
        return "";
    }
    public static void EmployeeTypeItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        if(i == 0) {
            tv_bonus2.setVisibility(View.VISIBLE);
            et_bonus2.setVisibility(View.VISIBLE);
            tv_bonus1.setText("Clients");
        } else if(i == 1) {
            tv_bonus2.setVisibility(View.GONE);
            et_bonus2.setVisibility(View.GONE);
            tv_bonus1.setText("Projects");
        } else if(i == 2) {
            tv_bonus2.setVisibility(View.GONE);
            et_bonus2.setVisibility(View.GONE);
            tv_bonus1.setText("Bugs");
        }
    }
    public static String getSelectedEmployeeType() {
        switch(spnr_empType.getSelectedItemPosition()) {
            case 0 : return "Manager";
            case 1 : return "Programmer";
            case 2 : return "Tester";
            default : return "";
        }
    }
    public static void GenderButtonClicked(View view) {
        if(view.getId() == tv_male.getId()) {
            tv_male.setAlpha((float)0);
            tv_female.setAlpha((float)0.75);
        } else if(view.getId() == tv_female.getId()) {
            tv_female.setAlpha(0);
            tv_male.setAlpha((float)0.75);
        }
    }
    public static String getSelectedGender() {
        if(tv_male.getAlpha() == (float)0) {
            return "Male";
        } else if(tv_female.getAlpha() == (float)0.75) {
            return "Female";
        }
        return "";
    }
    public static void VehicleButtonClicked(View view) {
        if(view.getId() == tv_car.getId()) {
            tv_car.setAlpha((float)0);
            tv_motorcycle.setAlpha((float)0.75);

            //TODO Vehicle Make Spinner change to Car Companies

            tv_carType.setVisibility(View.VISIBLE);
            spnr_carType.setVisibility(View.VISIBLE);
            tv_gearType.setVisibility(View.VISIBLE);
            spnr_gearType.setVisibility(View.VISIBLE);
            lnr_sidecar.setVisibility(View.GONE);

        } else if(view.getId() == tv_motorcycle.getId()) {
            tv_motorcycle.setAlpha((float)0);
            tv_car.setAlpha((float)0.75);

            //TODO Vehicle Make Spinner change to Motorcycle Companies

            tv_carType.setVisibility(View.GONE);
            spnr_carType.setVisibility(View.GONE);
            tv_gearType.setVisibility(View.GONE);
            spnr_gearType.setVisibility(View.GONE);
            lnr_sidecar.setVisibility(View.VISIBLE);
        }
    }
    public static String getSelectedVehicle() {
        if(tv_car.getAlpha() == (float)0) {
            return "Car";
        } else if(tv_motorcycle.getAlpha() == (float)0) {
            return "Motorycyle";
        }
        return "";
    }
}
