package com.example.prabishastartupnetwork;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class HomeLayout extends AppCompatActivity {
    CardView home_cardview,feed_cardview,startupstory_cardview,forum_cardview,news_cardview,events_cardview,resources_cardview,
            blog_cardview,service_cardview,contact_cardview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_layout);
        setTitle("");
        home_cardview=findViewById(R.id.home_cardview);
        feed_cardview=findViewById(R.id.feed_cardview);
        startupstory_cardview=findViewById(R.id.startupstory_cardview);
        forum_cardview=findViewById(R.id.forum_cardview);
        news_cardview=findViewById(R.id.news_cardview);
        events_cardview=findViewById(R.id.events_cardview);
        resources_cardview=findViewById(R.id.resources_cardview);
        blog_cardview=findViewById(R.id.blog_cardview);
        service_cardview=findViewById(R.id.service_cardview);
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
        forum_cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.prabishastartup.com/community/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
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
                Uri uri = Uri.parse("https://www.prabisha.com/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
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
        service_cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeLayout.this,ServicesActivity.class);
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