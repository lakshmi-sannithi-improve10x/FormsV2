package com.improve10x.formsv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CreditCardDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credit_card_details);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
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
            identityIntent.putExtras(bundle);
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