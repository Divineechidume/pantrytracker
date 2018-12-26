package com.pantrytracker.pantrytracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    private Button inside;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialize the button to get to the inside of the pantry
        inside = findViewById(R.id.check_pantry);
        inside.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                food_locations();
            }
        });
    }

    /**
     * This is where we open the pantry and the use can see the next options."
     */
    public void food_locations() {
        Intent intent = new Intent(this, food_locations.class);
        startActivity(intent);
    }

}
