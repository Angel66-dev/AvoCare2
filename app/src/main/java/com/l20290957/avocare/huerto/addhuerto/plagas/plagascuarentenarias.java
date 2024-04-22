package com.l20290957.avocare.huerto.addhuerto.plagas;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputLayout;
import com.l20290957.avocare.R;
import com.l20290957.avocare.services.avocadoApi.api.HuertosApi;
import com.l20290957.avocare.services.avocadoApi.client.AvocadoCareApiClient;
import com.l20290957.avocare.services.avocadoApi.models.Huertos.responses.CreateHuertos;
import com.l20290957.avocare.services.avocadoApi.models.Huertos.responses.HuertosIdResponse;
import com.l20290957.avocare.services.avocadoApi.models.auth.SesionRepository;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class plagascuarentenarias extends AppCompatActivity {
    private String idUsuario;
    private TextInputLayout nombre;
    private TextInputLayout latitud;
    private TextInputLayout longitud;
    private TextInputLayout tipoSuelo;
    private TextInputLayout variedad;
    private TextInputLayout mercadoOBJ;
    private TextInputLayout organico;
    private TextInputLayout etapaFenologica;
    private TextInputLayout tipoRiego;
    private double latitudDouble=0, longitudDouble=0;
    private HuertosApi huertosApi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plagascuarentenarias);
        initComponents();
    }

    private void initComponents() {

        nombre = findViewById(R.id.addhuertoEtName);
        latitud = findViewById(R.id.addhuertoBtnLatitud);
        longitud = findViewById(R.id.addhuertoBtnLongitud);
        tipoSuelo = findViewById(R.id.addhuertoBtnTipoSuelo);
        variedad = findViewById(R.id.detallehuertoBtnVariedad);
        mercadoOBJ = findViewById(R.id.detallehuertoBtnMerObj);
        organico = findViewById(R.id.detallehuertoBtnOrganico);
        etapaFenologica = findViewById(R.id.detallehuertoBtnEtapa);
        tipoRiego = findViewById(R.id.addhuertoBtnTipoRiego);

        huertosApi = AvocadoCareApiClient.get_instance().create(HuertosApi.class);

        FloatingActionButton btn = findViewById(R.id.plagasFab);
        btn.setOnClickListener(this::onBtnGuardarHuertoClick);
    }

    private void onBtnGuardarHuertoClick(View view) {
        String nombreValue, latitudValue, longitudValue, tipoSueloValue, tipoRiegoValue, vaiedadValue, mercadoOBJValue, organicoValue, etapaValue;
        nombreValue = nombre.getEditText().getText().toString();
        latitudValue = latitud.getEditText().getText().toString();
        longitudValue = longitud.getEditText().getText().toString();
        tipoSueloValue = tipoSuelo.getEditText().getText().toString();
        tipoRiegoValue = tipoRiego.getEditText().getText().toString();
        vaiedadValue = variedad.getEditText().getText().toString();
        mercadoOBJValue = mercadoOBJ.getEditText().getText().toString();
        organicoValue = organico.getEditText().getText().toString();
        etapaValue = etapaFenologica.getEditText().getText().toString();

        if(nombreValue.length()<3){
            Toast.makeText(this, "Ingresa un nombre de huerto mayor a 3 caracteres", Toast.LENGTH_LONG).show();
            return;
        }

        double latitudDoubleValue = 0.0, longitudDoubleValue = 0.0;

        try {
            latitudDoubleValue = Double.parseDouble(latitudValue);
        } catch (NumberFormatException e) {
            // Manejar la excepción si la latitud no es un valor numérico
            Toast.makeText(this, "La latitud debe ser un valor numérico", Toast.LENGTH_LONG).show();
            return;
        }

        if (latitudValue.matches("^(\\-?\\d+(\\.\\d+)?)$")==false){
            Toast.makeText(this, "Ingresa la latitud valida", Toast.LENGTH_LONG).show();
            return;
        } else {
            latitudDouble = Double.parseDouble(latitudValue);
        }

        try {
            longitudDoubleValue = Double.parseDouble(longitudValue);
        } catch (NumberFormatException e) {
            // Manejar la excepción si la latitud no es un valor numérico
            Toast.makeText(this, "La longitud debe ser un valor numérico", Toast.LENGTH_LONG).show();
            return;
        }

        if (longitudValue.matches("^(\\-?\\d+(\\.\\d+)?)$")==false){
            Toast.makeText(this, "Ingresa la longitud valida", Toast.LENGTH_LONG).show();
            return;
        } else {
            longitudDouble = Double.parseDouble(longitudValue);
        }

        if(tipoSueloValue.length()<3){
            Toast.makeText(this, "Ingresa un tipo de suelo mayor a 3 caracteres", Toast.LENGTH_LONG).show();
            return;
        }

        if(tipoRiegoValue.length()<3){
            Toast.makeText(this, "Ingresa un tipo de riego mayor a 3 caracteres", Toast.LENGTH_LONG).show();
            return;
        }

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

        SesionRepository sesionRepository = SesionRepository.getInstance();
        CreateHuertos createHuertos = new CreateHuertos();
        createHuertos.setIDUsuario(sesionRepository.getUsuarioLogeado().getID());
        createHuertos.getLatitud(latitudDouble);
        createHuertos.getLongitud(longitudDouble);
        createHuertos.getTipoSuelo(tipoSueloValue);
        createHuertos.getVariedad(vaiedadValue);
        createHuertos.getMercadoOBJ(mercadoOBJValue);
        createHuertos.getOrganico(organicoValue);
        createHuertos.getEtapaFenologica(etapaValue);
        createHuertos.getTipoRiego(tipoRiegoValue);

        huertosApi.createHuertos( sesionRepository.getToken(), createHuertos  ).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(this::onCreateApiResponse,this::onLoginError);
    }

    private void onCreateApiResponse(HuertosIdResponse huertosIdResponse) {
        SesionRepository sesionRepository = SesionRepository.getInstance();
        sesionRepository.getToken();
        sesionRepository.getUsuarioLogeado();

        //String token = huertosIdResponse.getToken(token);
        //sesionRepository.setToken(token);

    }

    private void onLoginError(Throwable throwable) {
        Toast.makeText(this, "Ocurrio algun error inesperado: \n" + throwable.getMessage(), Toast.LENGTH_LONG).show();
    }

}