package com.example.alumno1.task2_adrian_menendez_hnd.fragments;

import android.content.Context;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.alumno1.task2_adrian_menendez_hnd.R;
import com.example.alumno1.task2_adrian_menendez_hnd.activities.ObjetosActivity;
import com.example.alumno1.task2_adrian_menendez_hnd.adapters.ObjetosAdapter;
import com.example.alumno1.task2_adrian_menendez_hnd.beans.ObjetosBean;
import com.example.alumno1.task2_adrian_menendez_hnd.tests.Modelo;

import java.util.ArrayList;

public class ObjetosFragment extends Fragment implements AdapterView.OnItemClickListener{

    private ListView listObjetos;
    private ArrayList<ObjetosBean> objetos;

    public static final String OBJETOS_KEY="OBJETOS_KEY"; // Es pública para poder usarla en ObjetosActivity
    
    public ObjetosFragment() {
        // Required empty public constructor
    }

    public static ObjetosFragment newInstance(){
        return new ObjetosFragment();
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_objetos, container, false);
        listObjetos = (ListView) rootview.findViewById(R.id.listObjetos);
        objetos = Modelo.getObjetos();
        ObjetosAdapter objetosAdapter = new ObjetosAdapter(getActivity(), R.layout.item_objetos, objetos);
        listObjetos.setAdapter(objetosAdapter);
        listObjetos.setOnItemClickListener(this);
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
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        ObjetosBean objetosBean = objetos.get(i);
        Intent intent = new Intent(getActivity(), ObjetosActivity.class);
        intent.putExtra(OBJETOS_KEY, objetosBean);

        startActivity(intent);
    }
}
