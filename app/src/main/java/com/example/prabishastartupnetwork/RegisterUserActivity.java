package com.example.prabishastartupnetwork;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GoogleAuthProvider;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class RegisterUserActivity extends AppCompatActivity {
    private EditText username,password,emailid;
    private Button btnSignup;
    TextView btn_already_have_a_account;
    ImageView google_signin;
    FirebaseAuth mAuth;
    private GoogleSignInClient mGoogleSignInClient;
    public static final int RC_SIGN_IN=123;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_user);
        mAuth = FirebaseAuth.getInstance();
        username=findViewById(R.id.username);
        password=findViewById(R.id.password);
        emailid=findViewById(R.id.emailid);
        btnSignup=findViewById(R.id.btnsignup);
        btn_already_have_a_account=findViewById(R.id.alredy_have_account);
        google_signin=findViewById(R.id.google_signin);
        createRequest();

        google_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Signinwithgoogle();
            }
        });


        btn_already_have_a_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(RegisterUserActivity.this,logInActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
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
    public void createRequest()
    {
        // Configure Google Sign In
        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestIdToken(getString(R.string.default_web_client_id))
                .requestEmail()
                .build();
        // Build a GoogleSignInClient with the options specified by gso.
        mGoogleSignInClient = GoogleSignIn.getClient(this, gso);
    }
    public void Signinwithgoogle()
    {
        Intent signInIntent = mGoogleSignInClient.getSignInIntent();
        startActivityForResult(signInIntent, RC_SIGN_IN);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        // Result returned from launching the Intent from GoogleSignInApi.getSignInIntent(...);
        if (requestCode == RC_SIGN_IN) {
            Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);
            try {
                // Google Sign In was successful, authenticate with Firebase
                GoogleSignInAccount account = task.getResult(ApiException.class);
                firebaseAuthWithGoogle(account.getIdToken());
            } catch (ApiException e) {
                // Google Sign In failed, update UI appropriately
                Toast.makeText(this,"Something Went Wrong",Toast.LENGTH_SHORT).show();
            }
        }
    }
    private void firebaseAuthWithGoogle(String idToken) {
        AuthCredential credential = GoogleAuthProvider.getCredential(idToken, null);
        mAuth.signInWithCredential(credential)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            FirebaseUser user = mAuth.getCurrentUser();
                            TransitionToFeedactivity();

                            //Saving Data
                            FirebaseDatabase.getInstance().getReference()
                                    .child("my_users")
                                    .child(task.getResult().getUser().getUid())
                                    .setValue(GoogleSignIn.getLastSignedInAccount(RegisterUserActivity.this).getDisplayName().toString());
                        } else {
                            // If sign in fails, display a message to the user.
                            ShowToastMeassege("Authentication Failed");
                        }

                        // ...
                    }
                });
    }



}