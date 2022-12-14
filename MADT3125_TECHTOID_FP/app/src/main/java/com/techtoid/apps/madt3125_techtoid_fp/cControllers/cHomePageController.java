package com.techtoid.apps.madt3125_techtoid_fp.cControllers;

import com.techtoid.apps.madt3125_techtoid_fp.R;
import com.techtoid.apps.madt3125_techtoid_fp.mModels.*;

import java.util.ArrayList;
import com.techtoid.apps.madt3125_techtoid_fp.dData.*;

public class cHomePageController {
    public static ArrayList<mListItem> getEmployees() {
         ArrayList<Employee> empList = mHomePageModel.getEmployeeList();
         ArrayList<mListItem> homePageList = new ArrayList<>();
         for(Employee emp : empList) {
             int imageRes;
             imageRes = R.drawable.male;
             if(emp.getGender().equals("Female")) imageRes = R.drawable.female;
             homePageList.add(new mListItem(imageRes,emp.getName(),emp.getRole(), emp.getID()));
         }
         return homePageList;
    }
    public static void saveData() {
        mHomePageModel.saveDataToDatabase();
    }
}
