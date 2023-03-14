package com.example.planta.Information.InfoSub.foodgroupssub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.example.planta.R;

public class wholegrains extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wholegrains);

        TextView textView = (TextView) findViewById(R.id.scroll);
        textView.setMovementMethod(new ScrollingMovementMethod());
    }
}