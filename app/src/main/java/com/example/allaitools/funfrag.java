package com.example.allaitools;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


public class funfrag extends Fragment {

    ImageButton homebutton,semantris,quickdraw,generative,freddie,deepbeat,deepart,deep,cyborg,books;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View  v= inflater.inflate(R.layout.fragment_funfrag, container, false);
        homebutton=v.findViewById(R.id.homebutton);
        semantris=v.findViewById(R.id.semantris);
        quickdraw=v.findViewById(R.id.quickdraw);
        generative=v.findViewById(R.id.generative);
        freddie=v.findViewById(R.id.generative);
        deepbeat=v.findViewById(R.id.deepbeat);
        deepart=v.findViewById(R.id.deepart);
        deep=v.findViewById(R.id.deep);
        cyborg=v.findViewById(R.id.cyborg);
        books=v.findViewById(R.id.books);
        homebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), MainActivity.class);
                startActivity(intent);
            }
        });
        semantris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://research.google.com/semantris/");
                Intent intent= new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });
        quickdraw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://quickdraw.withgoogle.com/");
                Intent intent= new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });
        generative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://experiments.runwayml.com/generative_engine/");
                Intent intent= new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });
        freddie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://freddiemeter.withyoutube.com/");
                Intent intent= new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });
        deepbeat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://deepbeat.org/");
                Intent intent= new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });
        deepart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.deepart.io/");
                Intent intent= new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });
        deep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.myheritage.com/deep-nostalgia?irclickid=1uSXnT0FwxyPR3Vz4xXRr1iCUkFxFMyeF2yZVE0&tr_ad_group=27795&irgwc=1&utm_source=partner_impact&utm_medium=partner");
                Intent intent= new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });
        cyborg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://cyborg.tenso.rs/");
                Intent intent= new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });
        books.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://books.google.com/talktobooks/");
                Intent intent= new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });
        return v;
    }
}