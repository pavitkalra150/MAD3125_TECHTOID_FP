package com.techtoid.apps.madt3125_techtoid_fp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.techtoid.apps.madt3125_techtoid_fp.mvc.*;
import com.techtoid.apps.madt3125_techtoid_fp.mvc.app.*;

public class LoadingPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loadingpage);
        ucAppModel.ucContext.setApplicationContext(LoadingPageActivity.this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        ucHeader.ucRunner.ucDelay(()-> ucAppController.ucIntent.ucStartActivity(LoginPageActivity.class),ucHeader.ucConstants.ucDuration.MEDIUM);
    }
}