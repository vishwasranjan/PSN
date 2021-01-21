package com.example.prabishastartupnetwork;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

public class FeedActivity extends AppCompatActivity {
    private TextView aboutus,aboutus1,aboutus2,aboutus3;
    private ImageView add1,add2,Menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);
        aboutus=findViewById(R.id.aboutus);
        aboutus1=findViewById(R.id.aboutus1);
        aboutus2=findViewById(R.id.aboutus2);
        aboutus3=findViewById(R.id.aboutus3);
        add2=findViewById(R.id.add2);
        Menu=findViewById(R.id.menu_main);
        Menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FeedActivity.this,WelcomeActivity.class);
                startActivity(intent);
            }
        });


        Animation(-2000f,aboutus,500);
        Animation(20000f,aboutus1,1500);
        Animation(-2000f,aboutus2,5000);
        Animation(2000f,aboutus3,8000);
        add2.setY(-2000f);
        add2.animate().translationYBy(2000f).setDuration(1500);
    }


    public void Animation(Float position, TextView textView, int duration)
    {
        textView.setX(-position);
        textView.animate().translationXBy(position).setDuration(duration);
    }

}