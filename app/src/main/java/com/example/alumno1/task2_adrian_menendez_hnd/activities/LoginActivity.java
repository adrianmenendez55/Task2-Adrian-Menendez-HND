package com.example.alumno1.task2_adrian_menendez_hnd.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.alumno1.task2_adrian_menendez_hnd.MainActivity;
import com.example.alumno1.task2_adrian_menendez_hnd.Preferencias;
import com.example.alumno1.task2_adrian_menendez_hnd.R;
import com.example.alumno1.task2_adrian_menendez_hnd.beans.UsuarioBean;
import com.example.alumno1.task2_adrian_menendez_hnd.tests.Utils;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editEmail, editPass;
    private Button btnEntrar;
    private Button btnNuevo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Preferencias preferencias = new Preferencias(LoginActivity.this);
        if (preferencias.isLogin() == false) {
            editEmail = (EditText) findViewById(R.id.editEmail);
            editPass = (EditText) findViewById(R.id.editPass);
            btnEntrar = (Button) findViewById(R.id.btnEntrar);
            btnNuevo = (Button) findViewById(R.id.btnNuevo);

            // Escuchadores de los botones
            btnEntrar.setOnClickListener(this);
            btnNuevo.setOnClickListener(this);
        } else {
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnNuevo:
                // Al pulsar el botón nuevo se abrirá la actividad de registro/nuevo usuario
                Intent intent = new Intent(LoginActivity.this, NuevoUsuarioActivity.class);
                startActivity(intent);
                finish();
                break;
            case R.id.btnEntrar:
                // Al pulsar el botón entrar, si se realiza bien, se abrirá la actividad principal
                String email = editEmail.getText().toString();
                String pass = editPass.getText().toString();
                if (email != null && pass != null && !email.isEmpty() && !pass.isEmpty() && Utils.isEmail(email)) {
                    Preferencias preferencias = new Preferencias(LoginActivity.this);
                    UsuarioBean usuarioBean = preferencias.getUsuario();
                    if (usuarioBean.getEmail() != null) {
                        if (email.equals(usuarioBean.getEmail()) && pass.equals(usuarioBean.getPassword())) {
                            // Si el email y la contraseña son los usados en el registro, se abre la actividad principal
                            preferencias.setLogin(true);
                            intent = new Intent(LoginActivity.this, MainActivity.class);
                            startActivity(intent);
                            finish();
                        } else {
                            Toast.makeText(LoginActivity.this, getString(R.string.datosinc), Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(LoginActivity.this, getString(R.string.usu), Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(LoginActivity.this, getString(R.string.oblig), Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}
