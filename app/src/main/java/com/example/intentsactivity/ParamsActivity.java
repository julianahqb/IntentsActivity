package com.example.intentsactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ParamsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_params);

        TextView txtParam1 = findViewById(R.id.txtParam1);
        TextView txtParam2 = findViewById(R.id.txtParam2);

        Intent intent = getIntent();
        Bundle params = intent.getExtras();
        String param1 = params.getString("param1");
        String param2 = params.getString("param2");

        txtParam1.setText(param1);
        txtParam2.setText(param2);
    }
}