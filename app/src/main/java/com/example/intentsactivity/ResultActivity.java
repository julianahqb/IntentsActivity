package com.example.intentsactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Button btnFechar = findViewById(R.id.btnFechar);
        btnFechar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        setResult(10);
        finish();
    }

    @Override
    public void onBackPressed() {
        setResult(20);
        finish();
    }
}