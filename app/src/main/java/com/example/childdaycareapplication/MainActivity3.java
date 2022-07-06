package com.example.childdaycareapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.childdaycareapplication.Model.Enrollment;
import com.example.childdaycareapplication.Services.EnrollmentAPI;
import com.example.childdaycareapplication.Services.RetrofitService;
import com.google.android.material.textfield.TextInputEditText;

import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity3 extends AppCompatActivity {
    DatePickerDialog datePickerDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Initializecomponents();
    }

    private void Initializecomponents(){

        TextInputEditText EditchFname = findViewById(R.id.chFname);
        TextInputEditText EditchLname = findViewById(R.id.chLname);
        TextInputEditText EditprFname = findViewById(R.id.prFname);
        TextInputEditText EditprLname = findViewById(R.id.prLname);
        TextInputEditText EditDate = findViewById(R.id.date);
        TextInputEditText EditPhone = findViewById(R.id.phone);
        TextInputEditText EditEmail = findViewById(R.id.email);
        TextInputEditText EditAddress = findViewById(R.id.address);
        RadioGroup EditchGender = (RadioGroup) findViewById(R.id.chGender);
        RadioGroup EditprGender= (RadioGroup) findViewById(R.id.prGender);
        RadioButton chMale = (RadioButton) findViewById(R.id.chMale);
        RadioButton chFemale = (RadioButton) findViewById(R.id.chFemale);
        RadioButton prMale = (RadioButton) findViewById(R.id.prMale);
        RadioButton prFemale = (RadioButton) findViewById(R.id.prFemale);

        TextInputEditText MDate = findViewById(R.id.date);

        MDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar c = Calendar.getInstance();
                int mYear = c.get(Calendar.YEAR);
                int mMonth = c.get(Calendar.MONTH);
                int mDay = c.get(Calendar.DAY_OF_MONTH);

                datePickerDialog = new DatePickerDialog(MainActivity3.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                                MDate.setText(year+"-"+(month+1)+"-"+dayOfMonth);
                            }
                        },mYear, mMonth, mDay);
                datePickerDialog.show();
                MDate.getText();
            }
        });

        Spinner Myspinner = (Spinner) findViewById(R.id.services);


        ArrayAdapter<CharSequence> Adapter = ArrayAdapter.createFromResource(this,
                R.array.Servicelist, android.R.layout.simple_spinner_item);

        Adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Myspinner.setAdapter(Adapter);


        Button submit = (Button) findViewById(R.id.submit);

        RetrofitService retrofitService = new RetrofitService();
        EnrollmentAPI enrollmentAPI = retrofitService.getRetrofit().create(EnrollmentAPI.class);

        submit.setOnClickListener( view ->{

            String chFname = String.valueOf(EditchFname.getText());

            if (chFname.length() == 0) {
                EditchFname.setError("Please Enter a child first name!");
            }

            String chLname = String.valueOf(EditchLname.getText());

            if (chLname.length() == 0) {
                EditchLname.setError("Please Enter a child last name!");
            }

            String prFname = String.valueOf(EditprFname.getText());

            if (prFname.length() == 0) {
                EditprFname.setError("Please Enter a parent first name!");
            }

            String prLname = String.valueOf(EditprLname.getText());

            if (prLname.length() == 0) {
                EditprLname.setError("Please Enter a parent last name!");
            }

            String enrollDate = String.valueOf(EditDate.getText());

            if (enrollDate.length() == 0) {
                EditDate.setError("Please Select Date!");
            }

            String chGender = ((RadioButton)findViewById(EditchGender.getCheckedRadioButtonId())).getText().toString();
            String prGender = ((RadioButton)findViewById(EditprGender.getCheckedRadioButtonId())).getText().toString();

            String phone= String.valueOf(EditPhone.getText());

            if (phone.length() == 0) {
                EditPhone.setError("Please Enter a phone number!");
            }

            String email = String.valueOf(EditEmail.getText());

            if (email.length() == 0) {
                EditEmail.setError("Please Enter Email!");
            }

            String address = String.valueOf(EditAddress.getText());

            if (address.length() == 0) {
                EditAddress.setError("Please Enter Address!");
            }

            String services = Myspinner.getSelectedItem().toString();


            Enrollment enrollment = new Enrollment();

            enrollment.setCh_Fname(chFname);
            enrollment.setCh_Lname(chLname);
            enrollment.setPr_Fname(prFname);
            enrollment.setPr_Lname(prLname);
            enrollment.setPhone(phone);
            enrollment.setEmail(email);
            enrollment.setAddress(address);
            enrollment.setCategory(services);
            enrollment.setCh_Gender(chGender);
            enrollment.setPr_Gender(prGender);
            enrollment.setEnroll_Date(enrollDate);

            enrollmentAPI.save(enrollment)
                    .enqueue(new Callback<Enrollment>() {
                        @Override
                        public void onResponse(Call<Enrollment> call, Response<Enrollment> response) {
                            Toast.makeText(MainActivity3.this, "Child Enrolled Successfully", Toast.LENGTH_LONG).show();
                        }

                        @Override
                        public void onFailure(Call<Enrollment> call, Throwable t) {
                            Toast.makeText(MainActivity3.this, "Child Enrollment Failed", Toast.LENGTH_SHORT).show();
                            Logger.getLogger(MainActivity.class.getName()).log(Level.SEVERE,"Error",t);

                        }
                    });
        });

        Button reset = (Button) findViewById(R.id.reset);

        reset.setOnClickListener(view ->{
            EditchFname.setText("");
            EditchLname.setText("");
            EditDate.setText("");
            EditprFname.setText("");
            EditprLname.setText("");
            EditPhone.setText("");
            EditEmail.setText("");
            EditAddress.setText("");
            chMale.setChecked(true);
            chFemale.setChecked(false);
            prMale.setChecked(true);
            prFemale.setChecked(false);
            Myspinner.setAdapter(null);
            Myspinner.setAdapter(Adapter);
        });
    }
}