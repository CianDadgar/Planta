package com.example.planta.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import com.example.planta.Information.InformationActivity;
import com.example.planta.Information.MapActivity;
import com.example.planta.R;
import com.example.planta.Information.RecipeActivity;

public class InformationFragment extends Fragment {

    private ImageView maps;
    private ImageView informationSection;
    private ImageView recipeSection;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_information, container, false);





        maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), MapActivity.class));
            }
        });
        informationSection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), InformationActivity.class));
            }
        });
        recipeSection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), RecipeActivity.class));
            }
        });

        return view;
    }
}
