package com.example.android_study;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private long backBtnTime = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onBackPressed() {
        long crtme = System.currentTimeMillis();
        long gapTme = crtme - backBtnTime;

        if(0 <= gapTme && 2000 >= gapTme) {
            super.onBackPressed();
        } else {
            backBtnTime = crtme;
            Toast.makeText(this, "종료", Toast.LENGTH_SHORT).show();
        }
    }
}