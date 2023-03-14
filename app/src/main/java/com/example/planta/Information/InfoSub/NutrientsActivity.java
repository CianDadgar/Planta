package com.example.planta.Information.InfoSub;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.planta.Information.InfoSub.nutrientssub.b12Activity;
import com.example.planta.Information.InfoSub.nutrientssub.calciumActivity;
import com.example.planta.Information.InfoSub.nutrientssub.ironActivity;
import com.example.planta.Information.InfoSub.nutrientssub.omegaActivity;
import com.example.planta.Information.InfoSub.nutrientssub.proteinActivity;
import com.example.planta.Information.InfoSub.nutrientssub.vitamindActivity;
import com.example.planta.Information.InfoSub.nutrientssub.zincActivity;
import com.example.planta.R;

public class NutrientsActivity extends AppCompatActivity {
    private CardView protein;
    private CardView b12;
    private CardView calcium;
    private CardView iron;
    private CardView omega;
    private CardView vitamind;
    private CardView zinc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutrients);

        protein = findViewById(R.id.protein);
        b12 = findViewById(R.id.b12);
        iron = findViewById(R.id.iron);
        calcium = findViewById(R.id.calcium);
        omega = findViewById(R.id.omega);
        vitamind = findViewById(R.id.vitamind);
        zinc = findViewById(R.id.zinc);


        protein.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NutrientsActivity.this, com.example.planta.Information.InfoSub.nutrientssub.proteinActivity.class));
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NutrientsActivity.this, com.example.planta.Information.InfoSub.nutrientssub.b12Activity.class));
            }
        });
        iron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NutrientsActivity.this, com.example.planta.Information.InfoSub.nutrientssub.ironActivity.class));
            }
        });
        calcium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NutrientsActivity.this, com.example.planta.Information.InfoSub.nutrientssub.calciumActivity.class));
            }
        });

        omega.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NutrientsActivity.this, com.example.planta.Information.InfoSub.nutrientssub.omegaActivity.class));
            }
        });

        vitamind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NutrientsActivity.this, com.example.planta.Information.InfoSub.nutrientssub.vitamindActivity.class));
            }
        });
        zinc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NutrientsActivity.this, com.example.planta.Information.InfoSub.nutrientssub.zincActivity.class));
            }
        });

    }
}
