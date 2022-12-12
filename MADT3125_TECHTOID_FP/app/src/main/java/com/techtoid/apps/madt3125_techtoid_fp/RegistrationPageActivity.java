package com.techtoid.apps.madt3125_techtoid_fp;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
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
                findViewById(R.id.et_id),
                findViewById(R.id.et_fname),
                findViewById(R.id.et_lname),
                findViewById(R.id.et_birthYear),
                findViewById(R.id.txtvw_btn_male),
                findViewById(R.id.txtvw_btn_female),
                findViewById(R.id.spnr_emp_type),
                findViewById(R.id.txtvw_bonus1),
                findViewById(R.id.edtxt_bonus1),
                findViewById(R.id.txtvw_bonus2),
                findViewById(R.id.edtxt_bonus2),
                findViewById(R.id.et_salary),
                findViewById(R.id.et_occupationrate),
                findViewById(R.id.txtvw_btn_car),
                findViewById(R.id.txtvw_btn_motorcycle),
                findViewById(R.id.spnr_vehiclemake),
                findViewById(R.id.txtvw_cartype),
                findViewById(R.id.spnr_cartype),
                findViewById(R.id.spnr_vehiclecategory),
                findViewById(R.id.plate_number),
                findViewById(R.id.txtvw_cargeartype),
                findViewById(R.id.spnr_cargeartype),
                findViewById(R.id.spnr_color),
                findViewById(R.id.lnr_sidecar),
                findViewById(R.id.chckbx_sidecar));


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
    public void genderOnClick(View view) {
        vRegistrationPageView.GenderButtonClicked(view);
    }
    public void vehicleOnClick(View view) {
        vRegistrationPageView.VehicleButtonClicked(view);
    }
}