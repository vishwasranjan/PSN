package com.example.prabishastartupnetwork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class BlogActivity extends AppCompatActivity {
    TextView blog1,blog2,blog3,blog1_detail,blog2_detail,blog3_detail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blog);
        setTitle("Blog");
        blog1=findViewById(R.id.blog1);
        blog1_detail=findViewById(R.id.blog1_detail);
        blog2=findViewById(R.id.blog2);
        blog2_detail=findViewById(R.id.blog2_detail);
        blog3=findViewById(R.id.blog3);
        blog3_detail=findViewById(R.id.blog3_detail);

        //To view the blog onclick
        blog1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blog1_detail.setText(R.string.blog1_detail);
            }
        });

        blog1_detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blog1_detail.setText("");
            }
        });
        blog2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blog2_detail.setText(R.string.blog1_detail);
            }
        });
        blog2_detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blog2_detail.setText("");
            }
        });

        blog3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blog3_detail.setText(R.string.blog1_detail);
            }
        });
        blog3_detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blog3_detail.setText("");
            }
        });

    }

}