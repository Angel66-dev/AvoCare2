package com.l20290957.avocare;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.l20290957.avocare.login.login.login;
import com.l20290957.avocare.login.register.register;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();
    }

    private void initComponents() {
        Button btnCrearCuenta = findViewById(R.id.mainBtnCrearCuenta);
        btnCrearCuenta.setOnClickListener(view -> {
            Intent intent = new Intent(this, register.class);
            startActivity(intent);

        });

        Button btnIniciarSesion = findViewById(R.id.mainBtnAcceder);
        btnIniciarSesion.setOnClickListener(View -> {
            Intent intent = new Intent(this, login.class);
            startActivity(intent);

        });
    }
}