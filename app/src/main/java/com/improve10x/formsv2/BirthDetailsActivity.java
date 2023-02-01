package com.improve10x.formsv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class BirthDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birth_details);
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
        Toast.makeText(this,   emailAddress + ""+ userName + ""+ firstName + ""+ lastName +"" + hno +"" +street + "" + city + "" +state + "" +country, Toast.LENGTH_SHORT).show();

        EditText dateTxt = findViewById(R.id.date_txt);
        dateTxt.setText("21-08-92");
        EditText placeTxt = findViewById(R.id.place_txt);
        placeTxt.setText("Koilkuntla");
        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(v -> {
            String dateOfBirth = dateTxt.getText().toString();
            String placeOfBirth = placeTxt.getText().toString();
            Intent professionalIntent = new Intent(this, ProfessionalActivity.class);
            professionalIntent.putExtra("email",emailAddress);
            professionalIntent.putExtra("username",userName);
            professionalIntent.putExtra("firstname",firstName);
            professionalIntent.putExtra("lastname",lastName);
            professionalIntent.putExtra("Hno",hno);
            professionalIntent.putExtra("Street",street);
            professionalIntent.putExtra("City",city);
            professionalIntent.putExtra("State",state);
            professionalIntent.putExtra("Country",country);
            professionalIntent.putExtra("DateofBirth",dateOfBirth);
            professionalIntent.putExtra("PlaceofBirth",placeOfBirth);
            startActivity(professionalIntent);
        });
        Button backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(v -> {
            finish();
        });
    }
}