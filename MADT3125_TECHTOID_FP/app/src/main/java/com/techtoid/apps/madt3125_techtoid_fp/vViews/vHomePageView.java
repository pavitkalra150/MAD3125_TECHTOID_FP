package com.techtoid.apps.madt3125_techtoid_fp.vViews;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.techtoid.apps.madt3125_techtoid_fp.EmployeeDetailsActivity;
import com.techtoid.apps.madt3125_techtoid_fp.R;
import com.techtoid.apps.madt3125_techtoid_fp.dData.dDatabase;
import com.techtoid.apps.madt3125_techtoid_fp.mModels.mHomePageList;
import com.techtoid.apps.madt3125_techtoid_fp.mModels.mListItem;
import com.techtoid.apps.madt3125_techtoid_fp.cControllers.cHomePageController;

import java.util.ArrayList;
import java.util.Locale;

public class vHomePageView {
    private static Context _context;
    private static FloatingActionButton uiAddNewEmployeeButton;
    private static ListView uiHomePageEmployeeList;
    private static ArrayList<mListItem> employeesList;
    public static mHomePageList numbersArrayAdapter;

    public static void initUIcomponents(FloatingActionButton floatingActionButton, ListView listView) {
        uiAddNewEmployeeButton = floatingActionButton;
        uiHomePageEmployeeList = listView;
    }

    public static ListView getUiHomePageEmployeeList() {
        return uiHomePageEmployeeList;
    }

    public static void setActivityContext(Context context) {
        _context = context;
    }

    public static void PageLoaded() {
        employeesList = new ArrayList<>();
        employeesList.addAll(cHomePageController.getEmployees());
        // the context and arrayList created above
        numbersArrayAdapter = new mHomePageList(_context, employeesList);

        // set the numbersViewAdapter for ListView
        uiHomePageEmployeeList.setAdapter(numbersArrayAdapter);
        if (dDatabase.iIntent._canShow) {
            String message = (dDatabase.iIntent._success) ? "Registration is Succesfull" : "Failed Registration";
            Toast.makeText(_context, message, Toast.LENGTH_LONG).show();
            dDatabase.iIntent._canShow = false;
        }
    }

    public static void filterData(String text) {
        ArrayList<mListItem> dbEmployeesList =cHomePageController.getEmployees();
        if (text.isEmpty()) {
            employeesList.clear();
            employeesList.addAll(dbEmployeesList);
            numbersArrayAdapter.notifyDataSetChanged();
            return;
        }
        ArrayList<mListItem> filteredEmployeesList = new ArrayList<>();
        for (int i = 0; i < dbEmployeesList.size(); i++) {
            mListItem item = dbEmployeesList.get(i);
            if (item.getmName().toLowerCase().contains(text) || item.getmRole().toLowerCase().contains(text))
                filteredEmployeesList.add(item);
        }
        employeesList.clear();
        employeesList.addAll(filteredEmployeesList);
        numbersArrayAdapter.notifyDataSetChanged();
    }

}
