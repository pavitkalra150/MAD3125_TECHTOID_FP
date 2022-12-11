package com.techtoid.apps.madt3125_techtoid_fp.vViews;

import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class vRegistrationPageView {

    private static EditText et_fname;
    private static EditText et_lname;
    private static RadioGroup rg_gender;
    private static EditText et_salary;
    private static EditText et_occupationrate;
    private static EditText vehicle_model;
    private static EditText plate_Number;
    private static Spinner color;


    public static void initUIComponents(EditText firstName, EditText lastName, EditText salary, RadioGroup gender, EditText occupationRate, EditText vehicleModel, EditText plateNumber, Spinner colors){
       et_fname = firstName;
       et_lname = lastName;
       rg_gender = gender;
       et_salary = salary;
       et_occupationrate = occupationRate;
       vehicle_model = vehicleModel;
       plate_Number = plateNumber;
       color = colors;
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

    public static void RegisterIsClicked(){

        if(!showError()){
           System.out.println("error");
        }
        else{
            System.out.println("no error");
        }
    }


}
