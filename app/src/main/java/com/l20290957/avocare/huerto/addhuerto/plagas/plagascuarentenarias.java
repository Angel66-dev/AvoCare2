package com.l20290957.avocare.huerto.addhuerto.plagas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputLayout;
import com.l20290957.avocare.R;
import com.l20290957.avocare.huerto.MisHuertos;
import com.l20290957.avocare.login.login.login;
import com.l20290957.avocare.services.avocadoApi.api.AuthApi;
import com.l20290957.avocare.services.avocadoApi.api.HuertosApi;
import com.l20290957.avocare.services.avocadoApi.client.AvocadoCareApiClient;
import com.l20290957.avocare.services.avocadoApi.models.Huertos.responses.CreateHuertos;
import com.l20290957.avocare.services.avocadoApi.models.Huertos.responses.HuertosIdResponse;
import com.l20290957.avocare.services.avocadoApi.models.auth.SesionRepository;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class plagascuarentenarias extends AppCompatActivity {
    private HuertosApi huertosApi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plagascuarentenarias);
        initComponents();
    }

    private void initComponents() {

        huertosApi = AvocadoCareApiClient.get_instance().create(HuertosApi.class);

        Button btn = findViewById(R.id.agregarHuerto2);
        btn.setOnClickListener(this::metodomamalon);
    }

    private void metodomamalon(View view) {
        Toast.makeText(this, "Hola perras", Toast.LENGTH_LONG).show();

        Bundle extras = getIntent().getExtras();

        SesionRepository sesionRepository = SesionRepository.getInstance();
        CreateHuertos createHuertos = new CreateHuertos();
        createHuertos.setIDUsuario(sesionRepository.getUsuarioLogeado().getID());
        createHuertos.setNombre(extras.getString("nombre"));
        createHuertos.setLatitud(extras.getDouble("latitud"));
        createHuertos.setLongitud(extras.getDouble("longitud"));
        createHuertos.setTipoSuelo(extras.getString("tipoSuelo"));
        createHuertos.setVariedad(extras.getString("variedad"));
        createHuertos.setMercadoOBJ(extras.getString("mercadoOBJ"));
        createHuertos.setOrganico(extras.getString("organico"));
        createHuertos.setEtapaFenologica(extras.getString("etapaFenologica"));
        createHuertos.setTipoRiego(extras.getString("tipoRiego"));

        String token = sesionRepository.getToken();

        huertosApi.createHuertos( sesionRepository.getToken(), createHuertos  ).subscribeOn(Schedulers.io()).observeOn(
                AndroidSchedulers.mainThread()).subscribe(this::onCreateApiResponse,this::onLoginError);
    }


    private void onCreateApiResponse(HuertosIdResponse huertosIdResponse) {
        SesionRepository sesionRepository = SesionRepository.getInstance();
        sesionRepository.getToken();
        sesionRepository.getUsuarioLogeado();

        Intent intent = new Intent(this, MisHuertos.class);
        startActivity(intent);
        finish();

    }

    private void onLoginError(Throwable throwable) {
        Toast.makeText(this, "Ocurrio algun error inesperado: \n" + throwable.getMessage(), Toast.LENGTH_LONG).show();
    }

}