package com.example.poem;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class twinkle_star extends AppCompatActivity {

    private Button btnTwinkle;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twinkle_star); // Ensure this points to your correct XML layout

        // Initialize button and MediaPlayer
        btnTwinkle = findViewById(R.id.btntwinkle);
        mediaPlayer = MediaPlayer.create(this, R.raw.twinkle_star); // Replace "twinkle_star" with your actual audio file

        // Set click listener on the button
        btnTwinkle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Play the audio when button is clicked
                if (mediaPlayer != null) {
                    mediaPlayer.start(); // Start playing the audio
                }
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        // Release the media player when the activity is paused to prevent memory leaks
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        // Release the media player when the activity is stopped
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}
