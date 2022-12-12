package com.techtoid.apps.madt3125_techtoid_fp;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import com.techtoid.apps.madt3125_techtoid_fp.vViews.vLoginPageView;
import com.techtoid.apps.madt3125_techtoid_fp.vViews.vRegistrationPageView;

import java.util.Calendar;

public class RegistrationPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrationpage);
        final TextView DOB = findViewById(R.id.et_birthYear);

        vRegistrationPageView.initUIComponents(
                findViewById(R.id.et_fname),
                findViewById(R.id.et_lname),
                findViewById(R.id.et_salary),
//                findViewById(R.id.rg_gender),
                findViewById(R.id.et_occupationrate),
                findViewById(R.id.car_category),
                findViewById(R.id.plate_Number),
                findViewById(R.id.color));


        DOB.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                //To show current date in the datepicker
                Calendar mcurrentDate=Calendar.getInstance();
                int year = mcurrentDate.get(Calendar.YEAR);
                int month = mcurrentDate.get(Calendar.MONTH);
                int day = mcurrentDate.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog mDatePicker=new DatePickerDialog(RegistrationPageActivity.this, new DatePickerDialog.OnDateSetListener() {
                    public void onDateSet(DatePicker datepicker, int selectedYear, int selectedMonth, int selectedDay) {
                        // TODO Auto-generated method stub
                        Log.e("Date Selected", "Month: " + selectedMonth + " Day: " + selectedDay + " Year: " + selectedYear);
                        DOB.setText(selectedMonth + "/" + selectedDay + "/" + selectedYear);
                    }
                },year, month, day);
                mDatePicker.setTitle("Date of Birth");
                mDatePicker.show();
            }
        });
    }
    public void onRegisterClick(View view){
        vRegistrationPageView.RegisterIsClicked();
    }
}