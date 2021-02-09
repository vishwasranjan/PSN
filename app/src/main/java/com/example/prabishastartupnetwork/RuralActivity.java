package com.example.prabishastartupnetwork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class RuralActivity extends AppCompatActivity {
    TextView rural_news;
    ImageView rural_vies_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rural);
        setTitle("Rural");
        rural_news=findViewById(R.id.rural_news);
        rural_vies_img=findViewById(R.id.rural_news_image);
        rural_vies_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.dailyexcelsior.com/need-to-strengthen-ecosystem-to-encourage-more-startups-in-rural-areas-thakur/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        rural_news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.dailyexcelsior.com/need-to-strengthen-ecosystem-to-encourage-more-startups-in-rural-areas-thakur/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
    }
}