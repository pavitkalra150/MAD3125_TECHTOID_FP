package com.techtoid.apps.madt3125_techtoid_fp.mvc.app;

import android.content.Intent;

import com.techtoid.apps.madt3125_techtoid_fp.mvc.ucHeader;

public class ucAppController extends ucHeader {
    public static class ucIntent {
        public static void ucStartActivity(Class<?> cls) {
            ucAppModel.ucContext.getActivityContext().startActivity(new Intent(ucAppModel.ucContext.getActivityContext(),cls));
        }
    }
}
