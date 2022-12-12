package com.techtoid.apps.madt3125_techtoid_fp.vViews;

import android.content.Context;
import android.widget.ListView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.techtoid.apps.madt3125_techtoid_fp.R;
import com.techtoid.apps.madt3125_techtoid_fp.mModels.mHomePageList;
import com.techtoid.apps.madt3125_techtoid_fp.mModels.mListItem;
import com.techtoid.apps.madt3125_techtoid_fp.cControllers.cHomePageController;

import java.util.ArrayList;

public class vHomePageView {
    private static FloatingActionButton uiAddNewEmployeeButton;
    private static ListView uiHomePageEmployeeList;
    public static void initUIcomponents(FloatingActionButton floatingActionButton, ListView listView) {
        uiAddNewEmployeeButton = floatingActionButton;
        uiHomePageEmployeeList = listView;
    }
    public static void PageLoaded(Context context) {
        // the context and arrayList created above
        mHomePageList numbersArrayAdapter = new mHomePageList(context, cHomePageController.getEmployees());

        // set the numbersViewAdapter for ListView
        uiHomePageEmployeeList.setAdapter(numbersArrayAdapter);

    }

}
