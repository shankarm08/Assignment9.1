package com.wedddingapp.shankar.opassignment;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv1;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = (TextView) findViewById(R.id.h1);

    }

        public boolean onCreateOptionsMenu(Menu menu) {
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.textcolor, menu);
        return super.onCreateOptionsMenu(menu);
    }


    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            case R.id.red:
                tv1.setTextColor(Color.RED);
                return true;

            case R.id.green:
                tv1.setTextColor(Color.GREEN);
                return true;

            case R.id.blue:
                tv1.setTextColor(Color.BLUE);
                return true;

            default:
                return super.onOptionsItemSelected(item);



        }

    }



    }

