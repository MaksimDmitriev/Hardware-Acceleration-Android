package ru.maksim.hardware_acceleration;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // If android:hardwareAccelerated="false" is set to this activity, both CustomView and
        // CustomView2 are redrawn when the delayed task is executed (although CustomView hasn't
        // changed, it's redrawn because part of it is in the dirty area.
        // See https://developer.android.com/guide/topics/graphics/hardware-accel.html#hardware-model).
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                findViewById(R.id.custom_view_2).setBackgroundColor(getResources().getColor(R.color.colorAccent));
            }
        }, 5000L);
    }
}
