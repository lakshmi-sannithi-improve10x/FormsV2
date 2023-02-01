package com.improve10x.formsv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class BankAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_account);
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
        Toast.makeText(this, emailAddress +""+ userName +""+ firstName +""+ lastName +"" +hno +""+ street +""+ city +"" + state +"" + country +""+ dateOfBirth +""+ placeOfBirth +"" + company + "" + experience + "" + designation, Toast.LENGTH_SHORT).show();

        EditText banknameTxt = findViewById(R.id.bankname_txt);
        banknameTxt.setText("Andhra Bank");
        EditText acHolderNameTxt = findViewById(R.id.acholder_name);
        acHolderNameTxt.setText("Sai Lakshmi");
        EditText accountNumberTxt = findViewById(R.id.accountno_txt);
        accountNumberTxt.setText("1523101000111");
        EditText ifscCodeTxt = findViewById(R.id.ifsc_txt);
        ifscCodeTxt.setText("ANDB101011");
        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(v -> {
            String bankname = banknameTxt.getText().toString();
            String accountHolderName = acHolderNameTxt.getText().toString();
            String accountNumber = accountNumberTxt.getText().toString();
            String ifscCode = ifscCodeTxt.getText().toString();
            Intent creditCardDetailsIntent = new Intent(this, CreditCardDetailsActivity.class);
            creditCardDetailsIntent.putExtra("email",emailAddress);
            creditCardDetailsIntent.putExtra("username",userName);
            creditCardDetailsIntent.putExtra("firstname",firstName);
            creditCardDetailsIntent.putExtra("lastname",lastName);
            creditCardDetailsIntent.putExtra("Hno",hno);
            creditCardDetailsIntent.putExtra("Street",street);
            creditCardDetailsIntent.putExtra("City",city);
            creditCardDetailsIntent.putExtra("State",state);
            creditCardDetailsIntent.putExtra("Country",country);
            creditCardDetailsIntent.putExtra("DateofBirth",dateOfBirth);
            creditCardDetailsIntent.putExtra("PlaceofBirth",placeOfBirth);
            creditCardDetailsIntent.putExtra("Currentcompany",company);
            creditCardDetailsIntent.putExtra("Experience",experience);
            creditCardDetailsIntent.putExtra("Designation",designation);
            creditCardDetailsIntent.putExtra("Bankname",bankname);
            creditCardDetailsIntent.putExtra("AccountHolderName",accountHolderName);
            creditCardDetailsIntent.putExtra("AccountNumber",accountNumber);
            creditCardDetailsIntent.putExtra("IFSCCode",ifscCode);
            startActivity(creditCardDetailsIntent);
        });
        Button backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(v -> {
            finish();
        });
    }
}