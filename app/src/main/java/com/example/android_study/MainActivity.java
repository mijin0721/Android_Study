package com.example.android_study;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    // 동적 연결을 위한 선언
    EditText et_id;
    Button btn_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 바인딩
        et_id = findViewById(R.id.et_id);
        btn_id = findViewById(R.id.btn_id);

        // 버튼을 눌렀을 때 동작
        btn_id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et_id.setText("김미진");
            }
        });
    }
}