package com.appdeveloperrakib.tastydishes.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.appdeveloperrakib.tastydishes.R;
import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

public class RecipeDetailsActivity extends AppCompatActivity {

    ImageView iv_recipeimage;
    TextView tv_recipetitle,tv_recipedes;


    public static  String TITLE ="";
    public static String MENUIMG ="";
    public static String DESCRIPTION = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_details);

        iv_recipeimage = findViewById(R.id.iv_menuimg);
        tv_recipetitle = findViewById(R.id.tv_recipetitle);
        tv_recipedes = findViewById(R.id.tv_recipedes);

        Toolbar toolbar = (Toolbar) findViewById(R.id.tb_foods);
        setSupportActionBar(toolbar);
        if(getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        tv_recipetitle.setText(TITLE);
        tv_recipedes.setText(DESCRIPTION);
        Picasso.get().load(MENUIMG)
                .placeholder(R.drawable.loading)
                .into(iv_recipeimage);


    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId()== android.R.id.home){
            finish();
        }

        return super.onOptionsItemSelected(item);
    }

}