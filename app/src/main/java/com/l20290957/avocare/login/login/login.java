package com.l20290957.avocare.login.login;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.l20290957.avocare.R;
import com.l20290957.avocare.huerto.MisHuertos;
import com.l20290957.avocare.login.register.register;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initComponents();
    }

    private void initComponents() {
        TextView tvCrearCuenta = findViewById(R.id.loginTvCrearCuenta);
        tvCrearCuenta.setOnClickListener(view -> {
            Intent intent = new Intent(this, register.class);
            startActivity(intent);
        });

        Button btnLogin = findViewById(R.id.loginBtnAcceder);
        btnLogin.setOnClickListener(View -> {
            Intent intent = new Intent(this, MisHuertos.class);
            startActivity(intent);
        });
    }
}