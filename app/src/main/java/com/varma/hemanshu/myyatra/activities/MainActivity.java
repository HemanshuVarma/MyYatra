package com.varma.hemanshu.myyatra.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.varma.hemanshu.myyatra.R;

public class MainActivity extends AppCompatActivity {

    TextView placesTV;
    TextView hotelsTV;
    TextView foodTV;
    TextView adventureTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        placesTV = findViewById(R.id.places_tv);
        hotelsTV = findViewById(R.id.hotels_tv);
        foodTV = findViewById(R.id.food_tv);
        adventureTV = findViewById(R.id.adventure_tv);

        placesTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, PlacesActivity.class);
                startActivity(i);
            }
        });
        hotelsTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, HotelsActivity.class);
                startActivity(i);
            }
        });
        foodTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, FoodActivity.class);
                startActivity(i);
            }
        });
        adventureTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, AdventureActivity.class);
                startActivity(i);
            }
        });
    }
}
