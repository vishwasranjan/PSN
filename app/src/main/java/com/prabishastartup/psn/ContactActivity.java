package com.prabishastartup.psn;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.firebase.auth.FirebaseAuth;

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
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.share_menu:
                try {
                    Intent shareIntent = new Intent(Intent.ACTION_SEND);
                    shareIntent.setType("text/plain");
                    shareIntent.putExtra(Intent.EXTRA_SUBJECT, "My application name");
                    String shareMessage= "\nLet me recommend you this application \n\n";
                    shareMessage = shareMessage + "https://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID +"\n\n";
                    shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);
                    startActivity(Intent.createChooser(shareIntent, "choose one"));
                } catch(Exception e) {
                    //e.toString();
                }
                break;
            case R.id.logout_menu:
                FirebaseAuth.getInstance().signOut();
                finish();
                Intent LogoutIntent=new Intent(this,RegisterUserActivity.class);
                LogoutIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(LogoutIntent);
                break;
        }
        return true;
    }
}