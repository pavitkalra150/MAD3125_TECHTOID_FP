package com.techtoid.apps.madt3125_techtoid_fp.mvc;

import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class ucHeader {
    public static class ucConstants {
        public static class ucDuration {
            public static final long LONG = 5000;
            public static final long MEDIUM = 3000;
            public static final long SHORT = 2000;
            public static final long XSHORT = 1000;
        }
    }
    public static class ucRunner {
        public static void ucDelay(Runnable runnable, long milliseconds) {
            (new Handler()).postDelayed(runnable,milliseconds);
        }
    }
}
