package com.example.alumno1.task2_adrian_menendez_hnd.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.alumno1.task2_adrian_menendez_hnd.R;
import com.example.alumno1.task2_adrian_menendez_hnd.beans.TipsBean;
import com.example.alumno1.task2_adrian_menendez_hnd.fragments.TipsFragment;

public class TipsActivity extends AppCompatActivity {

    private TextView detalleTips;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);

        TipsBean tipsBean = (TipsBean) getIntent().getSerializableExtra(TipsFragment.TIPS_KEY);

        detalleTips = (TextView) findViewById(R.id.detalleTips);

        detalleTips.setText(String.valueOf(tipsBean.getDetalleTips()));
    }
}
