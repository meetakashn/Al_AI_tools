package com.example.allaitools;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


public class imagefrag extends Fragment {
    ImageButton sample,homebutton,fotor,nightcafe,wombo,dalle,midjou,autoenhance,lunapic,pixlr,cariyon;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_imagefrag, container, false);
        homebutton=v.findViewById(R.id.homebutton);
        fotor=v.findViewById(R.id.fotor);
        nightcafe=v.findViewById(R.id.nightcafe);
        wombo=v.findViewById(R.id.wombo);
        dalle=v.findViewById(R.id.dalle);
        midjou=v.findViewById(R.id.midjou);
        autoenhance=v.findViewById(R.id.autoenhance);
        lunapic=v.findViewById(R.id.lunapic);
        pixlr=v.findViewById(R.id.pixlr);
        cariyon=v.findViewById(R.id.cariyon);
        sample=v.findViewById(R.id.sample);
        sample.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto", "akashmudaliyar2@gmail.com", null));
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Need of app");
                getContext().startActivity(Intent.createChooser(emailIntent, null));
            }
        });
        homebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), MainActivity.class);
                startActivity(intent);
            }
        });
        fotor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.fotor.com/features/ai-image-generator/");
                Intent intent= new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });
        nightcafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://creator.nightcafe.studio/");
                Intent intent= new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });
        wombo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://dream.ai/create");
                Intent intent= new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });
        dalle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://openai.com/dall-e-2/");
                Intent intent= new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });
        midjou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://docs.midjourney.com/");
                Intent intent= new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });
        autoenhance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.autoenhance.ai/");
                Intent intent= new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });
        lunapic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www3.lunapic.com/editor/");
                Intent intent= new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });
        pixlr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://pixlr.com/?sscid=61k7_m5eog&");
                Intent intent= new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });
        cariyon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.craiyon.com/");
                Intent intent= new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });
        return v;
    }
}