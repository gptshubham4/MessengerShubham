package com.shubham.rollout;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


public class Welcome extends AppCompatActivity {
    Thread a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        a = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(3000);
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    Intent a = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(a);

                }
            }
        };
        a.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
