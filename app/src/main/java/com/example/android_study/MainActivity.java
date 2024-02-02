package com.example.android_study;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String hi = "안녕";

        Log.e("MainActivity : ", hi);

        int a = 10; // 안녕의 나이

        Log.e("MainActivity : ", String.valueOf(a));
    }
}