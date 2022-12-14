package com.techtoid.apps.madt3125_techtoid_fp.mModels;

import com.techtoid.apps.madt3125_techtoid_fp.dData.*;

public class mLoginPageModel {
    private static dDatabase.UserClass _currentUser;
    public static boolean verifyUserNameFromDatabase(String username) {
        dDatabase.Users.verifyUsername(username);
        if(dDatabase.Users.usernameIsNotValid) {
            return true;
        }
        _currentUser = dDatabase.Users.getUserData();
        return false;
    }
    public static String getVerifiedUserFirstName() { return _currentUser.getFirstname();}
    public static String getVerifiedUserFullname() {
        return _currentUser.getFullname();
    }
    public static boolean verifyPasswordForCurrentUsername(String password) { return !_currentUser.getPassword().equals(password); }
}
