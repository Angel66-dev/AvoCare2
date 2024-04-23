package com.l20290957.avocare.huerto.addhuerto;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputLayout;
import com.l20290957.avocare.R;
import com.l20290957.avocare.huerto.addhuerto.detallehuerto.DetalleHuerto;

public class AddHuerto extends AppCompatActivity {
    private TextInputLayout nombre;
    private TextInputLayout latitud;
    private TextInputLayout longitud;
    private TextInputLayout tipoSuelo;
    private TextInputLayout tipoRiego;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addhuerto);
        initComponents();
    }

    private void initComponents() {
        nombre = findViewById(R.id.addhuertoEtName);
        latitud = findViewById(R.id.addhuertoBtnLatitud);
        longitud = findViewById(R.id.addhuertoBtnLongitud);
        tipoSuelo = findViewById(R.id.addhuertoBtnTipoSuelo);
        tipoRiego = findViewById(R.id.addhuertoBtnTipoRiego);

        FloatingActionButton fabAdd = findViewById(R.id.addhuertoFab);
        fabAdd.setOnClickListener(view -> {
            metodomamalon();
        });

    }

    private void metodomamalon() {
        String nombreValue, latitudValue, longitudValue, tipoSueloValue, tipoRiegoValue;
        nombreValue = nombre.getEditText().getText().toString();
        latitudValue = latitud.getEditText().getText().toString();
        longitudValue = longitud.getEditText().getText().toString();
        tipoSueloValue = tipoSuelo.getEditText().getText().toString();
        tipoRiegoValue = tipoRiego.getEditText().getText().toString();

        double latitudDoubleValue = 0.0, longitudDoubleValue = 0.0;


        if (latitudValue.matches("^(\\-?\\d+(\\.\\d+)?)$")==false){
            Toast.makeText(this, "Ingresa la latitud valida", Toast.LENGTH_LONG).show();
            return;
        } else {
            latitudDoubleValue = Double.parseDouble(latitudValue);
        }


        if (longitudValue.matches("^(\\-?\\d+(\\.\\d+)?)$")==false){
            Toast.makeText(this, "Ingresa la longitud valida", Toast.LENGTH_LONG).show();
            return;
        } else {
            longitudDoubleValue = Double.parseDouble(longitudValue);
        }

        if(tipoSueloValue.length()<3){
            Toast.makeText(this, "Ingresa un tipo de suelo mayor a 3 caracteres", Toast.LENGTH_LONG).show();
            return;
        }

        if(tipoRiegoValue.length()<3){
            Toast.makeText(this, "Ingresa un tipo de riego mayor a 3 caracteres", Toast.LENGTH_LONG).show();
            return;
        }

        Intent intent = new Intent(getApplicationContext(), DetalleHuerto.class);
        intent.putExtra("nombre", nombreValue);
        intent.putExtra("latitud", latitudDoubleValue);
        intent.putExtra("longitud", longitudDoubleValue);
        intent.putExtra("tipoSuelo", tipoSueloValue);
        intent.putExtra("tipoRiego", tipoRiegoValue);
        startActivity(intent);
        finish();
    }
}