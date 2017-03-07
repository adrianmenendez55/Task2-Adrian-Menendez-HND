package com.example.alumno1.task2_adrian_menendez_hnd.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.alumno1.task2_adrian_menendez_hnd.Preferencias;
import com.example.alumno1.task2_adrian_menendez_hnd.R;
import com.example.alumno1.task2_adrian_menendez_hnd.beans.UsuarioBean;

public class NuevoUsuarioActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editEmail, editNombre, editApellidos, editPassword, editPassword2;
    private Button btnGuardar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevo_usuario);

        editEmail = (EditText) findViewById(R.id.editEmail);
        editNombre = (EditText) findViewById(R.id.editNombre);
        editApellidos = (EditText) findViewById(R.id.editApellidos);
        editPassword = (EditText) findViewById(R.id.editPassword);
        editPassword2 = (EditText) findViewById(R.id.editPassword2);

        btnGuardar = (Button) findViewById(R.id.btnGuardar);

        btnGuardar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String email = editEmail.getText().toString();
        String nombre = editNombre.getText().toString();
        String apellidos = editApellidos.getText().toString();
        String password = editPassword.getText().toString();
        String password2 = editPassword2.getText().toString();

        if (email != null && nombre != null && apellidos != null && password != null && password2 != null &&
                !email.isEmpty() && !nombre.isEmpty() && !apellidos.isEmpty() && !password.isEmpty() && !password2.isEmpty()) {
            // email formato correcto, pass1 y pass2 iguales
            UsuarioBean usuarioBean = new UsuarioBean(email, nombre, apellidos, password);

            Preferencias preferencias = new Preferencias(NuevoUsuarioActivity.this);
            preferencias.setUsuario(usuarioBean);

            Toast.makeText(NuevoUsuarioActivity.this,
                    "Usuario guardado",
                    Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(NuevoUsuarioActivity.this, LoginActivity.class);
            startActivity(intent);
            finish();
        } else {
            Toast.makeText(NuevoUsuarioActivity.this,
                    "Datos obligatorios",
                    Toast.LENGTH_SHORT).show();
        }

    }

}
