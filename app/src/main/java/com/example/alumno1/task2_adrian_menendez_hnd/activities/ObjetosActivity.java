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
import com.example.alumno1.task2_adrian_menendez_hnd.beans.ObjetosBean;
import com.example.alumno1.task2_adrian_menendez_hnd.fragments.ObjetosFragment;

public class ObjetosActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView nombreObjeto;
    private TextView detalleObjeto;
    private ImageView imagen;
    private Button btnCompartir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_objetos);

       ObjetosBean objetosBean = (ObjetosBean) getIntent().getSerializableExtra(ObjetosFragment.OBJETOS_KEY);

        nombreObjeto = (TextView) findViewById(R.id.nombreObjeto);
        detalleObjeto = (TextView) findViewById(R.id.detalleObjeto);
        imagen = (ImageView) findViewById(R.id.imagen);
        btnCompartir = (Button) findViewById(R.id.btnCompartir);

        btnCompartir.setOnClickListener(this);

        // Mostramos por pantalla en el detalle de los objetos el nombre, texto y foto alamcenados en el ObjetosBean
        nombreObjeto.setText(String.valueOf(objetosBean.getNombreObjeto()));
        detalleObjeto.setText(String.valueOf(objetosBean.getDetalleObjeto()));
        imagen.setImageDrawable(ContextCompat.getDrawable(this, objetosBean.getImagen()));
    }

    @Override
    public void onClick(View view) {
        // Función para compartir el detalle por redes sociales
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, String.valueOf(detalleObjeto));
        startActivity(intent);
    }
}
