package com.l20290957.avocare.huerto.addhuerto;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.l20290957.avocare.R;
import com.l20290957.avocare.huerto.addhuerto.detallehuerto.DetalleHuerto;

public class AddHuerto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addhuerto);
        initComponents();
    }

    private void initComponents() {
        FloatingActionButton fabAdd = findViewById(R.id.addhuertoFab);
        fabAdd.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), DetalleHuerto.class);
            startActivity(intent);
        });

    }
}