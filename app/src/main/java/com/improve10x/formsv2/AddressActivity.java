package com.improve10x.formsv2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class AddressActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Address");
        actionBar.setDisplayHomeAsUpEnabled(true);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

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
            birthDetailsIntent.putExtras(bundle);
            birthDetailsIntent.putExtra("Hno", hno);
            birthDetailsIntent.putExtra("Street", street);
            birthDetailsIntent.putExtra("City", city);
            birthDetailsIntent.putExtra("State", state);
            birthDetailsIntent.putExtra("Country", country);
            startActivity(birthDetailsIntent);
        });
        Button backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(v -> {
            finish();
        });
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            Toast.makeText(this, "Bye", Toast.LENGTH_LONG).show();
            finish();

        }
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.address_menu,menu);
        return true;
    }
}