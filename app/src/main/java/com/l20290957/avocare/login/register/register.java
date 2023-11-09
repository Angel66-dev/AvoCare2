package com.l20290957.avocare.login.register;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.l20290957.avocare.R;

public class register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        initComponents();
    }

    private void initComponents() {
        TextView tvIniciarSesion = findViewById(R.id.registerTvCrearCuenta);
        tvIniciarSesion.setOnClickListener(this::getBackToLogin);

        Button btn = findViewById(R.id.registerBtnAcceder);
        btn.setOnClickListener(this::getBackToLogin);
    }
    private void getBackToLogin(View view){
        finish();
    }
}