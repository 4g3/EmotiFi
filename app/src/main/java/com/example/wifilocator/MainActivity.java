package com.example.wifilocator;

import android.app.Activity;
import android.app.Service;
import android.content.Context;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.wifilocator.R;

import org.w3c.dom.Text;

import java.util.List;

import static android.content.Context.WIFI_SERVICE;

@RequiresApi(api = Build.VERSION_CODES.ICE_CREAM_SANDWICH)

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WifiManager wifiManager = (WifiManager) context.getSystemService(Context.WIFI_SERVICE);
        List<ScanResult> wifiList = wifiManager.getScanResults();

        for (ScanResult scanResult : wifiList) {
            int level = WifiManager.calculateSignalLevel(scanResult.level, 5);
            setContentView(R.layout.activity_main);
            TextView readSignal = findViewById(R.id.readSignal0);
            String hero = "This is yours!";
            readSignal.setText(hero + level);
        }

        int rssi = wifiManager.getConnectionInfo().getRssi();
        int level = WifiManager.calculateSignalLevel(rssi, 5);
        setContentView(R.layout.activity_main);
        TextView readSignal = findViewById(R.id.readSignal1);
        String hero = "This is yours!";
        readSignal.setText(hero + level);
    }
}