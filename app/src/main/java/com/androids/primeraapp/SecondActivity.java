package com.androids.primeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText txtNombre;
    TextView txtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        txtNombre = findViewById(R.id.txtNombre2);
        txtView = findViewById(R.id.txtView);
        String datos = "Email: " + getIntent().getStringExtra("txtEmail") + "\nDireccion: " + getIntent().getStringExtra("txtDomicilio")
                + "\nDepartamento: " + getIntent().getStringExtra("cbxDeptos") + "\nHorario: " + getIntent().getStringExtra("tiempo");
        txtView.setText(datos);
        txtNombre.setText(getIntent().getStringExtra("txtNombre"));
    }
}