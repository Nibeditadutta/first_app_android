package com.example.firstapp;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.ClipData;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;


public class MainActivity extends AppCompatActivity
{
    NavigationView nav;
    ActionBarDrawerToggle toggle;
    DrawerLayout drawerLayout;
    Toolbar tool;
    LinearLayout layoutCar;


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        layoutCar = (LinearLayout) findViewById(R.id.car_layout);

       // layoutCar.setOnClickListener((View.OnClickListener) this);

//        startActivity(intent);););

        tool         =   (Toolbar) findViewById(R.id.toolBar);
        setSupportActionBar(tool);


        nav          =   (NavigationView)findViewById(R.id.navemenuID);
        drawerLayout =   (DrawerLayout)findViewById(R.id.drawer);

        toggle       =   new ActionBarDrawerToggle(this, drawerLayout, tool, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        nav.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener()
        {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item)
            {
                switch (item.getItemId())
                {
                    case R.id.menu_login:
                        //to show alert

                        Toast.makeText(getApplicationContext(),"Login panel is open",Toast.LENGTH_LONG).show();
                        //to close the nav drawer
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.menu_home:
                        //to show alert
                        Toast.makeText(getApplicationContext(),"Home panel is open",Toast.LENGTH_LONG).show();
                        //to close the nav drawer
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.menu_settings:
                        //to show alert
                        Toast.makeText(getApplicationContext(),"Setting panel is open",Toast.LENGTH_LONG).show();
                        //to close the nav drawer
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.menu_logout:
                        //to show alert
                        Toast.makeText(getApplicationContext(),"Logout panel is open",Toast.LENGTH_LONG).show();
                        //to close the nav drawer
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                }
                return false;
            }
        });

    }


    public void clickHandlerForCarLayout(View view)
    {
        Intent intent =new Intent(MainActivity.this, BikeActivityPage.class);
        startActivity(intent);

    }
}

