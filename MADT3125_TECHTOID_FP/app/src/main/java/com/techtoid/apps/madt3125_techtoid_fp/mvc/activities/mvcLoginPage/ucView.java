package com.techtoid.apps.madt3125_techtoid_fp.mvc.activities.mvcLoginPage;

import android.annotation.SuppressLint;
import android.text.InputType;
import android.view.View;
import android.widget.*;

public class ucView {
    protected static TextView HeadingLabel;
    protected static EditText LoginInput;
    protected static ImageView NextIconButton;
    public static void ucInitializeView(TextView headingLabel, EditText loginInput, ImageView nextIconButton) {
        HeadingLabel = headingLabel;
        LoginInput = loginInput;
        NextIconButton = nextIconButton;
    }
    public static void ucChangeToUserLabelAndPasswordInput() {
        HeadingLabel.setText("Hello "+LoginInput.getText().toString());
        LoginInput.setText("");
        LoginInput.setHint("Enter your Password");
        System.out.println("InputType Code : "+LoginInput.getInputType());
        LoginInput.setInputType(129);
    }
    public static void ucSetOnClickListenerToNextIconButton(View.OnClickListener onClickListener) {

    }
}
