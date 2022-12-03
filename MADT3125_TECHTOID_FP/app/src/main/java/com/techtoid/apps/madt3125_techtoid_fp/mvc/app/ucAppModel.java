package com.techtoid.apps.madt3125_techtoid_fp.mvc.app;

import android.content.Context;

import com.techtoid.apps.madt3125_techtoid_fp.mvc.ucHeader;

public class ucAppModel extends ucHeader {
    public static class ucContext {
        protected static Context _context;
        public static void setActivityContext(Context context) {
            _context = context;
        }
        public static Context getActivityContext() {
            return _context;
        }
    }
}
