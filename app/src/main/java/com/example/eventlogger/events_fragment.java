package com.example.eventlogger;

import android.app.Activity;
import android.nfc.Tag;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

import static android.content.ContentValues.TAG;

public class events_fragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_chat, container, false);
    }

        String[] events = {"Airplane","sosos"};

        ArrayAdapter myAdapter = new ArrayAdapter();
        ListView mListView = (ListView) findViewById(R.id.myView);
        mListView.setAdapter(CustomAdapter)

        mListView.setOnItemClickListener{
            new AdapterView.OnItemClickListener(){
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                    String event = String.valueOf(parent.getItemAtPosition(position));
                }

            }

        }


    }




