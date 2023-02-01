package com.improve10x.formsv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddressActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address);
        Intent intent = getIntent();
        String emailAddress = intent.getStringExtra("email");
        String userName = intent.getStringExtra("username");
        String firstName = intent.getStringExtra("firstname");
        String lastName = intent.getStringExtra("lastname");
        Toast.makeText(this, emailAddress +"" +userName + " " + firstName + lastName, Toast.LENGTH_SHORT).show();

        EditText hnoTxt = findViewById(R.id.hno_txt);
        hnoTxt.setText("13-31");
        EditText streetTxt = findViewById(R.id.street_txt);
        streetTxt.setText("Basireddybavi Street");
        EditText cityTxt = findViewById(R.id.city_txt);
        cityTxt.setText("Koikuntla");
        EditText stateTxt = findViewById(R.id.state_txt);
        stateTxt.setText("Andhrapradesh");
        EditText countryTxt = findViewById(R.id.country_txt);
        countryTxt.setText("India");
        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(v -> {
            String hno = hnoTxt.getText().toString();
            String street = streetTxt.getText().toString();
            String city = cityTxt.getText().toString();
            String state = stateTxt.getText().toString();
            String country = countryTxt.getText().toString();
            Intent birthDetailsIntent = new Intent(this, BirthDetailsActivity.class);
            birthDetailsIntent.putExtra("email",emailAddress);
            birthDetailsIntent.putExtra("username",userName);
            birthDetailsIntent.putExtra("firstname",firstName);
            birthDetailsIntent.putExtra("lastname",lastName);
            birthDetailsIntent.putExtra("Hno",hno);
            birthDetailsIntent.putExtra("Street",street);
            birthDetailsIntent.putExtra("City",city);
            birthDetailsIntent.putExtra("State",state);
            birthDetailsIntent.putExtra("Country",country);
            startActivity(birthDetailsIntent);
        });
        Button backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(v -> {
            finish();
        });
    }
}