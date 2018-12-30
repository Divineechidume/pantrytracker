package com.pantrytracker.pantrytracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class food_locations extends AppCompatActivity {
    private Button settings;
    private Button fridge;
    private Button analytics;
    private Button pantry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_locations);

        settings = findViewById(R.id.settings);
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SettingsActivity();
            }
        });

        pantry = findViewById(R.id.pantry);
        pantry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pantryactivity();
            }
        });
    }

    public void SettingsActivity() {
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }

    public void pantryactivity() {
        Intent intent = new Intent(this, pantry.class);
        startActivity(intent);
    }
}
