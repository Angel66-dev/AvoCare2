package com.l20290957.avocare.huerto.addhuerto.plagas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.l20290957.avocare.R;
import com.l20290957.avocare.huerto.MisHuertos;

public class plagascuarentenarias extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plagascuarentenarias);
        initComponents();
    }

    private void initComponents() {
        FloatingActionButton btn = findViewById(R.id.plagasFab);
        btn.setOnClickListener(this::getBackAddHuerto);
    }
    private void getBackAddHuerto(View view){
        Intent intent = new Intent(this, MisHuertos.class);
        startActivity(intent);
        /*finish();*/
    }
}