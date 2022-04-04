package com.ilab.kukuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        getSupportActionBar().hide();

        Thread splashScreenStarter = new Thread() {
            public void run() {
                try {
                    int delay = 0;
                    while (delay < 3000) {//will delay for three seconds
                        sleep(150);
                        delay = delay + 100;
                    }
                    startActivity(new Intent(SplashScreenActivity.this, LoginActivity.class));

                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    finish();
                }
            }

        };
        splashScreenStarter.start();
    }
}