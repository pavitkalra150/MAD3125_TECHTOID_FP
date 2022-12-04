package com.techtoid.apps.madt3125_techtoid_fp.mvc.activities.mvcLoginPage;

public class ucController {
    public static class ucData {
        public static boolean isValid = true;
        public static void ucValidate() {
            String loginInputText = ucView.LoginInput.getText().toString();
            if(loginInputText.isEmpty()) {
                isValid = false;
                ucView.LoginInput.setError("Please Enter the Username");
                return;
            }
            if(loginInputText.contains(" ")) {
                isValid = false;
                ucView.LoginInput.setError("Username contains space");
                return;
            }
            isValid = true;
        }
    }
}
