package com.example.alumno1.task2_adrian_menendez_hnd.activities;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.alumno1.task2_adrian_menendez_hnd.R;
import com.example.alumno1.task2_adrian_menendez_hnd.beans.PersonajesBean;
import com.example.alumno1.task2_adrian_menendez_hnd.fragments.PersonajesFragment;
import com.squareup.picasso.Picasso;

public class PersonajeActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView nombrePersonaje;
    private ImageView imgPersonaje;
    private TextView textoDetalle;
    private Button btnCompartir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personaje);

        PersonajesBean personajesBean = (PersonajesBean) getIntent().getSerializableExtra(PersonajesFragment.PERSONAJE_KEY);

        nombrePersonaje = (TextView) findViewById(R.id.nombrePersonaje);
        imgPersonaje = (ImageView) findViewById(R.id.imgPersonaje);
        textoDetalle = (TextView) findViewById(R.id.textoDetalle);
        btnCompartir = (Button) findViewById(R.id.btnCompartir);

        btnCompartir.setOnClickListener(this);

        // Mostramos por pantalla en el detalle del personaje el nombre, texto y foto alamcenados en PersonajesBean
        nombrePersonaje.setText(String.valueOf(personajesBean.getDescripcion()));

        Picasso.with(this)
                .load(personajesBean.getFoto())
                .into(imgPersonaje);
        //imgPersonaje.setImageDrawable(ContextCompat.getDrawable(this, personajesBean.getFoto()));
        textoDetalle.setText(String.valueOf(personajesBean.getDetalle()));
    }

    @Override
    public void onClick(View view) {
        // Función para compartir el detalle por redes sociales
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, String.valueOf(textoDetalle));
        startActivity(intent.createChooser(intent, "Compartir"));
    }
}
