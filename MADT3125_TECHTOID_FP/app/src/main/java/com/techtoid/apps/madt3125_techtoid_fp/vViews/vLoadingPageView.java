package com.techtoid.apps.madt3125_techtoid_fp.vViews;

import android.content.Intent;
import android.os.Handler;

import com.techtoid.apps.madt3125_techtoid_fp.mvc.vPageView;
import com.techtoid.apps.madt3125_techtoid_fp.LoginPageActivity;
import com.techtoid.apps.madt3125_techtoid_fp.cControllers.cLoadingPageController;

public class vLoadingPageView extends vPageView{
    public static void onViewLoaded() {
        cLoadingPageController.loadData();
    }
}
