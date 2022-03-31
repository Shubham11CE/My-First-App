package com.singh.shubham.shubham;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String MSG = "com.singh.shubham.shubham.WELCOME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enroll(View view){
        Intent intent = new Intent(this, WelcomeActivity.class);
        EditText PersonName = findViewById(R.id.PersonName);
        EditText PersonRollNo = findViewById(R.id.PersonRollNo);
        String message = PersonRollNo.getText().toString() + " successfully enrolled. Welcome "
                + PersonName.getText().toString() +".";
        intent.putExtra(MSG, message);
        startActivity(intent);
    }
}