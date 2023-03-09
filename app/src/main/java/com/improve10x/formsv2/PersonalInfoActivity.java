package com.improve10x.formsv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PersonalInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_info);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();



        EditText userNameTxt = findViewById(R.id.username_txt);
        userNameTxt.setText("Lakshmi.Sannithi");
        EditText nameTxt = findViewById(R.id.name_txt);
        nameTxt.setText("Lakshmi");
        EditText lastNameTxt = findViewById(R.id.lastname_txt);
        lastNameTxt.setText("Sannithi");
        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(v -> {
            String userName = userNameTxt.getText().toString();
            String firstName = nameTxt.getText().toString();
            String lastName = lastNameTxt.getText().toString();
            Intent addressIntent = new Intent(this, AddressActivity.class);
            addressIntent.putExtras(bundle);
            addressIntent.putExtra("username",userName);
            addressIntent.putExtra("firstname",firstName);
            addressIntent.putExtra("lastname",lastName);
            startActivity(addressIntent);
        });
        Button backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(v -> {
            finish();
        });
    }
}