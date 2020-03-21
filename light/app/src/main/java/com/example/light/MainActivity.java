package com.example.light;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final TextView main = findViewById(R.id.Main);

        final Button dante = findViewById(R.id.dante);
        dante.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                main.setText("Hello Dante");
            }
        });

        final Button evan = findViewById(R.id.evan);
        evan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                main.setText("Hello Evan");
            }
        });
    }
}
