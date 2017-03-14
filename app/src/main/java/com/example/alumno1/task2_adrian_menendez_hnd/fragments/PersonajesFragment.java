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
import com.example.alumno1.task2_adrian_menendez_hnd.activities.PersonajeActivity;
import com.example.alumno1.task2_adrian_menendez_hnd.adapters.PersonajesAdapter;
import com.example.alumno1.task2_adrian_menendez_hnd.beans.PersonajesBean;
import com.example.alumno1.task2_adrian_menendez_hnd.tests.Modelo;

import java.util.ArrayList;

public class PersonajesFragment extends Fragment implements AdapterView.OnItemClickListener{

    private ListView listPersonajes;
    private ArrayList<PersonajesBean> personajes;

    public static final String PERSONAJE_KEY="PERSONAJE_KEY"; // Es pública para poder usarla en PersonajeActivity


    public PersonajesFragment() {
        // Required empty public constructor
    }

    public static PersonajesFragment newInstance(){
        return new PersonajesFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_personajes, container, false);
        listPersonajes = (ListView) rootview.findViewById(R.id.listPersonajes);
        personajes = Modelo.getPersonajes();
        PersonajesAdapter personajesAdapter = new PersonajesAdapter(getActivity(), R.layout.item_personajes, personajes);
        listPersonajes.setAdapter(personajesAdapter);
        listPersonajes.setOnItemClickListener(this);
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
        PersonajesBean personajesBean = personajes.get(i);
        Intent intent = new Intent(getActivity(), PersonajeActivity.class);
        intent.putExtra(PERSONAJE_KEY, personajesBean);

        startActivity(intent);
    }
}
