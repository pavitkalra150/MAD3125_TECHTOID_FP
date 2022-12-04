package com.techtoid.apps.madt3125_techtoid_fp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.techtoid.apps.madt3125_techtoid_fp.mvc.*;
import com.techtoid.apps.madt3125_techtoid_fp.mvc.app.*;
import com.techtoid.apps.madt3125_techtoid_fp.mvc.activities.mvcLoginPage.*;

public class LoginPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);
        ucView.ucInitializeView(
                findViewById(R.id.txtvw_heading_label),
                findViewById(R.id.edtxt_login_input),
                findViewById(R.id.btn_icon_next));
    }
    public void nextClicked(View view) {
        ucController.ucData.ucValidate();
        if(ucController.ucData.isValid){
            ucView.ucChangeToUserLabelAndPasswordInput();
        }
    }
}