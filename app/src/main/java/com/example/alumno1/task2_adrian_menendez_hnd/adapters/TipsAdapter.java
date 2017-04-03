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
import com.example.alumno1.task2_adrian_menendez_hnd.beans.TipsBean;

import java.util.List;

public class TipsAdapter extends ArrayAdapter<TipsBean>{
    private Context context;
    private int resource;
    private List<TipsBean> objects;

    public TipsAdapter(Context context, int resource, List<TipsBean> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    // Clase viewholder creada para no estar creando elementos de la lista
    class ViewHolder {
        private TextView nombreTips;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        ViewHolder viewHolder;
        if (view == null) {
            viewHolder = new ViewHolder();
            view = LayoutInflater.from(context).inflate(resource, null);
            viewHolder.nombreTips = (TextView) view.findViewById(R.id.nombreTips);
            view.setTag(viewHolder);

        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        TipsBean tipsBean = objects.get(position);
        viewHolder.nombreTips.setText(tipsBean.getNombreTips());

        return view;
    }
}
