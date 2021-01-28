package com.example.prabishastartupnetwork;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ShareCompat;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class WelcomeActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    Toolbar toolbar;
    private DrawerLayout drawer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer=findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle Toggle=new ActionBarDrawerToggle(this,drawer,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawer.addDrawerListener(Toggle);
        Toggle.syncState();
        NavigationView navigationView=findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }



    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.nav_home:

//              getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new HomeFragentt()).commit();
                Intent HomeIntent=new Intent(this,HomeActivity.class);
                startActivity(HomeIntent);
                break;
            case R.id.nav_startup_story:
                Intent StartupStoryIntent=new Intent(this,StartupStoryActivity.class);
                startActivity(StartupStoryIntent);
                break;
            case R.id.nav_psn_vieo:
                Intent PsnVideoIntent=new Intent(this,PSNVideoActivity.class);
                startActivity(PsnVideoIntent);
                break;
            case R.id.nav_news:
                Intent NewsIntent=new Intent(this,NewsActivity.class);
                startActivity(NewsIntent);
                break;
            case R.id.nav_events:
                Intent EventsIntent=new Intent(this,EventsActivity.class);
                startActivity(EventsIntent);
                break;
            case R.id.nav_resources:
                Intent ResourcesIntent=new Intent(this,ResourcesActivity.class);
                startActivity(ResourcesIntent);
                break;
            case R.id.nav_blog:
                Intent BlogIntent=new Intent(this,BlogActivity.class);
                startActivity(BlogIntent);
                break;
            case R.id.nav_forum:
                Intent ForumIntent=new Intent(this,ForumActivity.class);
                startActivity(ForumIntent);
                break;
            case R.id.nav_quiz:
                Intent QuizIntent=new Intent(this,QuizActivity.class);
                startActivity(QuizIntent);
                break;
            case R.id.nav_contact:
                Intent ContactIntent=new Intent(this,ContactActivity.class);
                startActivity(ContactIntent);
                break;
            case R.id.nav_logout:
                FirebaseAuth.getInstance().signOut();
                finish();
                Intent LogoutIntent=new Intent(this,RegisterUserActivity.class);
                LogoutIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(LogoutIntent);
                break;
//            case R.id.nav_share:
//                final String appPackageName = WelcomeActivity.this.getPackageName();
//                Intent sendIntent = new Intent();
//                sendIntent.setAction(Intent.ACTION_SEND);
//                sendIntent.putExtra(Intent.EXTRA_TEXT, "Check out the App at: https://play.google.com/store/apps/details?id=" + appPackageName);
//                sendIntent.setType("text/plain");
//                WelcomeActivity.this.startActivity(sendIntent);
//                break;

        }
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}