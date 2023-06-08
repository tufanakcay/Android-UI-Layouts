package com.tufanakcay.androiduilayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);
       // setContentView(R.layout.linearlayout);
       // setContentView(R.layout.relativelayout);
        setContentView(R.layout.linearlayout_menu);
    }
}