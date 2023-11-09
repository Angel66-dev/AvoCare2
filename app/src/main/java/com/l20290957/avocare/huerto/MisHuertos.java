package com.l20290957.avocare.huerto;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.l20290957.avocare.R;
import com.l20290957.avocare.huerto.addhuerto.AddHuerto;
import com.l20290957.avocare.huerto.saludhuerto.saludhuerto;

public class MisHuertos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mishuertos);
        initComponents();
    }

    private void initComponents() {
        FloatingActionButton fabAdd = findViewById(R.id.mishuertosFab);
        fabAdd.setOnClickListener(view -> {
            Intent intent = new Intent(this, AddHuerto.class);
            startActivity(intent);
        });

        TextView tvHuerto = findViewById(R.id.mishuertosTvNomHuerto);
        tvHuerto.setOnClickListener(view -> {
            Intent intent = new Intent(this, saludhuerto.class);
            startActivity(intent);
        });

        OnBackPressedCallback callback = new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {
                AlertDialog.Builder builder = new AlertDialog.Builder(MisHuertos.this);
                builder.setTitle(R.string.mishuertosAlertDialogBackTitle)
                        .setMessage(R.string.mishuertosAlertDialogMessage)
                        .setNegativeButton(R.string.mishuertosAlertDialogBackNegativeTitle,
                                (dialog, which) -> {
                                    finish();
                                }
                        )
                        .setPositiveButton(R.string.mishuertosAlertDialogBackPositiveTitle,
                                (dialog, which) -> {
                                    finishAffinity();
                                }
                        )
                        .create()
                        .show();
            }
        };

        getOnBackPressedDispatcher().addCallback(callback);
    }
}