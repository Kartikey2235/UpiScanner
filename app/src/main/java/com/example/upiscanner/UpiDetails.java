package com.example.upiscanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class UpiDetails extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upi_details);
        textView=findViewById(R.id.upi);
        Intent intent=getIntent();
        String main=intent.getStringExtra("data");
        textView.setText(main);
    }
}