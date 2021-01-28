package com.example.prabishastartupnetwork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;

public class NewsActivity extends AppCompatActivity {
    TextView news1,news2,news3,news4,news5,news6,news7,news8,news9,news10;
    ScrollView newsfeed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        news1 = findViewById(R.id.news1);
        news2 = findViewById(R.id.news2);
        news3 = findViewById(R.id.news3);
        news4=findViewById(R.id.news4);
        news5 = findViewById(R.id.news5);
        news6 = findViewById(R.id.news6);
        news7 = findViewById(R.id.news7);
        news8 = findViewById(R.id.news8);
        news9 = findViewById(R.id.news9);
        news10 = findViewById(R.id.news10);
        newsfeed = findViewById(R.id.news_feed);
        news1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri1 = Uri.parse("https://www.prabishastartup.com/news/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri1);
                startActivity(intent);
            }
        });
        news2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri2 = Uri.parse("https://www.prabishastartup.com/news/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri2);
                startActivity(intent);
            }
        });
        news3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri3 = Uri.parse("https://www.prabishastartup.com/news/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri3);
                startActivity(intent);
            }
        });
        news4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri4 = Uri.parse("https://www.prabishastartup.com/news/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri4);
                startActivity(intent);
            }
        });
        news5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri5 = Uri.parse("https://www.prabishastartup.com/news/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri5);
                startActivity(intent);
            }
        });
        news6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri6 = Uri.parse("https://www.prabishastartup.com/news/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri6);
                startActivity(intent);
            }
        });
        news7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri7 = Uri.parse("https://www.prabishastartup.com/news/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri7);
                startActivity(intent);
            }
        });
        news8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri8 = Uri.parse("https://www.prabishastartup.com/news/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri8);
                startActivity(intent);
            }
        });
        news9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri9 = Uri.parse("https://www.prabishastartup.com/news/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri9);
                startActivity(intent);
            }
        });
        news10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri10 = Uri.parse("https://www.prabishastartup.com/news/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri10);
                startActivity(intent);
            }
        });

    }
}