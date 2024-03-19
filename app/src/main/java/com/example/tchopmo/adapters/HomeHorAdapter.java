package com.example.tchopmo.adapters;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tchopmo.R;
import com.example.tchopmo.models.HomeHorModel;
import com.example.tchopmo.models.HomeVerModel;

import java.util.ArrayList;
import java.util.List;

public class HomeHorAdapter extends RecyclerView.Adapter<HomeHorAdapter.ViewHolder> {

    UpdateVerticalRec updateVerticalRec;
    Activity activity;
    ArrayList<HomeHorModel> list;

    boolean check = true;
    boolean select = true;
    int row_index = -1;

    public HomeHorAdapter(UpdateVerticalRec updateVerticalRec, Activity activity, ArrayList<HomeHorModel> list) {
        this.updateVerticalRec = updateVerticalRec;
        this.activity = activity;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.home_horizontal_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {

        holder.imageView.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());

        if (check) {
            ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
            homeVerModels.add(new HomeVerModel(R.drawable.tandoori, "Tandoori Chiken", "10:00 - 22:00", "4.2", "Min - XAF4800"));
            homeVerModels.add(new HomeVerModel(R.drawable.demichik, "Mid Chiken & Mid Tikka", "10:00 - 22:00", "4.7", "Min - XAF3400"));
            homeVerModels.add(new HomeVerModel(R.drawable.reine, "Reine Blanche", "10:00 - 22:00", "4.9", "Min - XAF5500"));
            homeVerModels.add(new HomeVerModel(R.drawable.saucisse, "Saucisse Maison", "10:00 - 22:00", "3.7", "Min - XAF3000"));
            homeVerModels.add(new HomeVerModel(R.drawable.bufalo, "Bufalo Chiken", "10:00 - 22:00", "4.4", "Min - XAF4800"));
            homeVerModels.add(new HomeVerModel(R.drawable.yummy, "Yummy Pizza", "10:00 - 22:00", "4.0", "Min - XAF5950"));
            homeVerModels.add(new HomeVerModel(R.drawable.seafood, "Sea Food Pizza", "10:00 - 22:00", "4.8", "Min - XAF3950"));

            updateVerticalRec.callBack(position, homeVerModels);
            check = false;
        }
            holder.cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    row_index = position;
                    notifyDataSetChanged();

                    if (position == 0){

                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                        homeVerModels.add(new HomeVerModel(R.drawable.tandoori,"Tandoori Chiken","10:00 - 22:00", "4.2","Min - XAF4800"));
                        homeVerModels.add(new HomeVerModel(R.drawable.demichik,"Mid Chiken & Mid Tikka","10:00 - 22:00", "4.7","Min - XAF3400"));
                        homeVerModels.add(new HomeVerModel(R.drawable.reine,"Reine Blanche","10:00 - 22:00", "4.9","Min - XAF5500"));
                        homeVerModels.add(new HomeVerModel(R.drawable.saucisse,"Saucisse Maison","10:00 - 22:00", "3.7","Min - XAF3000"));
                        homeVerModels.add(new HomeVerModel(R.drawable.bufalo,"Bufalo Chiken","10:00 - 22:00", "4.4","Min - XAF4800"));
                        homeVerModels.add(new HomeVerModel(R.drawable.yummy,"Yummy Pizza","10:00 - 22:00", "4.0","Min - XAF5950"));
                        homeVerModels.add(new HomeVerModel(R.drawable.seafood,"Sea Food Pizza","10:00 - 22:00", "4.8","Min - XAF3950"));

                        updateVerticalRec.callBack(position,homeVerModels);
                    } else if (position == 1) {

                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.crispy_chickpeas,"Crispy Chickpeas","10:00 - 22:00", "4.2","Min - XAF4800"));
                        homeVerModels.add(new HomeVerModel(R.drawable.paneer_naan,"Paneer Naan","10:00 - 22:00", "4.7","Min - XAF3400"));
                        homeVerModels.add(new HomeVerModel(R.drawable.vegan_mozzarella,"Vegan Mozzarella","10:00 - 22:00", "4.9","Min - XAF5500"));
                        homeVerModels.add(new HomeVerModel(R.drawable.vegan_pizza,"Vegan Pizza","10:00 - 22:00", "3.7","Min - XAF3000"));
                        homeVerModels.add(new HomeVerModel(R.drawable.veggie_pita_bread,"Veggie Pita Bread","10:00 - 22:00", "4.4","Min - XAF4800"));

                        updateVerticalRec.callBack(position,homeVerModels);
                    } else if (position == 2) {

                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.royal_pizza,"Roya Pizza","10:00 - 22:00", "4.2","Min - XAF4800"));
                        homeVerModels.add(new HomeVerModel(R.drawable.potato_spicy_pizza,"Paneer Naan","10:00 - 22:00", "4.7","Min - XAF3400"));
                        homeVerModels.add(new HomeVerModel(R.drawable.hawaiian_pizza,"Hawaiian Pizza","10:00 - 22:00", "4.9","Min - XAF5500"));

                        updateVerticalRec.callBack(position,homeVerModels);
                    } else if (position == 3) {

                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.pomodoro_pepperoni_pizza,"Pomodoro Pepperoni","10:00 - 22:00", "4.2","Min - XAF4800"));
                        homeVerModels.add(new HomeVerModel(R.drawable.beckon_chicken_spicy,"Beckon Chicken","10:00 - 22:00", "4.7","Min - XAF3400"));
                        homeVerModels.add(new HomeVerModel(R.drawable.pepperoni_pineapple_jalapeno,"Pepperoni Pineaple & jalapeno","10:00 - 22:00", "4.9","Min - XAF5500"));

                        updateVerticalRec.callBack(position,homeVerModels);
                    }
                }
            });

            if (select){
                if (position == 0){
                    holder.cardView.setBackgroundResource(R.drawable.change_bg);
                    select = false;
                }
            }
            else {
                if (row_index == position){
                    holder.cardView.setBackgroundResource(R.drawable.change_bg);
                } else {
                    holder.cardView.setBackgroundResource(R.drawable.default_bg);
                }
            }
        }


    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView name;
        CardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.hor_img);
            name = itemView.findViewById(R.id.hor_text);
            cardView = itemView.findViewById(R.id.cardView);

        }
    }
}
