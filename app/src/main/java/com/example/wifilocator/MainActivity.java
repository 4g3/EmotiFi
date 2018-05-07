package com.example.wifilocator;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.wifilocator.R;

import static android.content.Context.WIFI_SERVICE;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

    class wifi {
        int signalStrength = 0;

    @RequiresApi(api = Build.VERSION_CODES.ICE_CREAM_SANDWICH)

    public void loop(Context context) throws InterruptedException {
        while(true) {
            WifiManager signalStrength = (WifiManager) context.getApplicationContext().getSystemService(WIFI_SERVICE);
            String wifiInfo = WifiManager.EXTRA_WIFI_INFO;
            TextView textView = (TextView) textView.findViewById(R.id.readOut);
            Thread.sleep(1000);
        }
    }
}
