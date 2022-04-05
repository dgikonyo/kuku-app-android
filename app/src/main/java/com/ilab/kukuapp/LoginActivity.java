package com.ilab.kukuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //handle the login button click
        final Button btnSignIn=(Button) findViewById(R.id.btn_login);
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homePageIntent = new Intent(LoginActivity.this,HomePageActivity.class);
                startActivity(homePageIntent);
            }
        });
    }

    public void sendToRegistrationActivity(View view) {
        Intent registerActivityIntent = new Intent(LoginActivity.this,RegistrationActivity.class);
        startActivity(registerActivityIntent);
    }
}