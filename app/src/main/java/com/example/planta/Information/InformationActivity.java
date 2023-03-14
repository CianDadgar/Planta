package com.example.planta.Information;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import com.example.planta.Information.InfoSub.AssementActivity;
import com.example.planta.Information.InfoSub.FoodGroupsActivity;
import com.example.planta.Information.InfoSub.NutrientsActivity;
import com.example.planta.Information.InfoSub.TipsActivity;
import com.example.planta.R;

public class InformationActivity extends AppCompatActivity {

    private CardView nutrients;
    private CardView foodGroups;
    private CardView assessment;
    private CardView tips;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        nutrients = findViewById(R.id.nutrients);
        foodGroups = findViewById(R.id.foodGroups);
        assessment = findViewById(R.id.assessment);
        tips = findViewById(R.id.tips);




        nutrients.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(InformationActivity.this, NutrientsActivity.class));
            }
        });
        foodGroups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(InformationActivity.this, FoodGroupsActivity.class));
            }
        });
        assessment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(InformationActivity.this, AssementActivity.class));
            }
        });
        tips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(InformationActivity.this, TipsActivity.class));
            }
        });


    }
}