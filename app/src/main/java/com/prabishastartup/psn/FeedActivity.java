package com.prabishastartup.psn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class FeedActivity extends AppCompatActivity{
    private ImageView Menu;
    Button fillforum;
    TextView visitWebsite;
    ImageView eCommereceWebsiteAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);
       // Menu=findViewById(R.id.menu_main);
        fillforum=findViewById(R.id.fill_forum);
        visitWebsite=findViewById(R.id.visit_our_website);
        eCommereceWebsiteAdd=findViewById(R.id.new_e_commerce_add);
        eCommereceWebsiteAdd.setTranslationX(5000f);
        eCommereceWebsiteAdd.animate().translationXBy(-5000f).setDuration(2000);
        eCommereceWebsiteAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.prabisha.com/web-development/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });


        YouTubePlayerView youTubePlayerView = findViewById(R.id.youtube_player_view);
        getLifecycle().addObserver(youTubePlayerView);

//        Menu.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(FeedActivity.this,WelcomeActivity.class);
//                startActivity(intent);
//            }
//        });

        fillforum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Clicking will open the link
                Uri uri = Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLScVPoMJScpeDoXHVsn50sdBWb8saZVIJLxcwHe-6xtIJ-I3Bw/viewform");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        visitWebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.prabishastartup.com/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

    }


}