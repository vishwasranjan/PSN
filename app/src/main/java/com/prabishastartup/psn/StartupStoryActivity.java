package com.prabishastartup.psn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class StartupStoryActivity extends AppCompatActivity {
    TextView startup_tech,startup_education,startup_social,startup_healthcare,startup_rural,startup_women,startup_international;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startup_story);
        setTitle("Startup Story");
        startup_tech=findViewById(R.id.Startup_technical);
        startup_education=findViewById(R.id.Startup_education);
        startup_social=findViewById(R.id.Startup_social);
        startup_healthcare=findViewById(R.id.Startup_healthcare);
        startup_rural=findViewById(R.id.Startup_rural);
        startup_women=findViewById(R.id.Startup_women);
        startup_international=findViewById(R.id.Startup_international);

        startup_tech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent=new Intent(StartupStoryActivity.this,TechnologyActivity.class);
               startActivity(intent);
            }
        });
        startup_education.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent eduIntent=new Intent(StartupStoryActivity.this,EducationActivity.class);
                startActivity(eduIntent);

            }
        });
        startup_social.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent socialIntent=new Intent(StartupStoryActivity.this,SocialWorkActivity.class);
                startActivity(socialIntent);

            }
        });
        startup_healthcare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent healthIntent=new Intent(StartupStoryActivity.this,HealthcareActivity.class);
                startActivity(healthIntent);

            }
        });
        startup_rural.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ruralIntent=new Intent(StartupStoryActivity.this,RuralActivity.class);
                startActivity(ruralIntent);

            }
        });
        startup_women.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent womenIntent=new Intent(StartupStoryActivity.this,WomenActivity.class);
                startActivity(womenIntent);

            }
        });
        startup_international.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent interIntent=new Intent(StartupStoryActivity.this,InternationalActivity.class);
                startActivity(interIntent);

            }
        });


    }
}