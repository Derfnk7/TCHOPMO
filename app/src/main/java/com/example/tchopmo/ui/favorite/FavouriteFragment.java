package com.example.tchopmo.ui.favorite;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.tchopmo.R;
//import com.example.tchopmo.databinding.FragmentSlideshowBinding;

public class FavouriteFragment extends Fragment {


    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {

    View root = inflater.inflate(R.layout.fragment_favourite, container, false);


        return root;
    }
}