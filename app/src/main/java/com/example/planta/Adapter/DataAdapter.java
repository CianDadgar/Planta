package com.example.planta.Adapter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.recyclerview.widget.RecyclerView;

import com.example.planta.DetailActivity;
import com.example.planta.Model.DataModel;
import com.example.planta.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;



public class DataAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private ArrayList<DataModel> dataModelArrayList;
    private Activity activity;
    public DataAdapter(Activity activity, ArrayList<DataModel> dataModelArrayList) {
        this.activity = activity;
        this.dataModelArrayList = dataModelArrayList;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder viewHolder = null;
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        switch(viewType){
            case 1:{
                View v = inflater.inflate(R.layout.list_item2, parent, false);
                viewHolder = new ItemHolder(v);
                break;
            }
            case 2:{
                View v = inflater.inflate(R.layout.list_header, parent, false);
                viewHolder = new HeaderHolder(v);
                break;
            }
            case 3:{
                View v = inflater.inflate(R.layout.list_footer, parent, false);
                viewHolder = new FooterHolder(v);
                break;


            }

        }
        return viewHolder;
    }

    public static class ItemHolder extends RecyclerView.ViewHolder {
        public TextView txtJudul;
        public ImageView recipeImage;
        public ItemHolder(View view) {
            super(view);
            txtJudul = (TextView) view.findViewById(R.id.txtJudul);
            recipeImage = view.findViewById(R.id.recipeImage);
        }
    }


    public static class HeaderHolder extends RecyclerView.ViewHolder {
        public HeaderHolder(View view) {
            super(view);
        }
    }
    public static class FooterHolder extends RecyclerView.ViewHolder {
        public FooterHolder(View view) {
            super(view);
        }
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder viewHolder, final int position) {
        switch(getItem(position).getViewType()){
            case 1:{
                ItemHolder holder = (ItemHolder) viewHolder;
                holder.txtJudul.setText(getItem(position).getJudul());

                if (getItem(position).getJudul().equals("Gluten-Free and Vegan Coconut Pancakes")) {
                    Picasso.get().load(R.drawable.pancakes).placeholder(R.mipmap.ic_launcher)
                            .into(holder.recipeImage);
                } else if (getItem(position).getJudul().equals("Healthy Overnight Oats with In- Season Peaches")) {
                    Picasso.get().load(R.drawable.peaches).placeholder(R.mipmap.ic_launcher)
                            .into(holder.recipeImage);
                } else if (getItem(position).getJudul().equals("Candied Mapel Balsamic Brussels Sprout Skewers with Red Onion")) {
                    Picasso.get().load(R.drawable.burssels).placeholder(R.mipmap.ic_launcher)
                            .into(holder.recipeImage);
                } else if (getItem(position).getJudul().equals("Apple Pie Oatmeal Bake")) {
                    Picasso.get().load(R.drawable.oatbake).placeholder(R.mipmap.ic_launcher)
                            .into(holder.recipeImage);
                } else if (getItem(position).getJudul().equals("Vegan Kale Caesar Salad with Tempeh Bacon")) {
                    Picasso.get().load(R.drawable.saladbacon).placeholder(R.mipmap.ic_launcher)
                            .into(holder.recipeImage);
                } else if (getItem(position).getJudul().equals("A Classic Tuna Melt Sandwich with A Vegan Twist")) {
                    Picasso.get().load(R.drawable.tuna).placeholder(R.mipmap.ic_launcher)
                            .into(holder.recipeImage);
                } else if (getItem(position).getJudul().equals("Rainbow Quinoa Taco Salad with Vegan Dressing")) {
                    Picasso.get().load(R.drawable.salad).placeholder(R.mipmap.ic_launcher)
                            .into(holder.recipeImage);
                } else if (getItem(position).getJudul().equals("Baked Falafel Sliders with Tabbouleh and Mapel Tahini Sauce")) {
                    Picasso.get().load(R.drawable.falafel).placeholder(R.mipmap.ic_launcher)
                            .into(holder.recipeImage);
                } else if (getItem(position).getJudul().equals("Mapel Chipotle Bbq Cauilflower Wings")) {
                    Picasso.get().load(R.drawable.wings).placeholder(R.mipmap.ic_launcher)
                            .into(holder.recipeImage);
                } else if (getItem(position).getJudul().equals("Creamy Vegan Cauliflower Mac and Cheese")) {
                    Picasso.get().load(R.drawable.mac).placeholder(R.mipmap.ic_launcher)
                            .into(holder.recipeImage);
                } else if (getItem(position).getJudul().equals("Black Bean Veggie Burger")) {
                    Picasso.get().load(R.drawable.beanburger).placeholder(R.mipmap.ic_launcher)
                            .into(holder.recipeImage);
                } else if (getItem(position).getJudul().equals("Vegan Spaghetti Bolognese")) {
                    Picasso.get().load(R.drawable.spaghetti).placeholder(R.mipmap.ic_launcher)
                            .into(holder.recipeImage);
                } else if (getItem(position).getJudul().equals("Cashew Mushroom Sliders")) {
                    Picasso.get().load(R.drawable.burger).placeholder(R.mipmap.ic_launcher)
                            .into(holder.recipeImage);
                } else if (getItem(position).getJudul().equals("Vegan Meatballs with Over-Roasted Tomato Sauce")) {
                    Picasso.get().load(R.drawable.meatballs).placeholder(R.mipmap.ic_launcher)
                            .into(holder.recipeImage);
                } else if (getItem(position).getJudul().equals("Vegan Nachos")) {
                    Picasso.get().load(R.drawable.nachos).placeholder(R.mipmap.ic_launcher)
                            .into(holder.recipeImage);
                }


                holder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(final View v) {
                        Intent intent = new Intent(activity, DetailActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putSerializable("dataModel", getItem(position));
                        intent.putExtras(bundle);
                        activity.startActivity(intent);
                    }
                });

                break;
            }
        }
    }


    @Override
    public int getItemViewType(int position) {
        return dataModelArrayList.get(position).getViewType();
    }


    public DataModel getItem(int position) {
        return dataModelArrayList.get(position);
    }


    @Override
    public int getItemCount() {
        return dataModelArrayList.size();
    }

}
