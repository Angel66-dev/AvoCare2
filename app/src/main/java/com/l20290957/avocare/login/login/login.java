package com.l20290957.avocare.login.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputLayout;
import com.l20290957.avocare.R;
import com.l20290957.avocare.huerto.MisHuertos;
import com.l20290957.avocare.login.register.register;
import com.l20290957.avocare.services.avocadoApi.api.AuthApi;
import com.l20290957.avocare.services.avocadoApi.client.AvocadoCareApiClient;
import com.l20290957.avocare.services.avocadoApi.models.auth.SesionRepository;
import com.l20290957.avocare.services.avocadoApi.models.auth.User;
import com.l20290957.avocare.services.avocadoApi.models.auth.responses.LoginUser;
import com.l20290957.avocare.services.avocadoApi.models.auth.responses.UserResponse;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class login extends AppCompatActivity {
private TextInputLayout correo;
private TextInputLayout contra;
private AuthApi authApi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initComponents();

    }

    private void initComponents() {
        authApi = AvocadoCareApiClient.get_instance().create(AuthApi.class);

        TextView tvCrearCuenta = findViewById(R.id.loginTvCrearCuenta);
        tvCrearCuenta.setOnClickListener(view -> {
            Intent intent = new Intent(this, register.class);
            startActivity(intent);
        });

        Button btnLogin = findViewById(R.id.loginBtnAcceder);
        correo = findViewById(R.id.loginTilEmail);
        contra = findViewById(R.id.loginTilPassword);

        /* btnLogin.setOnClickListener(View -> {
            Intent intent = new Intent(this, MisHuertos.class);
            startActivity(intent);
        }); */

        btnLogin.setOnClickListener(this::onBtnLoginClick);
    }

    private void onBtnLoginClick(View view) {
        String contraValue, correoValue;
        contraValue = contra.getEditText().getText().toString();
        correoValue = correo.getEditText().getText().toString();

        if(contraValue.length()<8){
            Toast.makeText(this, "Ingresa una contraseña valida", Toast.LENGTH_LONG).show();
            return;
        }

        if (correoValue.matches("^[\\w-.]+@([\\w-]+.)+[\\w-]{2,4}$")==false){
            Toast.makeText(this, "Ingresa un correo electronico valido", Toast.LENGTH_LONG).show();
            return;
        }

        LoginUser login = new LoginUser();
        login.setCorreo(correoValue);
        login.setContra(contraValue);

        authApi.login( login ).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(this::onLoginApiResponse,this::onLoginError);

    }

    private void onLoginApiResponse(UserResponse userResponse) {

        String token = userResponse.getToken();
        User user = userResponse.getUser();
        SesionRepository sesionRepository = SesionRepository.getInstance();

        sesionRepository.setToken(token);
        sesionRepository.setUsuarioLogeado(user);

        Intent intent = new Intent(this, MisHuertos.class);
        startActivity(intent);
    }

    private void onLoginError(Throwable throwable) {
        Toast.makeText(this, "Ocurrio algun error inesperado: \n" + throwable.getMessage(), Toast.LENGTH_LONG).show();
    }
}