package com.example.prabishastartupnetwork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ContactActivity extends AppCompatActivity {
    ImageView new_website_add,new_logo_add,new_video_anim_add,fb_folow,ln_follow,twitter_follow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        setTitle("Contact");
        new_website_add=findViewById(R.id.new_website_add);
        new_logo_add=findViewById(R.id.new_logo_add);
        new_video_anim_add=findViewById(R.id.new_animation_video_add);
        fb_folow=findViewById(R.id.facebook_follow);
        ln_follow=findViewById(R.id.ln_follow);
        twitter_follow=findViewById(R.id.twitter_follow);

        fb_folow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.facebook.com/groups/PrabishaStartupNetwork/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        ln_follow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.linkedin.com/company/prabishastartupnetwork/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        twitter_follow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://twitter.com/prabishac");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        imageAnimation(new_logo_add,5000f,1000);
        imageAnimation(new_website_add,-5000f,2000);
        imageAnimation(new_video_anim_add,5000f,2000);

        new_logo_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.prabisha.com/logo-design/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        new_video_anim_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.prabisha.com/animation-videos/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        new_website_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.prabisha.com/web-development/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
    }
    public void imageAnimation(ImageView imageView,Float InitialPosition,Integer time)
    {
        imageView.setTranslationX(InitialPosition);
        imageView.animate().translationXBy(-1*InitialPosition).setDuration(time);
    }
}