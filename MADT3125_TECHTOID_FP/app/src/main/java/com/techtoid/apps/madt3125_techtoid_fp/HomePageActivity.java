package com.techtoid.apps.madt3125_techtoid_fp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.techtoid.apps.madt3125_techtoid_fp.mModels.mListItem;
import com.techtoid.apps.madt3125_techtoid_fp.mModels.mHomePageModel;

import java.util.ArrayList;

public class HomePageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        FloatingActionButton addNewContactFAB = findViewById(R.id.idFABadd);

        // adding on click listener for our fab.
        addNewContactFAB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // opening a Registration activity.
                Intent i = new Intent(HomePageActivity.this, RegistrationPageActivity.class);
                startActivity(i);
            }
        });
        final ArrayList<mListItem> arrayList = new ArrayList<mListItem>();


        // the items are of the type NumbersView
        arrayList.add(new mListItem(R.drawable.male, "1", "Rishi"));
        arrayList.add(new mListItem(R.drawable.female, "2", "Simran"));
        arrayList.add(new mListItem(R.drawable.male, "3", "Pavit"));
        arrayList.add(new mListItem(R.drawable.male, "4", "Sai"));
        arrayList.add(new mListItem(R.drawable.female, "5", "Emma"));

        // creating the instance
        // the context and arrayList created above
        mHomePageModel numbersArrayAdapter = new mHomePageModel(this, arrayList);

        // create the instance of the ListView to set the numbersViewAdapter
        ListView numbersListView = findViewById(R.id.listView);

        // set the numbersViewAdapter for ListView
        numbersListView.setAdapter(numbersArrayAdapter);
    }

    }
