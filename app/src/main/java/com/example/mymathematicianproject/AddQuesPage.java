package com.example.mymathematicianproject;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;


public class AddQuesPage extends Fragment {

    public AddQuesPage() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_add_ques_page, container, false);

        LinearLayout layout1 = view.findViewById(R.id.category1);
        layout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AddVarQues.class);
                startActivity(intent);
            }
        });

        LinearLayout layout2 = view.findViewById(R.id.category2);
        layout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AddFuncQues.class);
                startActivity(intent);
            }
        });

        LinearLayout layout3 = view.findViewById(R.id.category3);
        layout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AddTrigQues.class);
                startActivity(intent);
            }
        });

        LinearLayout layout4 = view.findViewById(R.id.category4);
        layout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AddGeomQues.class);
                startActivity(intent);
            }
        });


        LinearLayout layout5 = view.findViewById(R.id.category5);
        layout5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AddLogQues.class);
                startActivity(intent);
            }
        });

        LinearLayout layout6 = view.findViewById(R.id.category6);
        layout6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AddDerivQues.class);
                startActivity(intent);
            }
        });

        return view;
    }
}