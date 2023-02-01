package com.improve10x.formsv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ProfessionalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_professional);
        Intent intent = getIntent();
        String emailAddress = intent.getStringExtra("email");
        String userName = intent.getStringExtra("username");
        String firstName = intent.getStringExtra("firstname");
        String lastName = intent.getStringExtra("lastname");
        String hno = intent.getStringExtra("Hno");
        String street = intent.getStringExtra("Street");
        String city = intent.getStringExtra("City");
        String state = intent.getStringExtra("State");
        String country = intent.getStringExtra("Country");
        String dateOfBirth = intent.getStringExtra("DateofBirth");
        String placeOfBirth = intent.getStringExtra("PlaceofBirth");
        Toast.makeText(this, emailAddress +"" + userName +""+ firstName +""+ lastName +""+ hno +"" + street +""+ city +""+ state +""+ country +""+ dateOfBirth + "" + placeOfBirth, Toast.LENGTH_SHORT).show();

        EditText companyTxt = findViewById(R.id.company_txt);
        companyTxt.setText("Improve10X");
        EditText experienceTxt = findViewById(R.id.experience_txt);
        experienceTxt.setText("3 Months");
        EditText designationTxt = findViewById(R.id.designation_txt);
        designationTxt.setText("Soft Developer");
        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(v -> {
            String company = companyTxt.getText().toString();
            String experience = experienceTxt.getText().toString();
            String designation = designationTxt.getText().toString();
            Intent bankAccountIntent = new Intent(this, BankAccountActivity.class);
            bankAccountIntent.putExtra("email",emailAddress);
            bankAccountIntent.putExtra("username",userName);
            bankAccountIntent.putExtra("firstname",firstName);
            bankAccountIntent.putExtra("lastname",lastName);
            bankAccountIntent.putExtra("Hno",hno);
            bankAccountIntent.putExtra("Street",street);
            bankAccountIntent.putExtra("City",city);
            bankAccountIntent.putExtra("State",state);
            bankAccountIntent.putExtra("Country",country);
            bankAccountIntent.putExtra("DateofBirth",dateOfBirth);
            bankAccountIntent.putExtra("PlaceofBirth",placeOfBirth);
            bankAccountIntent.putExtra("Currentcompany",company);
            bankAccountIntent.putExtra("Experience",experience);
            bankAccountIntent.putExtra("Designation",designation);
            startActivity(bankAccountIntent);
        });
        Button backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(v -> {
           finish();
        });

    }
}