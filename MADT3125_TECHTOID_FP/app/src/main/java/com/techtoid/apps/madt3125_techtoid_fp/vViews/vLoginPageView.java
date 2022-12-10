package com.techtoid.apps.madt3125_techtoid_fp.vViews;

import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.techtoid.apps.madt3125_techtoid_fp.mvc.vPageView;
import com.techtoid.apps.madt3125_techtoid_fp.cControllers.cLoginPageController;

public class vLoginPageView extends vPageView {
    private static TextView uiHeadingLabel;
    private static EditText uiLoginInput;
    private static ImageView uiNextButton;
    enum State { USERNAME, PASSWORD }
    private static State LoginState = State.USERNAME;
    public static boolean userIsAuthenticated = false;
    public static void initUIComponents(TextView textviewHeading, EditText editextLoginInput, ImageView buttonNext) {
        uiHeadingLabel = textviewHeading;
        uiLoginInput = editextLoginInput;
        uiNextButton = buttonNext;
    }
    public static void NextButtonClicked() {
        String loginInput = uiLoginInput.getText().toString();
        if(LoginState == State.USERNAME) {
            boolean inputIsNotValid = cLoginPageController.validateInput(loginInput);
            if(inputIsNotValid) {
                setUIInputError(cLoginPageController.inputValidationErrorMessage());
                return;
            }
            boolean usernameNotFound = cLoginPageController.verifyUserName(loginInput);
            if(usernameNotFound) {
                setUIInputError(cLoginPageController.usernameVerificationErrorMessage());
                return;
            }
            setUItoPassword(cLoginPageController.getUserFullName());
            LoginState = State.PASSWORD;
        } else if(LoginState == State.PASSWORD) {
            boolean passwordIsIncorrect = cLoginPageController.verifyPassword(loginInput);
            if(passwordIsIncorrect) {
                setUIInputError(cLoginPageController.passwordIncorrectErrorMessage());
                return;
            }
            userIsAuthenticated = true;
        }
    }
    public static void startHomePageActivity() {
        uiHeadingLabel.setText("Successfully Logged In");
        //TODO : @RishiVarma : Create Intent and Start New Activity
    }
    public static void setUIInputError(String message) {
        //TODO : @SaiSumanth : Implement UI modification code for setting EditText Input Error
    }
    public static void setUItoPassword(String fullname) {
        uiHeadingLabel.setText(fullname);
        //TODO : @SaiSumanth : Change Login UI Layout to Password with
    }
}
