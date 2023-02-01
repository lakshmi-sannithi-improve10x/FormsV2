package com.improve10x.formsv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        EditText emailTxt = findViewById(R.id.email_txt);
        emailTxt.setText("lakshmi.s@gmail.com");
        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(v -> {
            String emailAddress = emailTxt.getText().toString();
            EditText passwordTxt = findViewById(R.id.password_txt);
            String password = passwordTxt.getText().toString();
            EditText confirmPasswordTxt = findViewById(R.id.confirmpassword_txt);
            String confirmPassword = confirmPasswordTxt.getText().toString();
            Intent intent = new Intent(this, PersonalInfoActivity.class);
            intent.putExtra("email",emailAddress);
            startActivity(intent);
        });
    }
}