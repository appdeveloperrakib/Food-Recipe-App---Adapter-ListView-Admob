package com.appdeveloperrakib.tastydishes.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.TextView;

import com.appdeveloperrakib.tastydishes.Adapter.FoodsAdapter;
import com.appdeveloperrakib.tastydishes.Helper.MakeCategoryList;
import com.appdeveloperrakib.tastydishes.R;

import java.util.ArrayList;
import java.util.HashMap;

public class FoodsActivity extends AppCompatActivity {

    ListView lv_food;
    TextView foodBar_title;

    public static ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();

    public static Integer  FOODSTABLE = 0;
    public static String FOODSBARTITILE ="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foods);
        MainActivity.CategoryClicked = -10;

        lv_food = findViewById(R.id.lv_food);
        foodBar_title = findViewById(R.id.foodBar_title);

       Toolbar toolbar = (Toolbar) findViewById(R.id.tb_foods);
        setSupportActionBar(toolbar);
        if(getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }


        FoodsAdapter foodadapter = new FoodsAdapter(getApplicationContext(),arrayList);
        lv_food.setAdapter(foodadapter);
        foodadapter.notifyDataSetChanged();

        foodBar_title.setText(FOODSBARTITILE);

    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId()== android.R.id.home){
            finish();
        }

        return super.onOptionsItemSelected(item);
    }
}