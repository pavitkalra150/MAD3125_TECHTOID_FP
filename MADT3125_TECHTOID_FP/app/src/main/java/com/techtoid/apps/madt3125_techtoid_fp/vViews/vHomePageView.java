package com.techtoid.apps.madt3125_techtoid_fp.vViews;

import android.widget.ListView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class vHomePageView {
    private static FloatingActionButton uiAddNewEmployeeButton;
    private static ListView uiHomePageEmployeeList;
    public static void initUIcomponents(FloatingActionButton floatingActionButton, ListView listView) {
        uiAddNewEmployeeButton = floatingActionButton;
        uiHomePageEmployeeList = listView;
    }
}
