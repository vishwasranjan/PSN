package com.example.prabishastartupnetwork;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

public class FeedActivity extends AppCompatActivity {
    private ImageView Menu;
    Button fillforum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);
        Menu=findViewById(R.id.menu_main);
        fillforum=findViewById(R.id.fill_forum);
        Menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FeedActivity.this,WelcomeActivity.class);
                startActivity(intent);
            }
        });

        fillforum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Clicking will open the link
                Uri uri = Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLScVPoMJScpeDoXHVsn50sdBWb8saZVIJLxcwHe-6xtIJ-I3Bw/viewform"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
    }


}