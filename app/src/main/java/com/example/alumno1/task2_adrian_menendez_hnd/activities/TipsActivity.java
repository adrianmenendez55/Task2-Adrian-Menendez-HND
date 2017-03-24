package com.example.alumno1.task2_adrian_menendez_hnd.activities;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.alumno1.task2_adrian_menendez_hnd.R;
import com.example.alumno1.task2_adrian_menendez_hnd.beans.TipsBean;
import com.example.alumno1.task2_adrian_menendez_hnd.fragments.TipsFragment;

import java.io.Serializable;

public class TipsActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView detalleTips;
    private Button btnCompartir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);

        TipsBean tipsBean = (TipsBean) getIntent().getSerializableExtra(TipsFragment.TIPS_KEY);

        detalleTips = (TextView) findViewById(R.id.detalleTips);
        btnCompartir = (Button) findViewById(R.id.btnCompartir);

        btnCompartir.setOnClickListener(this);

        detalleTips.setText(String.valueOf(tipsBean.getDetalleTips()));
    }

    @Override
    public void onClick(View view) {
        //Función de compartir en redes sociales
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, String.valueOf(detalleTips));
        startActivity(intent);
    }
}
