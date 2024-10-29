package com.example.poem;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen); // Ensure this matches your XML filename

        // Initialize CardViews with the correct IDs
        CardView cardSheep = findViewById(R.id.card_sheep); // Ensure this ID matches the XML
        CardView cardStar = findViewById(R.id.card_star); // Ensure this ID matches the XML

        // Set OnClickListeners for each CardView
        cardSheep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainScreen.this, Sheep.class); // Ensure Sheep class exists
                startActivity(intent);
            }
        });

        cardStar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainScreen.this, twinkle_star.class); // Ensure TwinkleStar class exists
                startActivity(intent);
            }
        });
    }
}
