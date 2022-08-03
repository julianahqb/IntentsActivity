package com.example.intentsactivity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText edtParam1;
    private EditText edtParam2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtParam1 = findViewById(R.id.edtParam1);
        edtParam2 = findViewById(R.id.edtParam2);

        Button btnEnviar = findViewById(R.id.btnEnviar);
        Button btnRequisitar = findViewById(R.id.btnRequisitar);

        btnEnviar.setOnClickListener(this);
        btnRequisitar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Bundle params = new Bundle();
        params.putString("param1", edtParam1.getText().toString());
        params.putString("param2", edtParam2.getText().toString());

        if (view.getId() == R.id.btnEnviar) {
            Intent intent = new Intent(this, ParamsActivity.class);
            intent.putExtras(params);
            startActivity(intent);
        }
        else if (view.getId() == R.id.btnRequisitar){
            Intent intentR = new Intent(this, ResultActivity.class);
            startActivityForResult(intentR, 101);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 101 && resultCode == 10) {
            Toast.makeText(this, "Voltei pelo onClick", Toast.LENGTH_LONG).show();
        } else if (requestCode == 101 && resultCode == 20) {
            Toast.makeText(this, "Voltei pelo onBackPressed", Toast.LENGTH_LONG).show();
        }
    }
}