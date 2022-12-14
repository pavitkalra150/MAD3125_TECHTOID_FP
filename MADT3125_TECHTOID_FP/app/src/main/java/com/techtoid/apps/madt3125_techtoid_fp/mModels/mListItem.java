package com.techtoid.apps.madt3125_techtoid_fp.mModels;

public class mListItem {

    // the resource ID for the imageView
    private int ivNumbersImageId;

    // TextView 1
    private String mName;

    // TextView 1
    private String mRole;

    private int mEmpId;

    // create constructor to set the values for all the parameters of the each single view
    public mListItem(int NumbersImageId, String Name, String Role, int empId) {
        ivNumbersImageId = NumbersImageId;
        mName = Name;
        mRole = Role;
        mEmpId = empId;
    }

    // getter method for returning the ID of the imageview
    public int getNumbersImageId() {
        return ivNumbersImageId;
    }

    // getter method for returning the ID of the TextView 1
    public String getmName() {
        return mName;
    }

    // getter method for returning the ID of the TextView 2
    public String getmRole() {
        return mRole;
    }

    public int getmEmpId() {
        return mEmpId;
    }
}

