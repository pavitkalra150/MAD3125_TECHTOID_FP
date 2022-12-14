package com.techtoid.apps.madt3125_techtoid_fp.mModels;

import com.techtoid.apps.madt3125_techtoid_fp.dData.dDatabase;

import java.io.IOException;

public class mLoadingPageModel {
    public static void loadDataFromDatabase() {
        dDatabase.Storage.callDatabase();
        if(!dDatabase.Storage.fileExists()) {
            dDatabase.Storage.createDataFile();
        }
        dDatabase.Storage.pullDataFromFile();
        dDatabase.Storage.parseSeedData();
        dDatabase.Storage.loadSeedDataIntoDatabase();
    }
}
