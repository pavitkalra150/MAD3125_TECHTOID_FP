package com.techtoid.apps.madt3125_techtoid_fp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import com.techtoid.apps.madt3125_techtoid_fp.dData.dDatabase;
import com.techtoid.apps.madt3125_techtoid_fp.mModels.mListItem;
import com.techtoid.apps.madt3125_techtoid_fp.mModels.mHomePageList;
import com.techtoid.apps.madt3125_techtoid_fp.vViews.vHomePageView;

import java.util.ArrayList;

public class HomePageActivity extends AppCompatActivity {


    private SearchView search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        ListView listView = findViewById(R.id.listView);
        vHomePageView.setActivityContext(HomePageActivity.this);
        vHomePageView.initUIcomponents(findViewById(R.id.idFABadd), findViewById(R.id.listView));
        dDatabase.Employees.initializeDataInDatabase();
        search = findViewById(R.id.simpleSearchView);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(HomePageActivity.this, "Item Clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(HomePageActivity.this, EmployeeDetailsActivity.class);
                mListItem item = (mListItem) adapterView.getAdapter().getItem(i);
                intent.putExtra("ID", item.getmEmpId());
                startActivity(intent);
            }
        });

        search.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                vHomePageView.filterData(s);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                vHomePageView.filterData(s);
                return false;
            }
        });

    }

    public void newOnClick(View v) {
        startActivity(new Intent(HomePageActivity.this, RegistrationPageActivity.class));
    }

    @Override
    protected void onResume() {
        super.onResume();
        if(search!=null) {
            search.setIconified(true);
        }
        vHomePageView.PageLoaded();
    }
}
