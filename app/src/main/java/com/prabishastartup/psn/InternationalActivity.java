package com.prabishastartup.psn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class InternationalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_international);
        setTitle("International");


        YouTubePlayerView youTubePlayerView = findViewById(R.id.youtube_player_view_international);
        getLifecycle().addObserver(youTubePlayerView);
    }
}