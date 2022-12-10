package com.techtoid.apps.madt3125_techtoid_fp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.techtoid.apps.madt3125_techtoid_fp.vViews.vLoadingPageView;

public class LoadingPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loadingpage);
        vLoadingPageView.setActivityContext(LoadingPageActivity.this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        vLoadingPageView.onViewLoaded();
        (new Handler()).postDelayed(()-> startActivity(new Intent(LoadingPageActivity.this, LoginPageActivity.class)),1000);
//        finish();
    }
}
