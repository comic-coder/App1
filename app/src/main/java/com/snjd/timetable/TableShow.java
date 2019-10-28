package com.snjd.timetable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TableLayout;

public class TableShow extends AppCompatActivity {
    TableLayout monll, tuell, wedll, thull, frill;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_show);
        getSupportActionBar().hide();
        monll = findViewById(R.id.monTable);
        tuell = findViewById(R.id.tueTable);
        wedll = findViewById(R.id.wedTable);
        thull = findViewById(R.id.thuTable);
        frill = findViewById(R.id.friTable);

        //Bundle bundle = getIntent().getExtras();
        Intent i = getIntent();
       // Integer id = i.getIntExtra("Day");
        if(i.getStringExtra("Day").equals("1"))
        {
            monll.setVisibility(View.VISIBLE);
        }
        else if(i.getStringExtra("Day").equals("2"))
        {
            tuell.setVisibility(View.VISIBLE);
        }
        else if(i.getStringExtra("Day").equals("3"))
        {
            wedll.setVisibility(View.VISIBLE);
        }
        else if(i.getStringExtra("Day").equals("4"))
        {
            thull.setVisibility(View.VISIBLE);
        }
        else if(i.getStringExtra("Day").equals("5"))
        {
            frill.setVisibility(View.VISIBLE);
        }
        else
        {
            this.finish();
        }

    }
}

