package com.techtoid.apps.madt3125_techtoid_fp.cControllers;

import com.techtoid.apps.madt3125_techtoid_fp.mvc.cPageController;
import com.techtoid.apps.madt3125_techtoid_fp.mModels.mRegistrationPageModel;
import com.techtoid.apps.madt3125_techtoid_fp.vViews.vRegistrationPageView;
public class cRegistrationPageController extends cPageController {
    public static boolean registerEmployee(String firstName, String lastName, String dataOfBirth, String gender, String role, String bonus1, String bonus2,
                                        String salary, String occupationRate, String vehicle, String make, String category, String color, String plate,
                                        String extra1, String extra2, String extra3) {

        mRegistrationPageModel.addNewEmployeeToDatabase(firstName, lastName, dataOfBirth, gender, role, bonus1, bonus2, salary, occupationRate,
                vehicle, make, category, color, plate, extra1, extra2, extra3);
        return mRegistrationPageModel.employeeIsAdded;
    }
    public static int getNewEmployeeID() {
        return mRegistrationPageModel.getEmployeeIDcount();
    }
    public static boolean validateFields(){
        boolean errors = false;
//        vRegistrationPageView.et_fname.getText().toString();
        if(vRegistrationPageView.et_fname.getText().toString().isEmpty()){
            vRegistrationPageView.et_fname.setError("You should enter First Name");
            errors = true;
        }
        if(!vRegistrationPageView.et_fname.getText().toString().matches("[a-zA-Z]*")){
            vRegistrationPageView.et_fname.setError("You should enter proper first name");
            errors = true;
        }
        if(vRegistrationPageView.et_lname.getText().toString().isEmpty()){
            vRegistrationPageView.et_lname.setError("You should enter Last Name");
            errors = true;
        }
//        if(vRegistrationPageView.et_dob.getText().toString().isEmpty()){
//            vRegistrationPageView.et_dob.setError("you sholud select date of birth");
//            errors = true;
//        }
        if(!vRegistrationPageView.et_lname.getText().toString().matches("[a-zA-Z]*")){
            vRegistrationPageView.et_lname.setError("You should enter proper last name");
            errors = true;
        }
        if(vRegistrationPageView.et_salary.getText().toString().isEmpty()){
            vRegistrationPageView.et_salary.setError("You should enter salary");
            errors = true;
        }
        if(vRegistrationPageView.et_occupationrate.getText().toString().isEmpty()){
            vRegistrationPageView.et_occupationrate.setError("You should enter Occupational Rate");
            errors = true;
        }
        if(!vRegistrationPageView.et_occupationrate.getText().toString().isEmpty()) {
            int rate = Integer.parseInt(vRegistrationPageView.et_occupationrate.getText().toString());
            if (rate<10||rate>100) {
                vRegistrationPageView.et_occupationrate.setError("You should enter value between 10 to 100");
                errors = true;
            }
        }
        switch (vRegistrationPageView.spnr_empType.getSelectedItemPosition()){
            case 0:
                if(vRegistrationPageView.et_bonus2.getText().toString().isEmpty()){
                    vRegistrationPageView.et_bonus2.setError("You should enter no of days travelled");
                    errors = true;
                }
            case 1:
                if(!vRegistrationPageView.et_bonus2.getText().toString().isEmpty()){}
            case 2:
                if(!vRegistrationPageView.et_bonus2.getText().toString().isEmpty()){
                }
        }
        if(vRegistrationPageView.et_bonus1.getText().toString().isEmpty()){
            vRegistrationPageView.et_bonus1.setError("You should fill the above field");
            errors = true;
        }

        if(vRegistrationPageView.et_plateNumber.getText().toString().isEmpty()){
            vRegistrationPageView.et_plateNumber.setError("You should enter plate number");
            errors = true;
        }
        return errors;
    }
}
