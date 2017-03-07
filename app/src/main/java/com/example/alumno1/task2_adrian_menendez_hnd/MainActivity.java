package com.example.alumno1.task2_adrian_menendez_hnd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnSalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSalir = (Button) findViewById(R.id.btnSalir);

        btnSalir.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Preferencias preferencias = new Preferencias(MainActivity.this);
        preferencias.setLogin(false);
        Intent intent = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(intent);
        finish();
    }
}
