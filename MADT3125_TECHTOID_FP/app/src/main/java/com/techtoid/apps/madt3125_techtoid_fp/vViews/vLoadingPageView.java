package com.techtoid.apps.madt3125_techtoid_fp.vViews;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

import com.techtoid.apps.madt3125_techtoid_fp.LoginPageActivity;
import com.techtoid.apps.madt3125_techtoid_fp.cControllers.cLoadingPageController;

public class vLoadingPageView {
    private static Activity _activity;
    private static Context _context;
    public static void setActivityContext(Context context) { _context = context; }
    public static void onViewLoaded() {
        cLoadingPageController.loadData();

        (new Handler()).postDelayed(()-> _context.startActivity(new Intent(_context, LoginPageActivity.class)),1000);
    }

}
