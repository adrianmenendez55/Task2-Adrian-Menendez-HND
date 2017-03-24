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

import com.example.alumno1.task2_adrian_menendez_hnd.R;
import com.example.alumno1.task2_adrian_menendez_hnd.beans.ObjetosBean;

import java.util.List;

public class ObjetosAdapter extends ArrayAdapter<ObjetosBean>{
    private Context context;
    private int resource;
    private List<ObjetosBean> objects;

    public ObjetosAdapter(Context context, int resource, List<ObjetosBean> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    // Clase viewholder creada para no estar creando elementos de la lista
    class ViewHolder {
        private TextView nombreObjeto;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        ViewHolder viewHolder;
        if (view == null) {
            viewHolder = new ViewHolder();
            view = LayoutInflater.from(context).inflate(resource, null);
            viewHolder.nombreObjeto = (TextView) view.findViewById(R.id.nombreObjeto);
            view.setTag(viewHolder);

        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        ObjetosBean objetosBean = objects.get(position);
        viewHolder.nombreObjeto.setText(objetosBean.getNombreObjeto());

        return view;
    }
}
