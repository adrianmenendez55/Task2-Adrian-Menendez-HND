package com.example.alumno1.task2_adrian_menendez_hnd.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.alumno1.task2_adrian_menendez_hnd.MainActivity;
import com.example.alumno1.task2_adrian_menendez_hnd.R;
import com.example.alumno1.task2_adrian_menendez_hnd.activities.PersonajeActivity;
import com.example.alumno1.task2_adrian_menendez_hnd.beans.PersonajesBean;
import com.squareup.picasso.Picasso;

import java.util.List;

public class PersonajesAdapter extends ArrayAdapter<PersonajesBean>{

    private Context context;
    private int resource;
    private List<PersonajesBean> objects;

    public PersonajesAdapter(Context context, int resource, List<PersonajesBean> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }
    // Clase viewholder creada para no estar creando elementos de la lista
    class ViewHolder {
        TextView txtNomPersonaje;
        ImageView imagenPersonaje;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        ViewHolder viewHolder;
        if (view == null) {
            viewHolder = new ViewHolder();
            view = LayoutInflater.from(context).inflate(resource, null);
            viewHolder.txtNomPersonaje = (TextView) view.findViewById(R.id.txtNomPersonaje);
            viewHolder.imagenPersonaje = (ImageView) view.findViewById(R.id.imagenPersonaje);
            view.setTag(viewHolder);

        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        PersonajesBean personajesBean = objects.get(position);
        viewHolder.txtNomPersonaje.setText(personajesBean.getDescripcion());
        //viewHolder.imagenPersonaje.setImageDrawable(ContextCompat.getDrawable(context, personajesBean.getFoto()));
        Picasso.with(context)
                .load(personajesBean.getFoto())
                .resize(50, 50)
                .centerCrop()
                .into(viewHolder.imagenPersonaje);
        return view;
    }
}
