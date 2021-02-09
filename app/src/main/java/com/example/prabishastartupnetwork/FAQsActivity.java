package com.example.prabishastartupnetwork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FAQsActivity extends AppCompatActivity {
    TextView faq_1,faq_1_ans,faq_2,faq_2_ans,faq_3,faq_3_ans,faq_4,faq_4_ans,faq_5,faq_5_ans,faq_6,faq_6_ans,
            faq_7,faq_7_ans,faq_8,faq_8_ans,faq_9,faq_9_ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f_a_qs);
        faq_1=findViewById(R.id.faq_1);
        faq_1_ans=findViewById(R.id.faq_1_ans);
        faq_2=findViewById(R.id.faq_2);
        faq_2_ans=findViewById(R.id.faq_2_ans);
        faq_3=findViewById(R.id.faq_3);
        faq_3_ans=findViewById(R.id.faq_3_ans);
        faq_4=findViewById(R.id.faq_4);
        faq_4_ans=findViewById(R.id.faq_4_ans);
        faq_5=findViewById(R.id.faq_5);
        faq_5_ans=findViewById(R.id.faq_5_ans);
        faq_6=findViewById(R.id.faq_6);
        faq_6_ans=findViewById(R.id.faq_6_ans);
        faq_7=findViewById(R.id.faq_7);
        faq_7_ans=findViewById(R.id.faq_7_ans);
        faq_8=findViewById(R.id.faq_8);
        faq_8_ans=findViewById(R.id.faq_8_ans);
        faq_9=findViewById(R.id.faq_9);
        faq_9_ans=findViewById(R.id.faq_9_ans);


        faq_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                faq_1_ans.setText(R.string.faq_ans_1);
            }
        });
        faq_1_ans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                faq_1_ans.setText("");
            }
        });
        faq_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                faq_2_ans.setText(R.string.faq_ans_2);
            }
        });
        faq_2_ans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                faq_2_ans.setText("");
            }
        });


        faq_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                faq_3_ans.setText(R.string.faq_ans_3);
            }
        });
        faq_3_ans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                faq_3_ans.setText("");
            }
        });

        faq_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                faq_4_ans.setText(R.string.faq_ans_4);
            }
        });
        faq_4_ans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                faq_4_ans.setText("");
            }
        });

        faq_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                faq_5_ans.setText(R.string.faq_ans_5);
            }
        });
        faq_5_ans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                faq_5_ans.setText("");
            }
        });

        faq_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                faq_6_ans.setText(R.string.faq_ans_6);
            }
        });
        faq_6_ans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                faq_6_ans.setText("");
            }
        });

        faq_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                faq_7_ans.setText(R.string.faq_ans_7);
            }
        });
        faq_7_ans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                faq_7_ans.setText("");
            }
        });
        faq_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                faq_8_ans.setText(R.string.faq_ans_8);
            }
        });
        faq_8_ans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                faq_8_ans.setText("");
            }
        });
        faq_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                faq_9_ans.setText(R.string.faq_ans_9);
            }
        });
        faq_9_ans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                faq_9_ans.setText("");
            }
        });
    }
}