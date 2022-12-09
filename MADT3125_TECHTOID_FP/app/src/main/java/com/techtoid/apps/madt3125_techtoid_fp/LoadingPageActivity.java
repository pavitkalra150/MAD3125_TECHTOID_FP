package com.techtoid.apps.madt3125_techtoid_fp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

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
    }
}
