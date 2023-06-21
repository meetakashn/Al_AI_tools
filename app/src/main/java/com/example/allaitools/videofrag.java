package com.example.allaitools;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


public class videofrag extends Fragment {
  ImageButton sports,homebutton,colossyan,deepbrain,elai,heygen,invideo,pictory,synthesia,synthesys,veedio;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_videofrag, container, false);
        sports=v.findViewById(R.id.sports);
        homebutton=v.findViewById(R.id.homebutton);
        colossyan=v.findViewById(R.id.colossyan);
        deepbrain=v.findViewById(R.id.deepbrain);
        elai=v.findViewById(R.id.elai);
        heygen=v.findViewById(R.id.heygen);
        invideo=v.findViewById(R.id.invideo);
        pictory=v.findViewById(R.id.pictory);
        synthesia=v.findViewById(R.id.synthesia);
        synthesys=v.findViewById(R.id.synthesys);
        veedio=v.findViewById(R.id.veedio);
        sports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://sportsnewsak.blogspot.com/");
                Intent intent= new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });
        homebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), MainActivity.class);
                startActivity(intent);
            }
        });
        colossyan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.colossyan.com/?via=uniteai");
                Intent intent= new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });
        deepbrain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://aistudios.com/dashboard?openGpt=true");
                Intent intent= new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });
        elai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://elai.io/?via=uniteai");
                Intent intent= new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });
        heygen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://app.heygen.com/guest/home?sid=rewardful&via=uniteai");
                Intent intent= new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });
        invideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://invideo.io/?irclickid=1uSXnT0FwxyPR3Vz4xXRr1iCUkFxmV1-EzMH340&mpid=2459529&irgwc=1");
                Intent intent= new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });
        pictory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://app.pictory.ai/signup");
                Intent intent= new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });
        synthesia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.synthesia.io/free-ai-video-demo#LnD");
                Intent intent= new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });
        synthesys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://synthesys.io/");
                Intent intent= new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });
        veedio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.veed.io/signup?source=pricing-free-plan");
                Intent intent= new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });
        return v;
    }
}