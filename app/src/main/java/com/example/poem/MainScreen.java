package com.example.poem;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainScreen extends AppCompatActivity {

    private static final String TAG = "MainScreen";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);


        CardView cardSheep = findViewById(R.id.card_sheep);
        CardView cardStar = findViewById(R.id.card_star);
        CardView cardhumpty = findViewById(R.id.card_humpty);
        CardView cardabc = findViewById(R.id.card_abc);
        CardView cardmonkey = findViewById(R.id.card_monkey);
        CardView cardwheel = findViewById(R.id.card_wheels);


        if (cardSheep != null) {
            cardSheep.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainScreen.this, Sheep.class);
                    startActivity(intent);
                }
            });
        } else {
            Log.e(TAG, "CardView 'card_sheep' is null.");
        }


        if (cardStar != null) {
            cardStar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainScreen.this, twinkle_star.class);
                    startActivity(intent);
                }
            });
        } else {
            Log.e(TAG, "CardView 'card_star' is null.");
        }
        if (cardhumpty != null) {
            cardhumpty.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainScreen.this, Humpty_Dumpty.class);
                    startActivity(intent);
                }
            });
        } else {
            Log.e(TAG, "CardView 'card_humpty' is null.");
        }
        if (cardabc != null) {
            cardabc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainScreen.this, ABC.class);
                    startActivity(intent);
                }
            });
        } else {
            Log.e(TAG, "CardView 'card_abc' is null.");
        }
        if (cardwheel != null) {
            cardwheel.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainScreen.this, Wheels_On_Bus.class);
                    startActivity(intent);
                }
            });
        } else {
            Log.e(TAG, "CardView 'card_wheels' is null.");
        }
        if (cardmonkey != null) {
            cardmonkey.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainScreen.this, Monkey.class);
                    startActivity(intent);
                }
            });
        } else {
            Log.e(TAG, "CardView 'card_monkey' is null.");
        }
    }
}
