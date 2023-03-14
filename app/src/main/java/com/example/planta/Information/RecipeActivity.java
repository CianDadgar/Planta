package com.example.planta.Information;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.planta.Adapter.DataAdapter;
import com.example.planta.Model.DataModel;
import com.example.planta.R;

import java.util.ArrayList;

public class RecipeActivity extends AppCompatActivity {
    public DataAdapter dataAdapter;
    public RecyclerView recyclerView;
    public ArrayList<DataModel> dataModelArrayList=new ArrayList<DataModel>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        inputData("Gluten-Free and Vegan Coconut Pancakes","B1.html");
        inputData("Healthy Overnight Oats with In- Season Peaches","B2.html");
        inputData("Apple Pie Oatmeal Bake","B3.html");
        inputData("Vegan Kale Caesar Salad with Tempeh Bacon","L1.html");
        inputData("A Classic Tuna Melt Sandwich with A Vegan Twist","L2.html");
        inputData("Rainbow Quinoa Taco Salad with Vegan Dressing","L3.html");
        inputData("Baked Falafel Sliders with Tabbouleh and Mapel Tahini Sauce","L4.html");
        inputData("Mapel Chipotle Bbq Cauilflower Wings","L5.html");
        inputData("Creamy Vegan Cauliflower Mac and Cheese","L6.html");
        inputData("Candied Mapel Balsamic Brussels Sprout Skewers with Red Onion","D1.html");
        inputData("Black Bean Veggie Burger","D2.html");
        inputData("Vegan Spaghetti Bolognese","D3.html");
        inputData("Cashew Mushroom Sliders","D4.html");
        inputData("Vegan Meatballs with Over-Roasted Tomato Sauce","D5.html");
        inputData("Vegan Nachos","D6.html");

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        dataAdapter = new DataAdapter(this,dataModelArrayList);
        recyclerView.setAdapter(dataAdapter);


    }

    //fungsi input
    public void inputData(String judul,String konten){
        DataModel dataModel = new DataModel();
        dataModel.setJudul(judul);
        dataModel.setKonten(konten);
        dataModel.setViewType(1);
        dataModelArrayList.add(dataModel);
    }


}



