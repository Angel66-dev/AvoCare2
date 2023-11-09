package com.l20290957.avocare.huerto.addhuerto.detallehuerto;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.l20290957.avocare.R;
import com.l20290957.avocare.huerto.addhuerto.detallenutrimental.detallenutrimental;

public class DetalleHuerto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detallehuerto);
        initComponents();
    }

    private void initComponents() {
        FloatingActionButton fabAdd = findViewById(R.id.detallehuertoFab);
        fabAdd.setOnClickListener(view -> {
            Intent intent = new Intent(this, detallenutrimental.class);
            startActivity(intent);
            finish();
        });
    }
}