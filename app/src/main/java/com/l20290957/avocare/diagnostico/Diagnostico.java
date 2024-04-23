package com.l20290957.avocare.diagnostico;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.l20290957.avocare.R;

public class Diagnostico extends AppCompatActivity {

    private CheckBox checkBoxAreaFruto, checkBoxAreaHoja, checkBoxAreaTallo, checkBoxAreaFlor;
    private CheckBox checkBox1a, checkBox1b, checkBox2a, checkBox2b, checkBox3a, checkBox3b, checkBox4a, checkBox4b;
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
        checkBox1a = findViewById(R.id.checkbox_1a);
        checkBox1b = findViewById(R.id.checkbox_1b);
        // Grupo Hoja
        tvHoja = findViewById(R.id.seTVOpcHoja);
        checkBox2a = findViewById(R.id.checkbox_2a);
        checkBox2b = findViewById(R.id.checkbox_2b);
        // Grupo Tallo
        tvTallo = findViewById(R.id.seTVOpcTallo);
        checkBox3a = findViewById(R.id.checkbox_3a);
        checkBox3b = findViewById(R.id.checkbox_3b);
        // Grupo Flor
        tvFlor = findViewById(R.id.seTVOpcFlor);
        checkBox4a = findViewById(R.id.checkbox_4a);
        checkBox4b = findViewById(R.id.checkbox_4b);

        // Configurar oyentes de cambio de estado
        checkBoxAreaFruto.setOnCheckedChangeListener((buttonView, isChecked) -> updateCheckBoxVisibility());
        checkBoxAreaHoja.setOnCheckedChangeListener((buttonView, isChecked) -> updateCheckBoxVisibility());
        checkBoxAreaTallo.setOnCheckedChangeListener((buttonView, isChecked) -> updateCheckBoxVisibility());
        checkBoxAreaFlor.setOnCheckedChangeListener((buttonView, isChecked) -> updateCheckBoxVisibility());

        tvFruto.setVisibility(View.GONE);
        tvHoja.setVisibility(View.GONE);
        tvTallo.setVisibility(View.GONE);
        tvFlor.setVisibility(View.GONE);
        checkBox1a.setVisibility(View.GONE);
        checkBox1b.setVisibility(View.GONE);
        checkBox2a.setVisibility(View.GONE);
        checkBox2b.setVisibility(View.GONE);
        checkBox3a.setVisibility(View.GONE);
        checkBox3b.setVisibility(View.GONE);
        checkBox4a.setVisibility(View.GONE);
        checkBox4b.setVisibility(View.GONE);
    }

    private void updateCheckBoxVisibility() {
        // Establecemos todos los CheckBoxes como ocultos inicialmente


        // Verificamos cada conjunto de condiciones
        if (checkBoxAreaFruto.isChecked()) {
            tvFruto.setVisibility(View.VISIBLE);
            checkBox1a.setVisibility(View.VISIBLE);
            checkBox1b.setVisibility(View.VISIBLE);
        } else {
            tvFruto.setVisibility(View.GONE);
            checkBox1a.setVisibility(View.GONE);
            checkBox1b.setVisibility(View.GONE);
        }

        if (checkBoxAreaHoja.isChecked()) {
            tvHoja.setVisibility(View.VISIBLE);
            checkBox2a.setVisibility(View.VISIBLE);
            checkBox2b.setVisibility(View.VISIBLE);
        }else {
            tvHoja.setVisibility(View.GONE);
            checkBox2a.setVisibility(View.GONE);
            checkBox2b.setVisibility(View.GONE);
        }

        if (checkBoxAreaTallo.isChecked()) {
            tvTallo.setVisibility(View.VISIBLE);
            checkBox3a.setVisibility(View.VISIBLE);
            checkBox3b.setVisibility(View.VISIBLE);
        } else {
            tvTallo.setVisibility(View.GONE);
            checkBox3a.setVisibility(View.GONE);
            checkBox3b.setVisibility(View.GONE);
        }

        if (checkBoxAreaFlor.isChecked()) {
            tvFlor.setVisibility(View.VISIBLE);
            checkBox4a.setVisibility(View.VISIBLE);
            checkBox4b.setVisibility(View.VISIBLE);
        }else {
            tvFlor.setVisibility(View.GONE);
            checkBox4a.setVisibility(View.GONE);
            checkBox4b.setVisibility(View.GONE);
        }

        // Aquí puedes agregar más condiciones si necesitas mostrar otros CheckBoxes
    }
}
