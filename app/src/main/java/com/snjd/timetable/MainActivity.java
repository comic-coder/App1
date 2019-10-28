package com.snjd.timetable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.midi.MidiDeviceService;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mon , tue , wed , thu , fri ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        mon = findViewById(R.id.monday);
        tue = findViewById(R.id.tuesday);
        wed = findViewById(R.id.wednesday);
        thu = findViewById(R.id.thursday);
        fri = findViewById(R.id.friday);

        mon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity.this,TableShow.class);
               // String key = "1";
                i.putExtra("Day","1");

                startActivity(i);

                //startActivity(new Intent(MainActivity.this,TableShow.class));

            }
        });

        tue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent i =new Intent(MainActivity.this,TableShow.class);
           // String Day = null;
            i.putExtra("Day","2");
            startActivity(i);
            }
        });

        wed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,TableShow.class);
                String key = null;
                i.putExtra("Day","3");
                startActivity(i);
            }
        });

        thu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,TableShow.class);
                String key = null;
                i.putExtra("Day","4");
                startActivity(i);
            }
        });

        fri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,TableShow.class);
                String key = null;
                i.putExtra("Day","5");
                startActivity(i);
            }
        });
    }
}
