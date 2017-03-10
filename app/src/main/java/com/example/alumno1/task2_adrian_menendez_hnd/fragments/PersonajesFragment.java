package com.example.alumno1.task2_adrian_menendez_hnd.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.alumno1.task2_adrian_menendez_hnd.R;

public class PersonajesFragment extends Fragment {

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
