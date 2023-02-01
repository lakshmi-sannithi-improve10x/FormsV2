package com.improve10x.formsv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CreditCardDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credit_card_details);
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
        Toast.makeText(this, emailAddress +""+ userName +""+ firstName +""+ lastName +""+ hno +""+ street +"" + city +"" +state +""+ country+"" +dateOfBirth+""+ placeOfBirth +"" +company +"" + experience +""+ designation+""+ bankName + "" + accountHolderName + "" + accountNumber + ""+ ifscCode, Toast.LENGTH_SHORT).show();
        EditText cardNoTxt = findViewById(R.id.cardno_txt);
        cardNoTxt.setText("3434 2525 1515");
        EditText cardHolderTxt = findViewById(R.id.cardholder_txt);
        cardHolderTxt.setText("Sannithi Lakshmi");
        EditText expiryTxt = findViewById(R.id.expiry_txt);
        expiryTxt.setText("5/2026");
        EditText cvvTxt = findViewById(R.id.cvv_txt);
        cvvTxt.setText("388");
        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(v -> {
            String cardNumber = cardNoTxt.getText().toString();
            String cardHolderName = cardHolderTxt.getText().toString();
            String expiry = expiryTxt.getText().toString();
            String cvv = cvvTxt.getText().toString();
            Toast.makeText(this, cardNumber + " " + cardHolderName + "" + expiry + "" + cvv, Toast.LENGTH_SHORT).show();
            Intent identityIntent = new Intent(this, IdentityActivity.class);
            identityIntent.putExtra("email",emailAddress);
            identityIntent.putExtra("username",userName);
            identityIntent.putExtra("firstname",firstName);
            identityIntent.putExtra("lastname",lastName);
            identityIntent.putExtra("Hno",hno);
            identityIntent.putExtra("Street",street);
            identityIntent.putExtra("City",city);
            identityIntent.putExtra("State",state);
            identityIntent.putExtra("Country",country);
            identityIntent.putExtra("DateofBirth",dateOfBirth);
            identityIntent.putExtra("PlaceofBirth",placeOfBirth);
            identityIntent.putExtra("Currentcompany",company);
            identityIntent.putExtra("Experience",experience);
            identityIntent.putExtra("Designation",designation);
            identityIntent.putExtra("Bankname",bankName);
            identityIntent.putExtra("AccountHolderName",accountHolderName);
            identityIntent.putExtra("AccountNumber",accountNumber);
            identityIntent.putExtra("IFSCCode",ifscCode);
            identityIntent.putExtra("CardNumber",cardNumber);
            identityIntent.putExtra("CardHolder",cardHolderName);
            identityIntent.putExtra("Expiry",expiry);
            identityIntent.putExtra("CVV",cvv);
            startActivity(identityIntent);
        });
        Button backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(v -> {
            finish();
        });
    }
}