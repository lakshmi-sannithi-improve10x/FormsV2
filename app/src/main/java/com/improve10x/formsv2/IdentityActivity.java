package com.improve10x.formsv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class IdentityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identity);
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
        String company = intent.getStringExtra("Currentcompany");
        String experience = intent.getStringExtra("Experience");
        String designation = intent.getStringExtra("Designation");
        String bankName = intent.getStringExtra("Bankname");
        String accountHolderName = intent.getStringExtra("AccountHolderName");
        String accountNumber = intent.getStringExtra("AccountNumber");
        String ifscCode = intent.getStringExtra("IFSCCode");
        String cardNumber = intent.getStringExtra("CardNumber");
        String cardHolder = intent.getStringExtra("CardHolder");
        String expiry = intent.getStringExtra("Expiry");
        String cvv = intent.getStringExtra("CVV");
        Toast.makeText(this, emailAddress +""+ userName +""+ firstName +"" +lastName +""+ hno +"" +street +"" +city +"" + state +"" +country +""+ dateOfBirth +""+ placeOfBirth +"" +company +"" +experience +""+ designation +"" +bankName +""+ accountHolderName +""+ accountNumber +"" +ifscCode +"" +cardNumber + "" + cardHolder + "" + expiry +"" + cvv, Toast.LENGTH_SHORT).show();

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
            registrationSuccessfulIntent.putExtra("email", emailAddress);
            registrationSuccessfulIntent.putExtra("Username",userName);
            registrationSuccessfulIntent.putExtra("firstname",firstName);
            registrationSuccessfulIntent.putExtra("lastname",lastName);
            registrationSuccessfulIntent.putExtra("Hno",hno);
            registrationSuccessfulIntent.putExtra("Street",street);
            registrationSuccessfulIntent.putExtra("City",city);
            registrationSuccessfulIntent.putExtra("State",state);
            registrationSuccessfulIntent.putExtra("Country",country);
            registrationSuccessfulIntent.putExtra("DateofBirth",dateOfBirth);
            registrationSuccessfulIntent.putExtra("PlaceofBirth",placeOfBirth);
            registrationSuccessfulIntent.putExtra("Currentcompany",company);
            registrationSuccessfulIntent.putExtra("Experience",experience);
            registrationSuccessfulIntent.putExtra("Designation",designation);
            registrationSuccessfulIntent.putExtra("Bankname",bankName);
            registrationSuccessfulIntent.putExtra("AccountHolderName",accountHolderName);
            registrationSuccessfulIntent.putExtra("AccountNumber",accountNumber);
            registrationSuccessfulIntent.putExtra("IFSCCode",ifscCode);
            registrationSuccessfulIntent.putExtra("CardNumber",cardNumber);
            registrationSuccessfulIntent.putExtra("CardHolder",cardHolder);
            registrationSuccessfulIntent.putExtra("Expiry",expiry);
            registrationSuccessfulIntent.putExtra("CVV",cvv);
            registrationSuccessfulIntent.putExtra("PANNumber",panNumber);
            registrationSuccessfulIntent.putExtra("AadharNumber",aadharNumber);
            startActivity(registrationSuccessfulIntent);
        });

    }
}