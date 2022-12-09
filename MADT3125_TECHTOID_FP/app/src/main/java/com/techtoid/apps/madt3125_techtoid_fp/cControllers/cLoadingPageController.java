package com.techtoid.apps.madt3125_techtoid_fp.cControllers;

import com.techtoid.apps.madt3125_techtoid_fp.mModels.mLoadingPageModel;

public class cLoadingPageController {
    public static void loadData() {
        mLoadingPageModel.loadDataFromDatabase();
    }
}
