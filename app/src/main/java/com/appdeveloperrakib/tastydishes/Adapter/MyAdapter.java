package com.appdeveloperrakib.tastydishes.Adapter;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.appdeveloperrakib.tastydishes.Activity.FoodsActivity;
import com.appdeveloperrakib.tastydishes.Activity.MainActivity;
import com.appdeveloperrakib.tastydishes.Helper.MakeCategoryList;
import com.appdeveloperrakib.tastydishes.R;
import com.bdtopcoder.quickadmob.Admob;
import com.bdtopcoder.quickadmob.onDismiss;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.SplittableRandom;

public class MyAdapter extends BaseAdapter {

    Context context;
   // ArrayList<HashMap<String ,String >> arrayList = new ArrayList<>();
    LayoutInflater layoutInflater;


    public MyAdapter(Context context) {
        this.context = context;
       // this.arrayList = arrayList;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return MakeCategoryList.catArrayList.size();
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
       View myView =  layoutInflater.inflate(R.layout.item_home,parent,false);



        TextView tvtitle = myView.findViewById(R.id.tv_title);
        ImageView iv_recepeImage = myView.findViewById(R.id.iv_recepeImage);
        RelativeLayout llmain = myView.findViewById(R.id.ll_main);

        HashMap<String ,String > hashMap = MakeCategoryList.catArrayList.get(position);
        String cat_name=  hashMap.get("cat_name");
        String cat_image = hashMap.get("cat_image");


        if (tvtitle!=null){
            tvtitle.setText(cat_name);
        }
        if (iv_recepeImage!=null && cat_image!=null) {
            int drawable = Integer.parseInt(cat_image);
            iv_recepeImage.setImageResource( drawable );
        }




        if(llmain!=null){
            llmain.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                   // MainActivity.CategoryClicked = position;

                    //Toast.makeText(context, "Hello", Toast.LENGTH_SHORT).show();
                    FoodsActivity.FOODSTABLE = position;
                    FoodsActivity.FOODSBARTITILE = cat_name;


                    MainActivity.CategoryClicked = position;

                    FoodsActivity.arrayList = MakeCategoryList.rootArrayList.get(position);

                    // Show Ads
                    new Admob(new onDismiss() {
                        @Override
                        public void onDismiss() {
                            // When Ads Close Take Action
                            // 1. Go to New Activity what you want Actually
                            Intent intent = new Intent(context, FoodsActivity.class);
                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            context.startActivity(intent);
                        }
                    }).ShowInterstitial((Activity) context,true);









                }
            });
        }




        return myView;
    }
}
