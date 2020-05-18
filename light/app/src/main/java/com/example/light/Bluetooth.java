package com.example.light;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothServerSocket;
import android.bluetooth.BluetoothSocket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Set;
import java.util.UUID;

public class Bluetooth {
    static BluetoothAdapter adapter = BluetoothAdapter.getDefaultAdapter();

    static UUID uuid = null;

    public Bluetooth() throws IOException {
    }

    public static void main(String[] args){
        if(!adapter.isEnabled()){
            System.out.println("Please enble bluetooth");
        }else{
        Set<BluetoothDevice> pairedDevices = adapter.getBondedDevices();

// If there’s 1 or more paired devices...//
        if (pairedDevices.size() > 0) {

            //...then loop through these devices//
            for (BluetoothDevice device : pairedDevices) {
                //Retrieve each device’s public identifier and MAC address. Add each device’s name and address to an ArrayAdapter, ready to incorporate into a
                //ListView
                ArrayList<String> mArrayAdapter = null;
                mArrayAdapter.add(device.getName() + "\n" + device.getAddress());
                }
            }
        }
    }

    public static void createUUID(){
        uuid = UUID.fromString("20074835-894a-42b0-a0aa-d54f59e97a5a");
    }


    public static BluetoothServerSocket blueServersocket;
    static BluetoothDevice bluetoothDevice;
    private static BluetoothSocket bluesocket;
    static void socketsRecord(){
        try {
            bluesocket = bluetoothDevice.createRfcommSocketToServiceRecord(uuid);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            blueServersocket = adapter.listenUsingRfcommWithServiceRecord("Light", uuid);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    ;
    public InputStream in;
    public static OutputStream out;

    public static void send(int color) throws IOException {

        InputStream tempIn = null;
        OutputStream tempOut = null;
        out.write(color);
       //        try {
//            tempIn = bluesocket.getInputStream();
//            tempOut = bluesocket.getOutputStream();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }


}
