package com.l20290957.avocare.pronostico;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.l20290957.avocare.R;
import com.l20290957.avocare.plagas.mosquitablanca;

public class pronostico extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pronostico);

        initComponents();
    }

    private void initComponents() {

        Button btnMBlanca = findViewById(R.id.pronosticoBtnMb);
        btnMBlanca.setOnClickListener(View -> {
            Intent intent = new Intent(this, mosquitablanca.class);
            startActivity(intent);
        });

    }
}