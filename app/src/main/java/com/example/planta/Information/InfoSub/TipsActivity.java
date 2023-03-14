package com.example.planta.Information.InfoSub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.example.planta.R;

public class TipsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);

        TextView textView = (TextView) findViewById(R.id.textview4);
        textView.setMovementMethod(new ScrollingMovementMethod());
    }
}