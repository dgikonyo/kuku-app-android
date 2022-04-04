package com.ilab.kukuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    public void signInUser(View view) {
        Intent homePageIntent = new Intent(LoginActivity.this,HomePageActivity.class);
        startActivity(homePageIntent);
    }

    public void sendToRegistrationActivity(View view) {
        Intent registerActivityIntent = new Intent(LoginActivity.this,RegistrationActivity.class);
        startActivity(registerActivityIntent);
    }
}