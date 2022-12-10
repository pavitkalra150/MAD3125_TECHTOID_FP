package com.techtoid.apps.madt3125_techtoid_fp.mModels;

public class mListItem {

        // the resource ID for the imageView
        private int ivNumbersImageId;

        // TextView 1
        private String mNumberInDigit;

        // TextView 1
        private String mText;

        // create constructor to set the values for all the parameters of the each single view
        public mListItem(int NumbersImageId, String NumbersInDigit, String Text) {
            ivNumbersImageId = NumbersImageId;
            mNumberInDigit = NumbersInDigit;
            mText = Text;
        }

        // getter method for returning the ID of the imageview
        public int getNumbersImageId() {
            return ivNumbersImageId;
        }

        // getter method for returning the ID of the TextView 1
        public String getNumberInDigit() {
            return mNumberInDigit;
        }

        // getter method for returning the ID of the TextView 2
        public String getNumbersInText() {
            return mText;
        }
    }

