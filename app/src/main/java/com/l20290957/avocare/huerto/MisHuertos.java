package com.l20290957.avocare.huerto;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.l20290957.avocare.R;
import com.l20290957.avocare.huerto.addhuerto.AddHuerto;
import com.l20290957.avocare.services.avocadoApi.api.HuertosApi;
import com.l20290957.avocare.services.avocadoApi.client.AvocadoCareApiClient;
import com.l20290957.avocare.services.avocadoApi.models.Huertos.responses.HuertosUserListResponse;
import com.l20290957.avocare.services.avocadoApi.models.auth.SesionRepository;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class MisHuertos extends AppCompatActivity {
private HuertosApi huertosApi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mishuertos);
        initComponents();
    }

    private void initComponents() {
        huertosApi = AvocadoCareApiClient.get_instance().create(HuertosApi.class);
        FloatingActionButton fabAdd = findViewById(R.id.mishuertosFab);
        fabAdd.setOnClickListener(view -> {
            Intent intent = new Intent(this, AddHuerto.class);
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
        obtenerHuertos();
    }

    private void obtenerHuertos() {

        SesionRepository sesionRepository = SesionRepository.getInstance();
        String idUsuario = sesionRepository.getUsuarioLogeado().getID();
        String token = sesionRepository.getToken();
        huertosApi.getUserHuertosInfo( token, idUsuario ).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(this::onHuertosInfoApiResponse,this::onLoginError);
    }

    private void onHuertosInfoApiResponse(HuertosUserListResponse huertosUserListResponse) {
        String token = huertosUserListResponse.getToken();
        SesionRepository sesionRepository = SesionRepository.getInstance();

        sesionRepository.setToken(token);
        Toast.makeText(this, "Se resivieron los huertos: " + huertosUserListResponse.getHuertos().size(), Toast.LENGTH_LONG).show();

    }
    private void onLoginError(Throwable throwable) {
        Toast.makeText(this, "Ocurrio algun error inesperado: \n" + throwable.getMessage(), Toast.LENGTH_LONG).show();
    }
}