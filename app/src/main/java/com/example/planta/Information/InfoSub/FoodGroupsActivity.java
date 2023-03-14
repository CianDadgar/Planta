package com.example.planta.Information.InfoSub;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.planta.R;

public class FoodGroupsActivity extends AppCompatActivity {

    private CardView starchyVeg;
    private CardView nonStarchVeg;
    private CardView fando;
    private CardView wholegrains;
    private CardView fruits;
    private CardView legumes;
    private CardView dairyalternatives;
    private CardView nands;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_groups);

        starchyVeg = findViewById(R.id.starchyVeg);
        nonStarchVeg = findViewById(R.id.nonStarchVeg);
        fando = findViewById(R.id.fando);
        wholegrains = findViewById(R.id.wholegrains);
        fruits = findViewById(R.id.fruits);
        legumes = findViewById(R.id.legumes);
        dairyalternatives = findViewById(R.id.dairyalternatives);
        nands = findViewById(R.id.nands);


        starchyVeg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FoodGroupsActivity.this, com.example.planta.Information.InfoSub.foodgroupssub.starch.class));
            }
        });
        nonStarchVeg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FoodGroupsActivity.this, com.example.planta.Information.InfoSub.foodgroupssub.nostarch.class));
            }
        });
        fando.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FoodGroupsActivity.this, com.example.planta.Information.InfoSub.foodgroupssub.fatsandoils.class));
            }
        });
        wholegrains.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FoodGroupsActivity.this, com.example.planta.Information.InfoSub.foodgroupssub.wholegrains.class));
            }
        });
        fruits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FoodGroupsActivity.this, com.example.planta.Information.InfoSub.foodgroupssub.fruit.class));
            }
        });
        legumes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FoodGroupsActivity.this, com.example.planta.Information.InfoSub.foodgroupssub.legumes.class));
            }
        });
        dairyalternatives.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FoodGroupsActivity.this, com.example.planta.Information.InfoSub.foodgroupssub.dairyalternatives.class));
            }
        });
        nands.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FoodGroupsActivity.this, com.example.planta.Information.InfoSub.foodgroupssub.nutsandseeds.class));
            }
        });
    }
}