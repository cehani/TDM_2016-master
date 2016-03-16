package com.example.hani.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class PlaceholderFragment extends Fragment {


    public View onCreateView(LayoutInflater inflater, ViewGroup view,
                             Bundle savedInstanceState){
        View v= inflater.inflate(R.layout.fragment_main,null);
        TextView textView = (TextView) v.findViewById(R.id.section_label);
        Bundle bund=getArguments();
        int i=bund.getInt("pos");
        if(i==0){
            textView.setText("Fragment 1");
        }
        if(i==1){
            textView.setText("Fragment 2");
        }
        if(i==2){
            textView.setText("Fragment 3");
        }



        return v;
    }
}
