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
    }

    @Override
    protected void onResume() {
        super.onResume();
        ucAppModel.ucContext.setCurrentActivityContext(LoadingPageActivity.this);
        ucHeader.ucRunner.ucDelay(()->
                ucAppController.ucIntent.ucStartActivity(LoginPageActivity.class),
                ucHeader.ucConstants.ucDuration.XSHORT);
    }
}
