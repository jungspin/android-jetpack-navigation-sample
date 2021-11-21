package com.cos.jetpacknavsample;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class SecondFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second, container, false);

        view.findViewById(R.id.button).setOnClickListener(v->{
            Navigation.findNavController(view).navigate(R.id.action_secondFragment_to_thirdFragment);
        });
        return view;
    }
}