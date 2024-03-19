package com.example.tchopmo.ui.home;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tchopmo.R;
import com.example.tchopmo.adapters.HomeHorAdapter;
import com.example.tchopmo.adapters.HomeVerAdapter;
import com.example.tchopmo.adapters.UpdateVerticalRec;
import com.example.tchopmo.models.HomeHorModel;
import com.example.tchopmo.models.HomeVerModel;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment implements UpdateVerticalRec {

    RecyclerView homeHorizontalRec, homeVerticalRec;
    ArrayList<HomeHorModel> homeHorModelList;
    HomeHorAdapter homeHorAdapter;

    ///////////////////////////Vertical
    ArrayList<HomeVerModel> homeVerModelList;
    HomeVerAdapter homeVerAdapter;

    @SuppressLint("MissingInflatedId")
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

    View root = inflater.inflate(R.layout.fragment_home, container, false);

        homeHorizontalRec = root.findViewById(R.id.home_hor_rec);
        homeVerticalRec = root.findViewById(R.id.home_ver_rec);

        ////////////////////////////////Horizontal RecyclerView
        homeHorModelList = new ArrayList<>();

        homeHorModelList.add(new HomeHorModel(R.drawable.non_veg_ic,"pizza non vegan"));
        homeHorModelList.add(new HomeHorModel(R.drawable.vegan_ic,"pizza vegan"));
        homeHorModelList.add(new HomeHorModel(R.drawable.spicy_icc,"pizza    épicé"));
        homeHorModelList.add(new HomeHorModel(R.drawable.combi_ic,"combo pizza"));

        homeHorAdapter = new HomeHorAdapter(this,getActivity(),homeHorModelList);
        homeHorizontalRec.setAdapter(homeHorAdapter);
        homeHorizontalRec.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL,false));
        homeHorizontalRec.setHasFixedSize(true);
        homeHorizontalRec.setNestedScrollingEnabled(false);


        ////////////////////////////////Vertical RecyclerView
        homeVerModelList = new ArrayList<>();

        homeVerAdapter = new HomeVerAdapter(getActivity(),homeVerModelList);
        homeVerticalRec.setAdapter(homeVerAdapter);
        homeVerticalRec.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL,false));

        return root;
    }


    @Override
    public void callBack(int position, ArrayList<HomeVerModel> list) {

       homeVerAdapter = new HomeVerAdapter(getContext(),list);
       homeVerAdapter.notifyDataSetChanged();
       homeVerticalRec.setAdapter(homeVerAdapter);
    }
}