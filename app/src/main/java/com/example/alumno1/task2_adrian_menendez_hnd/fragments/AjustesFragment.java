package com.example.alumno1.task2_adrian_menendez_hnd.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.alumno1.task2_adrian_menendez_hnd.R;

public class AjustesFragment extends Fragment {

    private TextView textoContacto;
    private TextView textoInfo;
    private TextView textoVersion;

    public AjustesFragment() {
        // Required empty public constructor
    }

    public static AjustesFragment newInstance() {
        return new AjustesFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_ajustes, container, false);
        textoContacto = (TextView) rootview.findViewById(R.id.textoContacto);
        textoInfo = (TextView) rootview.findViewById(R.id.textoInfo);
        textoVersion = (TextView) rootview.findViewById(R.id.textoVersion);
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
}
