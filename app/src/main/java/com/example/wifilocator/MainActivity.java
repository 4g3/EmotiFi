package com.example.wifilocator;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.wifilocator.R;

import org.w3c.dom.Text;

import static android.content.Context.WIFI_SERVICE;

@RequiresApi(api = Build.VERSION_CODES.ICE_CREAM_SANDWICH)

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            }

    public int loop(Context context) throws InterruptedException {
        while(true) {
            WifiManager signalStrength = (WifiManager) getApplicationContext().getSystemService(WIFI_SERVICE);
            try {
                Thread.sleep(1500);
            } catch(InterruptedException e) {
                System.out.println("got interrupted!");
            }
            setContentView(R.layout.activity_main);
            TextView readSignal = findViewById(R.id.readSignal);
            readSignal.setText("My double value is" + signalStrength);
        }
    }
}