package com.ilab.kukuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }

    public void registerUser(View view) {
        Intent homePageIntent = new Intent(RegistrationActivity.this,HomePageActivity.class);
        startActivity(homePageIntent);
    }
}