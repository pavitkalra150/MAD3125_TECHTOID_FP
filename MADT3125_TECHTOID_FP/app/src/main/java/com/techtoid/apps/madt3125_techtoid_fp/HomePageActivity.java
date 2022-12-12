package com.techtoid.apps.madt3125_techtoid_fp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

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
        vHomePageView.setActivityContext(HomePageActivity.this);
        vHomePageView.initUIcomponents(findViewById(R.id.idFABadd), findViewById(R.id.listView));
        dDatabase.Employees.initializeDataInDatabase();
        vHomePageView.getUiHomePageEmployeeList().setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(HomePageActivity.this, "Item Clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(HomePageActivity.this, EmployeeDetailsActivity.class);
                intent.putExtra("ID",i);
                startActivity(intent);
            }
        });

    }
    public void newOnClick(View v) {
        startActivity(new Intent(HomePageActivity.this, RegistrationPageActivity.class));
    }

    @Override
    protected void onResume() {
        super.onResume();
        vHomePageView.PageLoaded();
    }
}
