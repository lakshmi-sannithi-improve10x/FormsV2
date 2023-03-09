package com.improve10x.formsv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class IdentityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identity);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        EditText panTxt = findViewById(R.id.pan_txt);
        panTxt.setText("12sa25l");
        EditText aadharTxt = findViewById(R.id.aadhar_txt);
        aadharTxt.setText("3592 5133 1415");
        Button backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(v -> {
            finish();
        });
        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(v -> {
            String panNumber = panTxt.getText().toString();
            String aadharNumber = aadharTxt.getText().toString();
            Intent registrationSuccessfulIntent = new Intent(this, RegistrationSuccessfulActivity.class);
            registrationSuccessfulIntent.putExtras(bundle);
            registrationSuccessfulIntent.putExtra("PANNumber",panNumber);
            registrationSuccessfulIntent.putExtra("AadharNumber",aadharNumber);
            startActivity(registrationSuccessfulIntent);
        });

    }
}