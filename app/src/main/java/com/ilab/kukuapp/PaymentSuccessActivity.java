package com.ilab.kukuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PaymentSuccessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_success);

        final Button btnOrderAgain=(Button) findViewById(R.id.btn_order_again);
        btnOrderAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent=new Intent(PaymentSuccessActivity.this,HomePageActivity.class);
                startActivity(homeIntent);
            }
        });

        final Button btnHomePage = (Button) findViewById(R.id.btn_homepage);
        btnHomePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent=new Intent(PaymentSuccessActivity.this,HomePageActivity.class);
                startActivity(homeIntent);
            }
        });
    }
}