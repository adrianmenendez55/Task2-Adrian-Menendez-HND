package com.example.alumno1.task2_adrian_menendez_hnd.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.alumno1.task2_adrian_menendez_hnd.R;

public class DescripcionFragment extends Fragment {

    public DescripcionFragment() {
        // Required empty public constructor
    }

    public static DescripcionFragment newInstance(){
        return new DescripcionFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_descripcion, container, false);
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
