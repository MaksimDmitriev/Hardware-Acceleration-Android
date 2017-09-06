package ru.maksim.hardware_acceleration;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                findViewById(R.id.custom_view_2).setBackgroundColor(getResources().getColor(R.color.colorAccent));
            }
        }, 5000L);
    }
}
