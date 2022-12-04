package com.techtoid.apps.madt3125_techtoid_fp.mvc.app;

import android.content.Intent;

import com.techtoid.apps.madt3125_techtoid_fp.mvc.ucHeader;

public class ucAppController extends ucHeader {
    public static class ucIntent {
        public static void ucStartActivity(Class<?> cls) {
            ucAppModel.ucContext.getCurrentActivityContext().startActivity(new Intent(ucAppModel.ucContext.getCurrentActivityContext(),cls));
        }
        public static void ucStartActivityAndCloseCurrentActivity(Class<?> cls) {
            ucAppModel.ucContext.getCurrentActivityContext().startActivity(new Intent(ucAppModel.ucContext.getCurrentActivityContext(),cls));
        }
    }
}

