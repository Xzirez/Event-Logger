package com.example.eventlogger;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends ArrayAdapter<String> {

    CustomAdapter(Context context, String[] events){
        super(context, R.layout.testview, events);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        LayoutInflater buckysInflater = LayoutInflater.from(getContext());
        View customView = buckysInflater.inflate(R.layout.testview, parent, false);

        String singleEventItem = getItem(position);
        TextView buckysText = (TextView) customView.findViewById(R.id.txt);
        ImageView buckysImage = (ImageView) customView.findViewById(R.id.plane);

        buckysText.setText(singleEventItem);
        buckysImage.setImageResource(R.drawable.airplane);
        return customView;


    }
}
