package com.example.bibin_c0769970_mt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;


public class SecondPage extends AppCompatActivity {


    TextView textview2;
    TextView textview17;
    TextView textView18;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);
        textview2 = findViewById(R.id.textView16);
        textview17 = findViewById(R.id.textView17);
        textView18 = findViewById(R.id.textView18);
        textView18.setText("5 Days");
        textview2.setText(getIntent().getExtras().getString("username"));
        textview17.setText(getIntent().getExtras().getString("price"));

    }
}
