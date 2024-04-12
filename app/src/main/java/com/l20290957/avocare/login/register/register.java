package com.l20290957.avocare.login.register;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputLayout;
import com.l20290957.avocare.R;
import com.l20290957.avocare.login.login.login;
import com.l20290957.avocare.services.avocadoApi.api.AuthApi;
import com.l20290957.avocare.services.avocadoApi.client.AvocadoCareApiClient;
import com.l20290957.avocare.services.avocadoApi.models.auth.User;
import com.l20290957.avocare.services.avocadoApi.models.auth.responses.CreateUser;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class register extends AppCompatActivity {
    private TextInputLayout correo;
    private TextInputLayout contra;
    private TextInputLayout usuario;
    private TextInputLayout contra2;
    private AuthApi authApi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        initComponents();
    }

    private void initComponents() {
        TextView tvIniciarSesion = findViewById(R.id.registerTvCrearCuenta);
        tvIniciarSesion.setOnClickListener(this::getBackToLogin);

        Button btn = findViewById(R.id.registerBtnAcceder);
        correo = findViewById(R.id.registerTilEmail);
        contra = findViewById(R.id.registerTilPassword);
        contra2 = findViewById(R.id.registerTilConfirmPassword);
        usuario = findViewById(R.id.registerTilUsername);

        authApi = AvocadoCareApiClient.get_instance().create(AuthApi.class);

        ImageView imageView = findViewById(R.id.registerIvBack);
        imageView.setOnClickListener(view -> {
            finish();
        });

        btn.setOnClickListener(this::onBtnRegisterClick);
    }

    private void onBtnRegisterClick(View view) {
        String contraValue, correoValue, contra2Value, userValue;
        contraValue = contra.getEditText().getText().toString();
        contra2Value = contra2.getEditText().getText().toString();
        correoValue = correo.getEditText().getText().toString();
        userValue = usuario.getEditText().getText().toString();

        if(userValue.length()<3){
            Toast.makeText(this, "Ingresa un nombre de usuario mayor a 3 caracteres", Toast.LENGTH_LONG).show();
            return;
        }

        if(contraValue.length()<8){
            Toast.makeText(this, "Ingresa una contraseña valida", Toast.LENGTH_LONG).show();
            return;
        }

        if (correoValue.matches("^[\\w-.]+@([\\w-]+.)+[\\w-]{2,4}$")==false){
            Toast.makeText(this, "Ingresa un correo electronico valido", Toast.LENGTH_LONG).show();
            return;
        }

        if (contraValue.equals(contra2Value)==false){
            Toast.makeText(this, "La contraseña no coincide", Toast.LENGTH_LONG).show();
            return;
        }


        CreateUser register = new CreateUser();
        register.setCorreo(correoValue);
        register.setContra(contraValue);
        register.setNombre(userValue);

        authApi.register( register ).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(this::onRegisterApiResponse,this::onRegisterError);

    }

    private void onRegisterApiResponse(User user) {

        CreateUser createUser = CreateUser.getInstance();
        String usuario = createUser.getNombre();
        String correo = createUser.getCorreo();
        String contra = createUser.getContra();

        createUser.setCorreo(correo);
        createUser.setContra(contra);
        createUser.setNombre(usuario);

        Intent intent = new Intent(this, login.class);
        startActivity(intent);
        finish();
    }

    private void onRegisterError(Throwable throwable) {
        Toast.makeText(this, "Ocurrio algun error inesperado: \n" + throwable.getMessage(), Toast.LENGTH_LONG).show();
    }
    private void getBackToLogin(View view){
        finish();
    }
}