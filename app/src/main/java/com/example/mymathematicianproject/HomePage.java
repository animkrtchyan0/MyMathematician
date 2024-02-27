package com.example.mymathematicianproject;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class HomePage extends Fragment {

    public HomePage() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home_page, container, false);

        LinearLayout layout1 = view.findViewById(R.id.category1);
        layout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),LevelPageVar.class);
                startActivity(intent);
            }
        });

        LinearLayout layout2 = view.findViewById(R.id.category2);
        layout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),LevelPageFunc.class);
                startActivity(intent);
            }
        });

        LinearLayout layout3 = view.findViewById(R.id.category3);
        layout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),LevelPageTrig.class);
                startActivity(intent);
            }
        });

        LinearLayout layout4 = view.findViewById(R.id.category4);
        layout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),LevelPageArithm.class);
                startActivity(intent);
            }
        });

        LinearLayout layout5 = view.findViewById(R.id.category5);
        layout5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),LevelPageReal.class);
                startActivity(intent);
            }
        });

        LinearLayout layout6 = view.findViewById(R.id.category6);
        layout6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),LevelPageLog.class);
                startActivity(intent);
            }
        });

        LinearLayout layout7 = view.findViewById(R.id.category7);
        layout7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),LevelPageDeriv.class);
                startActivity(intent);
            }
        });

        LinearLayout layout8 = view.findViewById(R.id.category8);
        layout8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),LevelPageComplex.class);
                startActivity(intent);
            }
        });
        return view;
    }
}