package com.techtoid.apps.madt3125_techtoid_fp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import com.techtoid.apps.madt3125_techtoid_fp.vViews.vEmployeeDetailsView;

public class EmployeeDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employeedetails);
        vEmployeeDetailsView.setActivityContext(EmployeeDetailsActivity.this);
        vEmployeeDetailsView.tv_name = findViewById(R.id.name);
        vEmployeeDetailsView.PageIsCreated(getIntent().getIntExtra("ID",0));
    }
}