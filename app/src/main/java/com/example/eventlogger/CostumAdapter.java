package com.example.eventlogger;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CostumAdapter extends ArrayAdapter<String> {

    CostumAdapter(Context context){
        super(context, R.layout.testview);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        LayoutInflater buckysInflater = LayoutInflater.from(getContext());
        View customView = buckysInflater.inflate(R.layout.testview, parent, false);

        String singleFoodItem = getItem(position);
        TextView buckyText = (TextView) customView.findViewById(R.id.txt);
        ImageView buckysImage = (ImageView) customView.findViewById(R.id.plane);

        buckysImage.setImageResource(R.drawable.airplane);
        return customView;


    }
}
