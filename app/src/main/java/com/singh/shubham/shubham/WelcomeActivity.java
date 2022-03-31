package com.singh.shubham.shubham;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.MSG);

        TextView textView = findViewById(R.id.welcomeText);
        textView.setText(message);
    }
}