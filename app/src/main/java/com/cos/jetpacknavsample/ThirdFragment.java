package com.cos.jetpacknavsample;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class ThirdFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_third, container, false);

        view.findViewById(R.id.button).setOnClickListener(v -> {
            Navigation.findNavController(view).navigate(R.id.action_thirdFragment_to_firstFragment);
        });
        return view;
    }
}