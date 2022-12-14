package com.techtoid.apps.madt3125_techtoid_fp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import com.techtoid.apps.madt3125_techtoid_fp.vViews.vLoginPageView;

public class LoginPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);
        vLoginPageView.initUIComponents(
                findViewById(R.id.txtvw_heading_label),
                findViewById(R.id.txtvw_back2username),
                findViewById(R.id.edtxt_login_input),
                findViewById(R.id.imgbtn_next),
                findViewById(R.id.prgsbr_login));
    }

    @Override
    protected void onStart() {
        super.onStart();
        vLoginPageView.setActivityContext(LoginPageActivity.this);
    }

    public void nextClicked(View view) {
        vLoginPageView.NextButtonClicked(view);
        if(vLoginPageView.userIsAuthenticated) {
            vLoginPageView.startHomePageActivity(HomePageActivity.class);
            (new Handler()).postDelayed(()-> {
                startActivity(new Intent(LoginPageActivity.this, HomePageActivity.class));
                finish();
            },2000);
        }
    }
    public void backClicked(View view) {
        vLoginPageView.BackButtonClicked(view);
    }
}