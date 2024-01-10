package com.appdeveloperrakib.tastydishes.Activity;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.appdeveloperrakib.tastydishes.Adapter.MyAdapter;
import com.appdeveloperrakib.tastydishes.Helper.MakeCategoryList;
import com.appdeveloperrakib.tastydishes.R;
import com.bdtopcoder.quickadmob.Admob;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    GridView gv_main;
    public static int CategoryClicked = -10;



    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ActionBarDrawerToggle toggle;

    LinearLayout ll_internet;
    AppCompatButton bt_retry;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gv_main = findViewById(R.id.gv_main);
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.navigation_menu);

        ll_internet = findViewById(R.id.ll_internet);
        bt_retry = findViewById(R.id.bt_Retry);

        checkConnection();

        //Show Banner Ad
        Admob.setBanner(findViewById(R.id.showBanner),MainActivity.this);




        MakeCategoryList categoryList = new MakeCategoryList(this);
        categoryList.CreateCatAndFoodsList();

        MyAdapter adapter = new MyAdapter(this);
        gv_main.setAdapter(adapter);
        adapter.notifyDataSetChanged();

      //Admob Ad initilization

        toggle = new ActionBarDrawerToggle(MainActivity.this, drawerLayout, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();


        // Drawer item Click event ------
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int itemId = item.getItemId();

                if (itemId == R.id.condition) {
//                    Dialog dialog = new MaterialAlertDialogBuilder(MainActivity.this, R.style.MyRounded_MaterialComponents_MaterialAlertDialog)
//                            .setTitle("Contact Us")
//                            .setMessage(R.string.contact)
//                            .setNegativeButton("ok", new DialogInterface.OnClickListener() {
//                                public void onClick(DialogInterface dialog, int which) {
//                                    Log.d("AlertDialog", "Negative");
//                                }
//                            })
//                            .show();
//                    dialog.setCanceledOnTouchOutside(false);
//                    drawerLayout.closeDrawers();

                    startActivity(new Intent(MainActivity.this, PrivacyPolicy.class));
                    drawerLayout.closeDrawers();

                }

                return false;
            }
        });
        //------------------------------


        // App Bar Click Event
        ImageView imageMenu = findViewById(R.id.drawer);

        imageMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Code Here
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });

        bt_retry.setOnClickListener(v -> {

            startActivity(new Intent(MainActivity.this,SplashScreen.class));
            checkConnection();
           // Admob.setBanner(findViewById(R.id.showBanner),MainActivity.this);
            //Admob.loadInterstitialAds(this);

        });


    }

    public void checkConnection(){

        ConnectivityManager connectivityManager = (ConnectivityManager) this.getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo wifi = connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
        NetworkInfo mobileNetwork = connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);

        if (wifi.isConnected()||mobileNetwork.isConnected()) {


            //gv_main.setVisibility(View.VISIBLE);
            ll_internet.setVisibility(View.GONE);



        }
        else {

            gv_main.setVisibility(View.GONE);
            ll_internet.setVisibility(View.VISIBLE);

        }


    }






    //End Intestial Ads

    //Start Bannar Ads



    //End Banner AD


    private static final int TIME_INTERVAL = 2000; // # milliseconds, desired
    private long mBackPressed;

    // When user click bakpress button this method is called
    @Override
    public void onBackPressed() {
        // When user press back button

        if (mBackPressed + TIME_INTERVAL > System.currentTimeMillis()) {
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);

        } else {

            Toast.makeText(getBaseContext(), "Press again to exit",
                    Toast.LENGTH_SHORT).show();
        }

        mBackPressed = System.currentTimeMillis();



    } // end of onBackpressed method


}