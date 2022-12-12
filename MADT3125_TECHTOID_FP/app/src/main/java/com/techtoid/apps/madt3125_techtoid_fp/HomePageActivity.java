package com.techtoid.apps.madt3125_techtoid_fp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.techtoid.apps.madt3125_techtoid_fp.dData.dDatabase;
import com.techtoid.apps.madt3125_techtoid_fp.mModels.mListItem;
import com.techtoid.apps.madt3125_techtoid_fp.mModels.mHomePageList;
import com.techtoid.apps.madt3125_techtoid_fp.vViews.vHomePageView;

import java.util.ArrayList;

public class HomePageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        vHomePageView.initUIcomponents(findViewById(R.id.idFABadd), findViewById(R.id.listView));

    }
    public void newOnClick(View v) {
        startActivity(new Intent(HomePageActivity.this, RegistrationPageActivity.class));
    }

    @Override
    protected void onResume() {
        super.onResume();
        vHomePageView.PageLoaded(HomePageActivity.this);
    }
}
