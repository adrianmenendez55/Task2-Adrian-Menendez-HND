package com.example.alumno1.task2_adrian_menendez_hnd.activities;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.alumno1.task2_adrian_menendez_hnd.R;
import com.example.alumno1.task2_adrian_menendez_hnd.beans.ObjetosBean;
import com.example.alumno1.task2_adrian_menendez_hnd.fragments.ObjetosFragment;

public class ObjetosActivity extends AppCompatActivity {

    private TextView detalleObjeto;
    private ImageView imagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_objetos);

       ObjetosBean objetosBean = (ObjetosBean) getIntent().getSerializableExtra(ObjetosFragment.OBJETOS_KEY);

        detalleObjeto = (TextView) findViewById(R.id.detalleObjeto);
        imagen = (ImageView) findViewById(R.id.imagen);

        detalleObjeto.setText(String.valueOf(objetosBean.getDetalleObjeto()));
        imagen.setImageDrawable(ContextCompat.getDrawable(this, objetosBean.getImagen()));
    }
}
