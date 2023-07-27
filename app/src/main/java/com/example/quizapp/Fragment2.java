package com.example.quizapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment2 extends Fragment {
    RadioButton r1,r2,r3,r4;
    public static int t2;
    RadioGroup rb;
    String answer="this";
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Fragment2() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment2.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment2 newInstance(String param1, String param2) {
        Fragment2 fragment = new Fragment2();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_2, container, false);
        perform(view);
        return view;
    }

    private void perform(View view)
    {
        rb = view.findViewById(R.id.radiogrp);
        r1 = view.findViewById(R.id.answer1RB);
        r2 = view.findViewById(R.id.answer2RB);
        r3 = view.findViewById(R.id.answer3RB);
        r4 = view.findViewById(R.id.answer4RB);
        r1.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked){
                if(r1.getText().toString().equals(answer)){
                    t2 = 1;
                }
                else{
                    t2 = 0;
                }
            }
        });
        r2.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked){
                if(r2.getText().toString().equals(answer)){
                    t2 = 1;
                }
                else{
                    t2 = 0;
                }
            }
        });
        r3.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked){
                if(r3.getText().toString().equals(answer)){
                    t2 = 1;
                }
                else{
                    t2 = 0;
                }
            }
        });
        r4.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked){
                if(r4.getText().toString().equals(answer)){
                    t2 = 1;
                }
                else{
                    t2 = 0;
                }
            }
        });
    }
}