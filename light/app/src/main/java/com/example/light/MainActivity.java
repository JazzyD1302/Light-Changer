package com.example.light;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final TextView colour = findViewById(R.id.Color);

        final Button red = findViewById(R.id.Red);
        red.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                colour.setBackgroundResource(R.color.Red);
            }
        });

        final Button blue = findViewById(R.id.Blue);
        blue.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                colour.setBackgroundResource(R.color.Blue);
            }
        });

        final Button green = findViewById(R.id.Green);
        green.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                colour.setBackgroundResource(R.color.Green);
            }
        });

    }
}
