package com.example.prabishastartupnetwork;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class ResourcesActivity extends AppCompatActivity {
    CardView psn_video,mentors,mantees,l_and_d,faqs,internship,careers,startup_quiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resources);
        setTitle("Resources");
        psn_video=findViewById(R.id.psn_video_cardview);
        mentors=findViewById(R.id.mentors_cardview);
        mantees=findViewById(R.id.mantees_cardview);
        l_and_d=findViewById(R.id.l_and_d_cardview);
        faqs=findViewById(R.id.faqs_cardview);
        internship=findViewById(R.id.internship_cardview);
        careers=findViewById(R.id.careers_cardview);
        startup_quiz=findViewById(R.id.startup_quiz__cardview);



        psn_video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ResourcesActivity.this,PSNVideoActivity.class);
                startActivity(intent);
            }
        });
        mentors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent=new Intent(ResourcesActivity.this,MentorsActivity.class);
               startActivity(intent);
            }
        });
        mantees.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ResourcesActivity.this,ManteesActivity.class);
                startActivity(intent);
            }
        });
        l_and_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ResourcesActivity.this,LandDActivity.class);
                startActivity(intent);
            }
        });
        faqs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ResourcesActivity.this,FAQsActivity.class);
                startActivity(intent);
            }
        });
        internship.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ResourcesActivity.this,InternshipAvtivity.class);
                startActivity(intent);
            }
        });
        careers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ResourcesActivity.this,CareersActivity.class);
                startActivity(intent);
            }
        });
        startup_quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.prabishastartup.com/quiz/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
    }


}