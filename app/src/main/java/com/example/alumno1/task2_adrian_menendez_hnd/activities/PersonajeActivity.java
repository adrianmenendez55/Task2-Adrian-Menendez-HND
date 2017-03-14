package com.example.alumno1.task2_adrian_menendez_hnd.activities;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.alumno1.task2_adrian_menendez_hnd.R;
import com.example.alumno1.task2_adrian_menendez_hnd.beans.PersonajesBean;
import com.example.alumno1.task2_adrian_menendez_hnd.fragments.PersonajesFragment;

public class PersonajeActivity extends AppCompatActivity {

    private ImageView imgPersonaje;
    private TextView textoDetalle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personaje);

        PersonajesBean personajesBean = (PersonajesBean) getIntent().getSerializableExtra(PersonajesFragment.PERSONAJE_KEY);

        imgPersonaje = (ImageView) findViewById(R.id.imgPersonaje);
        textoDetalle = (TextView) findViewById(R.id.textoDetalle);

        imgPersonaje.setImageDrawable(ContextCompat.getDrawable(this, personajesBean.getFoto()));
        textoDetalle.setText(String.valueOf(personajesBean.getDetalle()));
    }
}
