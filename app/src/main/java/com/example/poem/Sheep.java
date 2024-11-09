package com.example.poem;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Sheep extends AppCompatActivity {

    private Button btnSheep;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sheep);

        btnSheep = findViewById(R.id.btnsheep);

        // Initialize the MediaPlayer to play the audio from res/raw
        mediaPlayer = MediaPlayer.create(this, R.raw.sheepsong);  // Ensure you have 'sheepsong.mp3' in res/raw

        // Set the onClickListener for the button
        btnSheep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer != null && !mediaPlayer.isPlaying()) {
                    mediaPlayer.start();  // Start playing the audio
                }
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (mediaPlayer != null) {
            mediaPlayer.pause();  // Pause the audio if the activity is paused
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (mediaPlayer != null) {
            mediaPlayer.release();  // Release the MediaPlayer resources when the activity is stopped
            mediaPlayer = null;
        }
    }
}
