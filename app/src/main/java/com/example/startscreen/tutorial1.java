package com.example.startscreen;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


public class tutorial1 extends Fragment {
    protected View view;
    protected ImageButton move_next;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.first_page, container, false);
        move_next = view.findViewById(R.id.imageButton2);
        move_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tutorial2 fragment= new tutorial2();
                FragmentManager fm = getActivity().getSupportFragmentManager();
                FragmentTransaction ft= fm.beginTransaction();
                ft.replace(R.id.frameLayout, fragment);
                ft.commit();
            }
        });
        return view;
    }
}