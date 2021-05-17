package com.androids.primeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnGuardar;
    EditText txtNombre, txtEmail, txtDomicilio;
    Spinner cbxDeptos;
    RadioButton rbCompleto, rbMedio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGuardar = findViewById(R.id.btnGuardar);
        txtNombre = findViewById(R.id.txtNombre);
        txtEmail = findViewById(R.id.txtEmail);
        txtDomicilio = findViewById(R.id.txtDomicilio);
        cbxDeptos = findViewById(R.id.cbxDeptos);
        rbCompleto = findViewById(R.id.rbCompleto);
        rbMedio = findViewById(R.id.rbMedio);

        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtNombre.getText().toString().equals("") || txtEmail.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "Debe rellenar los campos", Toast.LENGTH_LONG).show();
                }else{
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtra("txtNombre", txtNombre.getText().toString());
                    intent.putExtra("txtEmail", txtEmail.getText().toString());
                    intent.putExtra("txtDomicilio", txtDomicilio.getText().toString());
                    intent.putExtra("cbxDeptos", cbxDeptos.getSelectedItem().toString());
                    String horario = "";
                    if (rbCompleto.isChecked()){
                        horario = "Tiempo Completo";
                    }else{
                        horario = "Medio Tiempo";
                    }
                    intent.putExtra("tiempo", horario);
                    startActivity(intent);
                }
            }
        });
    }
}