package com.example.light;

import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import android.bluetooth.BluetoothSocket;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Set;



public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bluetooth.createUUID();
        Bluetooth.main(null);

        final TextView colour = findViewById(R.id.Color);

        final Button red = findViewById(R.id.Red);
        red.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                colour.setBackgroundResource(R.color.Red);
                try {
                    Bluetooth.send( 1);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        final Button blue = findViewById(R.id.Blue);
        blue.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                colour.setBackgroundResource(R.color.Blue);
                try {
                    Bluetooth.send( 2);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        final Button green = findViewById(R.id.Green);
        green.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                colour.setBackgroundResource(R.color.Green);
                try {
                    Bluetooth.send(3);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

    }
}
