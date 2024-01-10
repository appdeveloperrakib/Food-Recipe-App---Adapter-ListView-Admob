package com.appdeveloperrakib.tastydishes.Adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.appdeveloperrakib.tastydishes.Activity.FoodsActivity;
import com.appdeveloperrakib.tastydishes.Activity.RecipeDetailsActivity;
import com.appdeveloperrakib.tastydishes.Helper.MakeCategoryList;
import com.appdeveloperrakib.tastydishes.R;
import com.bdtopcoder.quickadmob.Admob;
import com.bdtopcoder.quickadmob.onDismiss;
import com.squareup.picasso.Picasso;


import java.util.ArrayList;
import java.util.HashMap;

public class FoodsAdapter extends BaseAdapter {

    Context context;
    public static ArrayList<HashMap<String ,String >> arrayList;
    LayoutInflater layoutInflater;
    int itemNumber = 1;

    public FoodsAdapter(Context context, ArrayList<HashMap<String, String>> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View myView = layoutInflater.inflate(R.layout.food_item,parent,false);



        //ImageView item_image = myView.findViewById(R.id.iv_itemImage);
        TextView title = myView.findViewById(R.id.food_title);
        TextView foodsitemnumber = myView.findViewById(R.id.food_item_number);
        RelativeLayout rl_foodsitem = myView.findViewById(R.id.rl_foodsitem);

        HashMap<String , String > hashMap = arrayList.get(position);
        String food_title = hashMap.get("Title");
        String food_des = hashMap.get("description");
        String menu_image = hashMap.get("img_url");





        title.setText(food_title);


        itemNumber = position +1;
        foodsitemnumber.setText(String.valueOf(itemNumber));



        rl_foodsitem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                       // FoodsActivity.FOODSTABLE = position;
                        RecipeDetailsActivity.TITLE = food_title;
                        //RecipeDetailsActivity.POSITION = position;
                        RecipeDetailsActivity.DESCRIPTION = food_des;
                        RecipeDetailsActivity.MENUIMG = menu_image;

                        Intent intent = new Intent(context, RecipeDetailsActivity.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(intent);


            }
        });



        return myView;
    }
}
