package com.example.android.listviewproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details1);

        TextView ItemsName = findViewById(R.id.details_ItemsNametextView);
        ImageView ItemsImage = findViewById(R.id.details_ItemsImage);
        TextView ItemsPrice = findViewById(R.id.textView);

        Bundle bundle = getIntent().getExtras();
        Items deliveredItems =(Items) bundle.getSerializable("coffee");

        ItemsName.setText(deliveredItems.getItemName());
        ItemsImage.setImageResource(deliveredItems.getItemImage());
        ItemsPrice.setText((int) deliveredItems.getItemPrice() +"");
    }


}