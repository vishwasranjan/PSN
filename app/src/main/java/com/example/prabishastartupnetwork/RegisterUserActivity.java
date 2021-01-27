package com.example.prabishastartupnetwork;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class RegisterUserActivity extends AppCompatActivity {
    private EditText username,password,emailid;
    private Button btnSignup,skipForNow;
    TextView btn_already_have_a_account;
    FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_user);
        mAuth = FirebaseAuth.getInstance();
        username=findViewById(R.id.username);
        password=findViewById(R.id.password);
        emailid=findViewById(R.id.emailid);
        btnSignup=findViewById(R.id.btnsignup);
        skipForNow=findViewById(R.id.skip_for_now);
        btn_already_have_a_account=findViewById(R.id.alredy_have_account);

        btn_already_have_a_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(RegisterUserActivity.this,logInActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });


        skipForNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TransitionToFeedactivity();
            }
        });
        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.getText().toString().equals("")||emailid.getText().toString().equals("")||password.getText().toString().equals(""))
                {
                    ShowToastMeassege("Please fill all the feild");
                }
                else {
                    SignUp();
                }
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
    public void ShowToastMeassege(String messege)
    {
        Toast.makeText(RegisterUserActivity.this,messege,Toast.LENGTH_SHORT).show();
    }

    public void SignUp()
    {
        mAuth.createUserWithEmailAndPassword(emailid.getText().toString(), password.getText().toString())
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            TransitionToFeedactivity();
                            ///Storing user information

                            FirebaseDatabase.getInstance().getReference()
                                    .child("my_users")
                                    .child(task.getResult().getUser().getUid())
                                    .setValue(username.getText().toString());


                        } else
                            {
                            // If sign in fails, display a message to the user.
                            ShowToastMeassege("Something went wrong \n Please try again");
                        }

                        // ...
                    }
                });
    }

    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if (currentUser!=null)
        {
            TransitionToFeedactivity();
        }
    }
}