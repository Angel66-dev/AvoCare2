package com.l20290957.avocare.huerto.addhuerto.detallenutrimental;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.l20290957.avocare.R;
import com.l20290957.avocare.huerto.addhuerto.plagas.plagascuarentenarias;

public class detallenutrimental extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detallenutrimental);
        initComponents();
    }

    private void initComponents() {
        FloatingActionButton fabAdd = findViewById(R.id.detallenutrimentalFab);
        fabAdd.setOnClickListener(view -> {
            Intent intent = new Intent(this, plagascuarentenarias.class);
            intent.putExtras(getIntent().getExtras());
            startActivity(intent);
        });
    }
}