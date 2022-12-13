package com.techtoid.apps.madt3125_techtoid_fp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.techtoid.apps.madt3125_techtoid_fp.cControllers.cEmployeeDetailsController;
import com.techtoid.apps.madt3125_techtoid_fp.vViews.vEmployeeDetailsView;

public class EmployeeDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employeedetails);
        vEmployeeDetailsView.setActivityContext(EmployeeDetailsActivity.this);
        vEmployeeDetailsView.initUIComponents(
                findViewById(R.id.display),
                findViewById(R.id.ename),
                findViewById(R.id.DOB),
                findViewById(R.id.Emp_type),
                findViewById(R.id.salary),
                findViewById(R.id.occRate),
                findViewById(R.id.vehicle_type),
                findViewById(R.id.category),
                findViewById(R.id.model),
                findViewById(R.id.vehicle_color)
        );
        vEmployeeDetailsView.PageIsCreated(getIntent().getIntExtra("ID",0));

        findViewById(R.id.delete).setOnClickListener(this::onClick);
    }

    public void onClick(View view) {
        switch (view.getId()){
            case R.id.delete:
                cEmployeeDetailsController.deleteEmployee(getIntent().getIntExtra("ID",0));
                finish();
                break;
        }
    }
}