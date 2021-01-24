package com.example.prabishastartupnetwork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterUserActivity extends AppCompatActivity {
    private EditText username,password,emailid;
    private Button btnSignup,skipForNow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_user);
        username=findViewById(R.id.username);
        password=findViewById(R.id.password);
        emailid=findViewById(R.id.emailid);
        btnSignup=findViewById(R.id.btnsignup);
        skipForNow=findViewById(R.id.skip_for_now);


        skipForNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TransitionToFeedactivity();
            }
        });
        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TransitionToFeedactivity();
                ShowToastMeassege("Sign Up Sucessfully");
            }
        });
    }
    public void TransitionToFeedactivity()
    {
        //Transition to feed activity after signin sucessfully
        Intent intent=new Intent(this,FeedActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
    public void Signup()
    {
        //SignUp to user
    }
    public void ShowToastMeassege(String messege)
    {
        Toast.makeText(RegisterUserActivity.this,messege,Toast.LENGTH_SHORT).show();
    }

}