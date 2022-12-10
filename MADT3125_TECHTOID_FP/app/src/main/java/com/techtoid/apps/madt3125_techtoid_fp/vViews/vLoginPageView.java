package com.techtoid.apps.madt3125_techtoid_fp.vViews;

import static android.content.Context.INPUT_METHOD_SERVICE;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.text.InputType;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.techtoid.apps.madt3125_techtoid_fp.LoginPageActivity;
import com.techtoid.apps.madt3125_techtoid_fp.RegistrationPageActivity;
import com.techtoid.apps.madt3125_techtoid_fp.mvc.vPageView;
import com.techtoid.apps.madt3125_techtoid_fp.cControllers.cLoginPageController;

public class vLoginPageView extends vPageView {
    private static Context _context;
    private static final long LoadingTime = TIME_SHORT;
    private static TextView uiHeadingLabel, uiBack2UsernameLabel;
    private static EditText uiLoginInput;
    private static ProgressBar uiLoginProgressBar;
    private static ImageButton uiNextButton;
    enum State { USERNAME, PASSWORD }
    private static State LoginState = State.USERNAME;
    public static boolean userIsAuthenticated = false;
    public static String username;
    public static void setActivityContext(Context context) { _context = context; }
    public static void initUIComponents(TextView textviewHeading, TextView textviewBack2Username, EditText editextLoginInput, ImageButton imagebuttonNext, ProgressBar progressbarLogin) {
        uiHeadingLabel = textviewHeading;
        uiBack2UsernameLabel = textviewBack2Username;
        uiLoginInput = editextLoginInput;
        uiNextButton = imagebuttonNext;
        uiLoginProgressBar = progressbarLogin;
    }
    public static void NextButtonClicked(View view) {
        hideVirtualKeyboard(view);
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
            uiLoginProgressBar.setVisibility(View.VISIBLE);
            (new Handler()).postDelayed(()->{
                uiLoginProgressBar.setVisibility(View.INVISIBLE);
                username = cLoginPageController.getUserFullName();
                setUItoPassword(username);
            },LoadingTime);
            LoginState = State.PASSWORD;
        } else if(LoginState == State.PASSWORD) {
            boolean passwordIsIncorrect = cLoginPageController.verifyPassword(loginInput);
            if(passwordIsIncorrect) {
                setUIInputError(cLoginPageController.passwordIncorrectErrorMessage());
                return;
            }
            uiLoginProgressBar.setVisibility(View.VISIBLE);
            userIsAuthenticated = true;
        }
    }
    public static void BackButtonClicked(View view) {
        hideVirtualKeyboard(view);
        uiLoginProgressBar.setVisibility(View.VISIBLE);
        if(LoginState == State.USERNAME) {
            return;
        }
        (new Handler()).postDelayed(()->{
            uiLoginProgressBar.setVisibility(View.INVISIBLE);
            setUItoUsername();
        },TIME_XSHORT);
    }
    public static void startHomePageActivity(Class<?> targetActivity) {
        (new Handler()).postDelayed(()->{
            uiLoginProgressBar.setVisibility(View.INVISIBLE);
            uiLoginInput.setVisibility(View.INVISIBLE);
            uiBack2UsernameLabel.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            uiHeadingLabel.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            uiNextButton.setVisibility(View.INVISIBLE);
            uiBack2UsernameLabel.setText("WELCOME");
            uiHeadingLabel.setText(username);
            (new Handler()).postDelayed(()->_context.startActivity(new Intent(_context, targetActivity)),TIME_SHORT);
        },LoadingTime);
    }
    public static void setUIInputError(String message) {
        uiLoginProgressBar.setVisibility(View.VISIBLE);
        (new Handler()).postDelayed(()-> {
            uiLoginProgressBar.setVisibility(View.INVISIBLE);
            uiLoginInput.setError(message);
        },LoadingTime);
    }
    public static void setUItoPassword(String fullname) {
        uiBack2UsernameLabel.setVisibility(View.VISIBLE);
        uiHeadingLabel.setText("Hi "+fullname);
        uiLoginInput.setText("");
        uiLoginInput.setHint("Enter your Password");
        uiLoginInput.setInputType(129);
    }
    public static void setUItoUsername() {
        uiBack2UsernameLabel.setVisibility(View.INVISIBLE);
        uiHeadingLabel.setText("Hello there");
        uiLoginInput.setText("a");
        uiLoginInput.setText("");
        uiLoginInput.setHint("Enter your Username");
        uiLoginInput.setInputType(InputType.TYPE_CLASS_TEXT);
        LoginState = State.USERNAME;
    }
    public static void hideVirtualKeyboard(View v) {
        try {
            InputMethodManager inputMethodManager = (InputMethodManager)_context.getSystemService(INPUT_METHOD_SERVICE);
            inputMethodManager.hideSoftInputFromWindow(v.getApplicationWindowToken(),0);
        } catch(Exception e) {}

    }
}
