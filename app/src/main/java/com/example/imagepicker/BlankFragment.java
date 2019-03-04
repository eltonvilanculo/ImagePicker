package com.example.imagepicker;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class BlankFragment extends BottomSheetDialogFragment {


    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_blank, container, false);
        setupRecyclerView(view);
        return view;
    }

    void setupRecyclerView(View view) {

        RecyclerView recyclerView = view.findViewById(R.id.recycle_id);
        ModeloAdapter modeloAdapter = new ModeloAdapter(getActivity(), ObjectoModelo.fillObject());
        recyclerView.setAdapter(modeloAdapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        /*
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        //recyclerView.setAnimation(new DefaultItemAnimator());
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
..0*/
    }
}
