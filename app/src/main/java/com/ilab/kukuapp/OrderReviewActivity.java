package com.ilab.kukuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OrderReviewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_review);

        final Button btn_proceed_to_checkout =(Button) findViewById(R.id.btn_proceed_to_checkout);
        btn_proceed_to_checkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //redirect to the order receipt activity
                Intent checkoutIntent =new Intent(OrderReviewActivity.this,OrderReceiptActivity.class);
                startActivity(checkoutIntent);
            }
        });
    }

}