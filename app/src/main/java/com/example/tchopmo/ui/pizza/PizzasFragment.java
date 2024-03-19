package com.example.tchopmo.ui.pizza;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.tchopmo.R;

public class PizzasFragment extends Fragment {


    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_pizzas, container,false);

        return root;
    }
}