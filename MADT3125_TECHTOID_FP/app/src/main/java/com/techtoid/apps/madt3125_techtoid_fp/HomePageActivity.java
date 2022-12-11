package com.techtoid.apps.madt3125_techtoid_fp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.techtoid.apps.madt3125_techtoid_fp.mModels.mListItem;
import com.techtoid.apps.madt3125_techtoid_fp.mModels.mHomePageModel;
import com.techtoid.apps.madt3125_techtoid_fp.vViews.vHomePageView;

import java.util.ArrayList;

public class HomePageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        vHomePageView.initUIcomponents(findViewById(R.id.idFABadd), findViewById(R.id.listView));

        ArrayList<mListItem> arrayList = new ArrayList<mListItem>();


        // the items are of the type NumbersView
        arrayList.add(new mListItem(R.drawable.male, "Rishi", "Developer"));
        arrayList.add(new mListItem(R.drawable.female, "Simran", "Tester"));
        arrayList.add(new mListItem(R.drawable.male, "Pavit", "Bug"));
        arrayList.add(new mListItem(R.drawable.male, "Sai", "Developer"));
        arrayList.add(new mListItem(R.drawable.female, "Emma", "Emma"));

        // creating the instance
        // the context and arrayList created above
        mHomePageModel numbersArrayAdapter = new mHomePageModel(this, arrayList);

        // create the instance of the ListView to set the numbersViewAdapter
        ListView numbersListView = findViewById(R.id.listView);

        // set the numbersViewAdapter for ListView
        numbersListView.setAdapter(numbersArrayAdapter);
    }
    public void newOnClick(View v) {
        startActivity(new Intent(HomePageActivity.this, RegistrationPageActivity.class));
    }

}
