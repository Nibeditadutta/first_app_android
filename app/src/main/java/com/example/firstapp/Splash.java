package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import static java.lang.Thread.sleep;

public class Splash extends AppCompatActivity
{
    ImageView splashImage;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        splashImage = (ImageView)findViewById(R.id.imageSplash);

        Animation  splashAnim = AnimationUtils.loadAnimation(this,R.anim.anim);
        splashImage.startAnimation(splashAnim);

        Thread splashThread;
        splashThread = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                try
                {
                    sleep(5000);
                    Intent i = new Intent(Splash.this,MainActivity.class);
                    startActivity(i);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }

            }
        });
        splashThread.start();
        // startActivity(new Intent(this,MainActivity.class));
    }
}