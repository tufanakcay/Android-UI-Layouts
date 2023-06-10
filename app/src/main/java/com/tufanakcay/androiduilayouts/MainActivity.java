package com.tufanakcay.androiduilayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    // Button btn;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_main);
        // setContentView(R.layout.linearlayout);
        // setContentView(R.layout.relativelayout);
        //setContentView(R.layout.linearlayout_menu);
        //setContentView(R.layout.relative_layout);
        //setContentView(R.layout.layout_button);
        setContentView(R.layout.layout_textview);

        tanimla();

        goster("Hello world!");

        //  isVer();

    }

    private void tanimla() {

        //   btn = findViewById(R.id.button001);
        textView = findViewById(R.id.textview);

    }


    private void goster(String isimVer) {

        textView.setText(isimVer);


    }

    /*
    private void isVer() {

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                System.out.println("Button clicked");
                Toast.makeText(MainActivity.this, "Button clicked", Toast.LENGTH_LONG).show();
            }
        });

    }

     */


}