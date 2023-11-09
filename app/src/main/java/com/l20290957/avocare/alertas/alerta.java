package com.l20290957.avocare.alertas;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.l20290957.avocare.R;
import com.l20290957.avocare.plagas.trips;

public class alerta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alerta);

        initComponents();
    }

    private void initComponents() {

        Button btnTrips = findViewById(R.id.alertaBtnAlertTrips);
        btnTrips.setOnClickListener(View -> {
            Intent intent = new Intent(this, trips.class);
            startActivity(intent);
        });

    }
}