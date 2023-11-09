package com.l20290957.avocare.huerto.saludhuerto;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.l20290957.avocare.R;
import com.l20290957.avocare.alertas.alerta;
import com.l20290957.avocare.planeacion.planeacion;
import com.l20290957.avocare.pronostico.pronostico;

public class saludhuerto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludhuerto);

        initComponents();
    }

    private void initComponents() {

        Button btnPlg = findViewById(R.id.saludhuertoBtnAlertPlagas);
        btnPlg.setOnClickListener(View -> {
            Intent intent = new Intent(this, alerta.class);
            startActivity(intent);
        });

        Button btnPro = findViewById(R.id.saludhuertoBtnPron);
        btnPro.setOnClickListener(View -> {
            Intent intent = new Intent(this, pronostico.class);
            startActivity(intent);
        });

        Button btnPlan = findViewById(R.id.saludhuertoBtnPlan);
        btnPlan.setOnClickListener(View -> {
            Intent intent = new Intent(this, planeacion.class);
            startActivity(intent);
        });
    }
}