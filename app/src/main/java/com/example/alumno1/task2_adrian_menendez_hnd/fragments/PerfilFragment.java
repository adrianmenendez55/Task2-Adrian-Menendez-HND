package com.example.alumno1.task2_adrian_menendez_hnd.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.alumno1.task2_adrian_menendez_hnd.Preferencias;
import com.example.alumno1.task2_adrian_menendez_hnd.R;
import com.example.alumno1.task2_adrian_menendez_hnd.beans.UsuarioBean;

public class PerfilFragment extends Fragment {

    private TextView textoUsuario;
    private TextView textoApellido;
    private TextView textoEmail;

    public PerfilFragment() {
        // Required empty public constructor
    }

    public static PerfilFragment newInstance(){
        return new PerfilFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_perfil, container, false);
        textoUsuario = (TextView)rootview.findViewById(R.id.textoUsuario);
        textoApellido = (TextView) rootview.findViewById(R.id.textoApellido);
        textoEmail = (TextView) rootview.findViewById(R.id.textoEmail);

        Preferencias preferencias = new Preferencias(getActivity());
        UsuarioBean usuarioBean = preferencias.getUsuario();
        textoUsuario.setText("Nombre del usuario: " +(usuarioBean.getNombre()));
        textoApellido.setText("Apellido del usuario: " +(usuarioBean.getApellidos()));
        textoEmail.setText("Email del usuario: " + usuarioBean.getEmail());
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
