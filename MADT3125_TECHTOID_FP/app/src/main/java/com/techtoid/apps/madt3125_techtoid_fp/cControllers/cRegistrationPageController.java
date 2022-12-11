package com.techtoid.apps.madt3125_techtoid_fp.cControllers;

import com.techtoid.apps.madt3125_techtoid_fp.mvc.cPageController;
import com.techtoid.apps.madt3125_techtoid_fp.mModels.mRegistrationPageModel;
public class cRegistrationPageController extends cPageController {
    public static void registerEmployee(String firstName, String lastName, String dataOfBirth, String gender, String role, String bonus1, String bonus2,
                                        String salary, String occupationRate, String vehicle, String make, String category, String color, String plate,
                                        String extra1, String extra2) {

        mRegistrationPageModel.addNewEmployeeToDatabase(firstName, lastName, dataOfBirth, gender, role, bonus1, bonus2, salary, occupationRate,
                vehicle, make, category, color, plate, extra1, extra2);
    }
}
