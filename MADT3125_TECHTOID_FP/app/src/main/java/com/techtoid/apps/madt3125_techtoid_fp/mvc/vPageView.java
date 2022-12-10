package com.techtoid.apps.madt3125_techtoid_fp.mvc;

import android.content.Context;

public class vPageView extends mvcBase {
    private static Context _context;
    public static void setActivityContext(Context context) { _context = context; }
    public static Context getActivityContext() { return _context; }
}
