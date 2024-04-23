package com.l20290957.avocare.diagnostico;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.l20290957.avocare.R;

public class Diagnostico extends AppCompatActivity {

    private CheckBox checkBoxAreaFruto, checkBoxAreaHoja, checkBoxAreaTallo, checkBoxAreaFlor;

    //agregas las id de todos los checkbox de fruto, hoja, tallo y flor
    //private CheckBox ;
    private TextView tvFruto, tvHoja, tvTallo, tvFlor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnostico);

        // Inicializar los CheckBoxes
        checkBoxAreaFruto = findViewById(R.id.checkbox_area_fruto);
        checkBoxAreaHoja = findViewById(R.id.checkbox_area_hoja);
        checkBoxAreaTallo = findViewById(R.id.checkbox_area_tallo); // Corregido el nombre
        checkBoxAreaFlor = findViewById(R.id.checkbox_area_flor); // Corregido el nombre

        // Grupo Fruto
        tvFruto = findViewById(R.id.seTVOpcFruto);

        // Grupo Hoja
        tvHoja = findViewById(R.id.seTVOpcHoja);

        // Grupo Tallo
        tvTallo = findViewById(R.id.seTVOpcTallo);

        // Grupo Flor
        tvFlor = findViewById(R.id.seTVOpcFlor);


        // Configurar oyentes de cambio de estado
        checkBoxAreaFruto.setOnCheckedChangeListener((buttonView, isChecked) -> updateCheckBoxVisibility());
        checkBoxAreaHoja.setOnCheckedChangeListener((buttonView, isChecked) -> updateCheckBoxVisibility());
        checkBoxAreaTallo.setOnCheckedChangeListener((buttonView, isChecked) -> updateCheckBoxVisibility());
        checkBoxAreaFlor.setOnCheckedChangeListener((buttonView, isChecked) -> updateCheckBoxVisibility());

        // Establecemos todos los CheckBoxes como ocultos inicialmente
        // hace invisible las opciones para que cuando selecciones ya sea fruto te aparezcan solo esas opciones
        tvFruto.setVisibility(View.GONE);
        tvHoja.setVisibility(View.GONE);
        tvTallo.setVisibility(View.GONE);
        tvFlor.setVisibility(View.GONE);

    }

    private void updateCheckBoxVisibility() {

        // Verificamos cada conjunto de condiciones
        // hara visibles las opciones de cada opcion principal
        if (checkBoxAreaFruto.isChecked()) {
            tvFruto.setVisibility(View.VISIBLE);

        } else {
            tvFruto.setVisibility(View.GONE);

        }

        if (checkBoxAreaHoja.isChecked()) {
            tvHoja.setVisibility(View.VISIBLE);

        }else {
            tvHoja.setVisibility(View.GONE);

        }

        if (checkBoxAreaTallo.isChecked()) {
            tvTallo.setVisibility(View.VISIBLE);

        } else {
            tvTallo.setVisibility(View.GONE);

        }

        if (checkBoxAreaFlor.isChecked()) {
            tvFlor.setVisibility(View.VISIBLE);

        }else {
            tvFlor.setVisibility(View.GONE);

        }

    }
}
