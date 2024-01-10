package com.appdeveloperrakib.tastydishes.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

import com.appdeveloperrakib.tastydishes.Helper.MyControl;
import com.appdeveloperrakib.tastydishes.R;
import com.bdtopcoder.quickadmob.Admob;

public class SplashScreen extends AppCompatActivity {

    ImageView imgmain;
    //TextView textmain,textsecond;
    Animation top, bottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        //Set adunit Id
        MyControl.AdUnit();

        // Load Interstitial Ads
        Admob.loadInterstitialAds(this);

        imgmain = findViewById(R.id.imgmain);
        // textmain = findViewById(R.id.textmain);
        //textsecond = findViewById(R.id.textsecond);

        top = AnimationUtils.loadAnimation(this,R.anim.top);
        //bottom = AnimationUtils.loadAnimation(this,R.anim.bottom);



        Thread splashThread = new Thread() {

            @Override
            public void run() {

                try {
                    imgmain.setAnimation(top);
                    // textmain.setAnimation(bottom);
                    //textsecond.setAnimation(bottom);
                    sleep(5000);

                        startActivity(new Intent(getApplicationContext(),MainActivity.class));
                        finish();

                }catch (InterruptedException e) {

                    e.printStackTrace();

                }

                super.run();
            }
        };

        splashThread.start();

    }
}