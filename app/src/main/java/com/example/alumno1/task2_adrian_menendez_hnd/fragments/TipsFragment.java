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
import com.example.alumno1.task2_adrian_menendez_hnd.activities.TipsActivity;
import com.example.alumno1.task2_adrian_menendez_hnd.adapters.TipsAdapter;
import com.example.alumno1.task2_adrian_menendez_hnd.beans.TipsBean;
import com.example.alumno1.task2_adrian_menendez_hnd.tests.Modelo;

import java.util.ArrayList;

public class TipsFragment extends Fragment implements AdapterView.OnItemClickListener{

    private ListView listTips;
    private ArrayList<TipsBean> tips;

    public static final String TIPS_KEY="TIPS_KEY"; // Es pública para poder usarla en TipsActivity

    public TipsFragment() {
        // Required empty public constructor
    }

    public static TipsFragment newInstance() {
        return new TipsFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View rootview =  inflater.inflate(R.layout.fragment_tips, container, false);
        listTips = (ListView) rootview.findViewById(R.id.listTips);
        tips = Modelo.getTips();
        TipsAdapter tipsAdapter = new TipsAdapter(getActivity(), R.layout.item_tips, tips);
        listTips.setAdapter(tipsAdapter);
        listTips.setOnItemClickListener(this);
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
        TipsBean tipsBean = tips.get(i);
        Intent intent = new Intent(getActivity(), TipsActivity.class);
        intent.putExtra(TIPS_KEY, tipsBean);

        startActivity(intent);
    }
}
