package com.techtoid.apps.madt3125_techtoid_fp.cControllers;

import com.techtoid.apps.madt3125_techtoid_fp.mModels.mLoginPageModel;

public class cLoginPageController {
    private static String validationErrorMessage = "";
    public static boolean verifyUserName(String username) {
        return mLoginPageModel.verifyUserNameFromDatabase(username);
    }
    public static boolean validateInput(String username) {
        //TODO : @SaiSumanth : Implement Input Data Validation
        //TODO : @SaiSumanth : If Input is Not Valid, Set Error Message in {errorMessage} variable
        return false;
    }
    public static String inputValidationErrorMessage() { return validationErrorMessage; }
    public static String usernameVerificationErrorMessage() { return "Username Not Found !"; }
    public static String getUserFullName() {
        return mLoginPageModel.getVerifiedUserFullname();
    }
    public static boolean verifyPassword(String password) {
        return mLoginPageModel.verifyPasswordForCurrentUsername(password);
    }
    public static String passwordIncorrectErrorMessage() { return "Password is Incorrect !"; }
}
