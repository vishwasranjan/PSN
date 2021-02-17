package com.prabishastartup.psn;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class logInActivity extends AppCompatActivity {
    FirebaseAuth mAuth;
    EditText emailid_ligin,password_login;
    Button btnLogin;
    LinearLayout back_image_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        mAuth = FirebaseAuth.getInstance();
        emailid_ligin=findViewById(R.id.emailid_login);
        password_login=findViewById(R.id.password_login);
        btnLogin=findViewById(R.id.btnsLogin);
        back_image_login=findViewById(R.id.back_image_login);



        back_image_login=findViewById(R.id.back_image);
        int[] imageArray = {R.drawable.feedmetting, R.drawable.one, R.drawable.two,
                R.drawable.three, R.drawable.four,};

        Handler handler = new Handler();
        Runnable runnable = new Runnable() {
            int i = 0;

            public void run() {
                back_image_login.setBackgroundResource(imageArray[i]);
                i++;
                if (i > imageArray.length - 1) {
                    i = 0;
                }
                handler.postDelayed(this, 3000);
            }
        };
        handler.postDelayed(runnable, 3000);




        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SignIn();
            }
        });
    }
    public void SignIn()
    {
        mAuth.signInWithEmailAndPassword(emailid_ligin.getText().toString(), password_login.getText().toString())
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Intent intent=new Intent(logInActivity.this,FeedActivity.class);
                            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
                            startActivity(intent);

                        } else {
                            ShowToastMeassege("Something went wrong");
                        }

                        // ...
                    }
                });
    }
    public void ShowToastMeassege(String messege)
    {
        Toast.makeText(logInActivity.this,messege,Toast.LENGTH_SHORT).show();
    }
}