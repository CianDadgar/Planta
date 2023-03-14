package com.example.planta.Information.InfoSub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.example.planta.R;

public class AssementActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assement);

        TextView textView = (TextView) findViewById(R.id.textview3);
        textView.setMovementMethod(new ScrollingMovementMethod());
    }
}