package com.typodots.androidmediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button play,pause,stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        play = findViewById(R.id.play);
        pause = findViewById(R.id.pause);
        stop = findViewById(R.id.stop);

        play.setOnClickListener(this);
        stop.setOnClickListener(this);

//        play.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                 
//            }
//        });
    }

    @Override
    public void onClick(View v) {
        if (v == play){
            startService(new Intent(this,MediaService.class));
        } else if (v == stop) {
            stopService(new Intent(this,MediaService.class));
        }
    }
}