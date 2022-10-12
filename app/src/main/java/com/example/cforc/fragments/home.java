package com.example.cforc.fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cforc.R;


public class home extends Fragment {
View view;
CardView cvBriefC,cvfchart,cvalgo,cvComment_in_c;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_home, container, false);

        cvBriefC=view.findViewById(R.id.cvBrifC);
        cvfchart=view.findViewById(R.id.cvfchart);
        cvalgo=view.findViewById(R.id.cvalgo);
        cvComment_in_c=view.findViewById(R.id.cvComment_in_c);

        //intent
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);

        cvBriefC.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                intent.setData(Uri.parse("https://cprogrammingclub.blogspot.com/2022/07/a-brief-discussion-about-c.html"));
                startActivity(intent);
            }
        });


        cvalgo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                intent.setData(Uri.parse("https://cprogrammingclub.blogspot.com/2022/07/a-brief-discussion-about-c.html"));
                startActivity(intent);
            }
        });


        cvfchart.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                intent.setData(Uri.parse("https://cprogrammingclub.blogspot.com/2022/07/algorithm-and-flowchart-in-c.html"));
                startActivity(intent);
            }
        });
        cvComment_in_c.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                intent.setData(Uri.parse("https://cprogrammingclub.blogspot.com/2022/07/comments-in-c.html"));
                startActivity(intent);
            }
        });




        return view;
    }
}