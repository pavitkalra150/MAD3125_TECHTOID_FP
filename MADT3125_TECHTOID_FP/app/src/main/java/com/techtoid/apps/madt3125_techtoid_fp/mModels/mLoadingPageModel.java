package com.techtoid.apps.madt3125_techtoid_fp.mModels;

import com.techtoid.apps.madt3125_techtoid_fp.dData.dDatabase;

public class mLoadingPageModel {
    public static void loadDataFromDatabase() {
        dDatabase.Storage.loadDatabase();
    }
}
