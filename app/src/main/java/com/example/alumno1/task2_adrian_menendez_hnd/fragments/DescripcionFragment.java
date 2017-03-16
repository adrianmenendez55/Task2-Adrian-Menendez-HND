package com.example.alumno1.task2_adrian_menendez_hnd.fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.alumno1.task2_adrian_menendez_hnd.R;

public class DescripcionFragment extends Fragment implements View.OnClickListener{

    private TextView txtDescrip;
    private Button btnCompartir;

    public DescripcionFragment() {
        // Required empty public constructor
    }

    public static DescripcionFragment newInstance(){
        return new DescripcionFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_descripcion, container, false);
        txtDescrip = (TextView) rootview.findViewById(R.id.txtDescrip);
        btnCompartir = (Button) rootview.findViewById(R.id.btnCompartir);

        btnCompartir.setOnClickListener(this);

        return rootview;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, String.valueOf(txtDescrip));
        startActivity(intent.createChooser(intent, "Compartir"));
    }
}
