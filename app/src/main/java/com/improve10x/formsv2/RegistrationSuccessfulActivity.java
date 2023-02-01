package com.improve10x.formsv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class RegistrationSuccessfulActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_successful);
        Intent intent = getIntent();
        String emailAddress = intent.getStringExtra("email");
        TextView emailTxt = findViewById(R.id.email_txt);
        emailTxt.setText(emailAddress);

        String userName = intent.getStringExtra("Username");
        TextView userNameTxt = findViewById(R.id.username_txt);
        userNameTxt.setText(userName);

        String firstName = intent.getStringExtra("firstname");
        TextView firstNameTxt = findViewById(R.id.firstname_txt);
        firstNameTxt.setText(firstName);

        String lastName = intent.getStringExtra("lastname");
        TextView lastNameTxt = findViewById(R.id.lastname_txt);
        lastNameTxt.setText(lastName);
        String hno = intent.getStringExtra("Hno");
        TextView hnoTxt = findViewById(R.id.hno_txt);
        hnoTxt.setText(hno);
        String street = intent.getStringExtra("Street");
        TextView streetTxt = findViewById(R.id.street_txt);
        streetTxt.setText(street);
        String city = intent.getStringExtra("City");
        TextView cityTxt = findViewById(R.id.city_txt);
        cityTxt.setText(city);
        String state = intent.getStringExtra("State");
        TextView stateTxt = findViewById(R.id.state_txt);
        stateTxt.setText(state);
        String country = intent.getStringExtra("Country");
        TextView countryTxt = findViewById(R.id.country_txt);
        countryTxt.setText(country);
        String dateOfBirth = intent.getStringExtra("DateofBirth");
        TextView dateOfBirthTxt = findViewById(R.id.date_txt);
        dateOfBirthTxt.setText(dateOfBirth);
        String placeOfBirth = intent.getStringExtra("PlaceofBirth");
        TextView placeOfBirthTxt = findViewById(R.id.place_txt);
        placeOfBirthTxt.setText(placeOfBirth);
        String company = intent.getStringExtra("Currentcompany");
        TextView companyTxt = findViewById(R.id.company_txt);
        companyTxt.setText(company);
        String experience = intent.getStringExtra("Experience");
        TextView experienceTxt = findViewById(R.id.experience_txt);
        experienceTxt.setText(experience);
        String designation = intent.getStringExtra("Designation");
        TextView designationTxt = findViewById(R.id.designation_txt);
        designationTxt.setText(designation);
        String bankName = intent.getStringExtra("Bankname");
        TextView bankNameTxt = findViewById(R.id.bankname_txt);
        bankNameTxt.setText(bankName);
        String accountHolderName = intent.getStringExtra("AccountHolderName");
        TextView accountHolderTxt = findViewById(R.id.accountholder_txt);
        accountHolderTxt.setText(accountHolderName);
        String accountNumber = intent.getStringExtra("AccountNumber");
        TextView accountNumberTxt = findViewById(R.id.accountno_txt);
        accountNumberTxt.setText(accountNumber);
        String ifscCode = intent.getStringExtra("IFSCCode");
        TextView ifscCodeTxt = findViewById(R.id.ifsccode_txt);
        ifscCodeTxt.setText(ifscCode);
        String cardNumber = intent.getStringExtra("CardNumber");
        TextView cardNumberTxt = findViewById(R.id.cardno_txt);
        cardNumberTxt.setText(cardNumber);
        String cardHolder = intent.getStringExtra("CardHolder");
        TextView cardHolderTxt = findViewById(R.id.cardholder_txt);
        cardHolderTxt.setText(cardHolder);
        String expiry = intent.getStringExtra("Expiry");
        TextView expiryTxt = findViewById(R.id.expiry_txt);
        expiryTxt.setText(expiry);
        String cvv = intent.getStringExtra("CVV");
        TextView cvvTxt = findViewById(R.id.cvv_txt);
        cvvTxt.setText(cvv);
        String panNumber = intent.getStringExtra("PANNumber");
        TextView panNumberTxt = findViewById(R.id.pannumber_txt);
        panNumberTxt.setText(panNumber);
        String aadharNumber = intent.getStringExtra("AadharNumber");
        TextView aadharNumberTxt = findViewById(R.id.aadhar_txt);
        aadharNumberTxt.setText(aadharNumber);


    }
}