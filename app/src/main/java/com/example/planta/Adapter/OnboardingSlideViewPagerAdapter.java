package com.example.planta.Adapter;

import android.content.Context;
import android.content.Intent;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.planta.OnboardingSlideActivity;
import com.example.planta.R;
import com.example.planta.RegisterActivity;

public class OnboardingSlideViewPagerAdapter extends PagerAdapter {
    Context ctx;

    public OnboardingSlideViewPagerAdapter(Context ctx) {
        this.ctx = ctx;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {
        LayoutInflater layoutInflater= (LayoutInflater) ctx.getSystemService(ctx.LAYOUT_INFLATER_SERVICE);
        View view=layoutInflater.inflate(R.layout.activity_onboarding_slide,container,false);


        ImageView logo = view.findViewById(R.id.logo);

        ImageView ind1 = view.findViewById(R.id.ind1);
        ImageView ind2 = view.findViewById(R.id.ind2);
        ImageView ind3 = view.findViewById(R.id.ind3);


        TextView title = view.findViewById(R.id.title);
        TextView desc = view.findViewById(R.id.desc);
        TextView txtSkip = view.findViewById(R.id.txtSkip);

        ImageView next=view.findViewById(R.id.next);
        ImageView back=view.findViewById(R.id.back);

         /*	Code	below	is	based	on	Onboarding Walkthrough Intro Screen Layout with ViewPager - Complete Android Studio Tutorial
          by Technical Skillz on YouTube url: https://www.youtube.com/watch?v=27SGKu82nMQ
                     */

        Button btnGetStarted=view.findViewById(R.id.btnGetStarted);
        btnGetStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ctx, RegisterActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK| Intent.FLAG_ACTIVITY_NEW_TASK);
                ctx.startActivity(intent);
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnboardingSlideActivity.viewPager.setCurrentItem(position+1);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnboardingSlideActivity.viewPager.setCurrentItem(position-1);
            }
        });

        txtSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ctx, RegisterActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK| Intent.FLAG_ACTIVITY_NEW_TASK);
                ctx.startActivity(intent);
            }
        });

        switch (position)
        {
            case 0:
//                logo.setImageResource(R.drawable.messaging);
//                ind1.setImageResource(R.drawable.seleted);
//                ind2.setImageResource(R.drawable.unselected);
                ind3.setImageResource(R.drawable.logo);

                title.setText("Stay Connected");
                String msg = "<b>Connect</b> allows you to send messages and set reminders for your loved one";
                desc.setText(Html.fromHtml(msg));
                back.setVisibility(View.GONE);
                next.setVisibility(View.VISIBLE);
                btnGetStarted.setVisibility(View.GONE);
                txtSkip.setVisibility(View.VISIBLE);
                break;
            case 1:
//                logo.setImageResource(R.drawable.connected);
 //               ind1.setImageResource(R.drawable.unselected);
 //               ind2.setImageResource(R.drawable.seleted);
//                ind3.setImageResource(R.drawable.unselected);

                title.setText("Account Sharing");
                desc.setText("All family members or carers share the same account along with the Elderly User");
                back.setVisibility(View.VISIBLE);
                next.setVisibility(View.VISIBLE);
                btnGetStarted.setVisibility(View.GONE);
                txtSkip.setVisibility(View.VISIBLE);
                break;
            case 2:
 //               logo.setImageResource(R.drawable.personalise);
//                ind1.setImageResource(R.drawable.unselected);
//                ind2.setImageResource(R.drawable.unselected);
//                ind3.setImageResource(R.drawable.seleted);

                ind1.setVisibility(View.GONE);
                ind2.setVisibility(View.GONE);
                ind3.setVisibility(View.GONE);
                txtSkip.setVisibility(View.GONE);


                title.setText("Personalised Experience");
                desc.setText("Add and remove services based on your loved ones needs and abilities");
                back.setVisibility(View.VISIBLE);
                next.setVisibility(View.GONE);
                break;

        }


        container.addView(view);
        return view;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
    //END
}
