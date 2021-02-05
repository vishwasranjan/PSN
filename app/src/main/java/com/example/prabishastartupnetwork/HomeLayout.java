package com.example.prabishastartupnetwork;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeLayout extends AppCompatActivity {
    CardView home_cardview,feed_cardview,startupstory_cardview,psnvideo_cardview,news_cardview,events_cardview,resources_cardview,
            blog_cardview,quiz_cardview,contact_cardview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_layout);
        home_cardview=findViewById(R.id.home_cardview);
        feed_cardview=findViewById(R.id.feed_cardview);
        startupstory_cardview=findViewById(R.id.startupstory_cardview);
        psnvideo_cardview=findViewById(R.id.psnvideo_cardview);
        news_cardview=findViewById(R.id.news_cardview);
        events_cardview=findViewById(R.id.events_cardview);
        resources_cardview=findViewById(R.id.resources_cardview);
        blog_cardview=findViewById(R.id.blog_cardview);
        quiz_cardview=findViewById(R.id.quiz_cardview);
        contact_cardview=findViewById(R.id.contact_cardview);

        home_cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeLayout.this,HomeActivity.class);
                startActivity(intent);
            }
        });
        feed_cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeLayout.this,FeedActivity.class);
                startActivity(intent);
            }
        });
        startupstory_cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeLayout.this,StartupStoryActivity.class);
                startActivity(intent);
            }
        });
        psnvideo_cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeLayout.this,PSNVideoActivity.class);
                startActivity(intent);
            }
        });
        news_cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeLayout.this,NewsActivity.class);
                startActivity(intent);
            }
        });
        events_cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeLayout.this,EventsActivity.class);
                startActivity(intent);
            }
        });
        resources_cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeLayout.this,ResourcesActivity.class);
                startActivity(intent);
            }
        });
        blog_cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeLayout.this,BlogActivity.class);
                startActivity(intent);
            }
        });
        quiz_cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeLayout.this,QuizActivity.class);
                startActivity(intent);
            }
        });
        contact_cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeLayout.this,ContactActivity.class);
                startActivity(intent);
            }
        });
    }
}