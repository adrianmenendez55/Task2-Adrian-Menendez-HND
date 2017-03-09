package com.example.alumno1.task2_adrian_menendez_hnd.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.alumno1.task2_adrian_menendez_hnd.Preferencias;
import com.example.alumno1.task2_adrian_menendez_hnd.R;
import com.example.alumno1.task2_adrian_menendez_hnd.beans.UsuarioBean;

public class PerfilFragment extends Fragment {

    private TextView textoUsuario;

    public PerfilFragment() {
        // Required empty public constructor
    }

    public static PerfilFragment newInstance(){
        return new PerfilFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_perfil, container, false);
        Preferencias preferencias = new Preferencias(getActivity());
        UsuarioBean usuarioBean = preferencias.getUsuario();
        textoUsuario.setText(String.valueOf(usuarioBean.getNombre()));
        return view;
        // Verificar acceso email y que las contraseñas sean iguales, y acceder al perfil
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
