package com.l20290957.avocare.huerto.addhuerto.detallehuerto;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputLayout;
import com.l20290957.avocare.R;
import com.l20290957.avocare.huerto.addhuerto.detallenutrimental.detallenutrimental;

public class DetalleHuerto extends AppCompatActivity {
    private TextInputLayout variedad;
    private TextInputLayout mercadoOBJ;
    private TextInputLayout organico;
    private TextInputLayout etapaFenologica;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detallehuerto);
        initComponents();
    }

    private void initComponents() {
        variedad = findViewById(R.id.detallehuertoBtnVariedad);
        mercadoOBJ = findViewById(R.id.detallehuertoBtnMerObj);
        organico = findViewById(R.id.detallehuertoBtnOrganico);
        etapaFenologica = findViewById(R.id.detallehuertoBtnEtapa);

        FloatingActionButton fabAdd = findViewById(R.id.detallehuertoFab);
        fabAdd.setOnClickListener(view -> {
            metodomamalon();
        });
    }

    private void metodomamalon() {
        String  vaiedadValue, mercadoOBJValue, organicoValue, etapaValue;
        vaiedadValue = variedad.getEditText().getText().toString();
        mercadoOBJValue = mercadoOBJ.getEditText().getText().toString();
        organicoValue = organico.getEditText().getText().toString();
        etapaValue = etapaFenologica.getEditText().getText().toString();

        if(vaiedadValue.length()<3){
            Toast.makeText(this, "Ingresa una variedad mayor a 3 caracteres", Toast.LENGTH_LONG).show();
            return;
        }

        if(mercadoOBJValue.length()<3){
            Toast.makeText(this, "Ingresa un mercado objetivo mayor a 3 caracteres", Toast.LENGTH_LONG).show();
            return;
        }

        if(organicoValue.length()<3){
            Toast.makeText(this, "Ingresa un valor mayor a 3 caracteres", Toast.LENGTH_LONG).show();
            return;
        }

        if(etapaValue.length()<3){
            Toast.makeText(this, "Ingresa una etapa fenologica mayor a 3 caracteres", Toast.LENGTH_LONG).show();
            return;
        }

        Bundle extras = getIntent().getExtras();
        extras.putString("variedad", vaiedadValue);
        extras.putString("mercadoOBJ", mercadoOBJValue);
        extras.putString("organico", organicoValue);
        extras.putString("etapaFenologica", etapaValue);

        Intent intent = new Intent(this, detallenutrimental.class);
        intent.putExtras(extras);

        startActivity(intent);
        finish();
    }
}