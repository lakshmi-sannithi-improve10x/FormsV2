package com.improve10x.formsv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ProfessionalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_professional);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
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
            bankAccountIntent.putExtras(bundle);
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