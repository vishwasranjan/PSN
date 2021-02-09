package com.example.prabishastartupnetwork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class PSNVideoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p_s_n_video);
        setTitle("Prabisha Startup Network Videos");

        YouTubePlayerView youTubePlayerView1 = findViewById(R.id.youtube_player_view_one);
        getLifecycle().addObserver(youTubePlayerView1);


        YouTubePlayerView youTubePlayerView2 = findViewById(R.id.youtube_player_view_two);
        getLifecycle().addObserver(youTubePlayerView2);

        YouTubePlayerView youTubePlayerView3 = findViewById(R.id.youtube_player_view_three);
        getLifecycle().addObserver(youTubePlayerView3);

        YouTubePlayerView youTubePlayerView4 = findViewById(R.id.youtube_player_view_four);
        getLifecycle().addObserver(youTubePlayerView4);

        YouTubePlayerView youTubePlayerView5 = findViewById(R.id.youtube_player_view_five);
        getLifecycle().addObserver(youTubePlayerView5);
    }
}