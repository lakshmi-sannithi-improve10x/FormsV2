package com.improve10x.formsv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class BankAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_account);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
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
            creditCardDetailsIntent.putExtras(bundle);
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