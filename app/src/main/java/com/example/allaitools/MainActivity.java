package com.example.allaitools;

import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.strictmode.FragmentTagUsageViolation;

public class MainActivity extends AppCompatActivity {
    ImageButton imageai,videoai,audioai,writingai,productiveai,educationai,top10ai,funtoolai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageai=findViewById(R.id.imageai);
        videoai=findViewById(R.id.videoai);
        audioai=findViewById(R.id.audioai);
        writingai=findViewById(R.id.writingai);
        productiveai=findViewById(R.id.productiveai);
        educationai=findViewById(R.id.educationai);
        top10ai=findViewById(R.id.top10ai);
        funtoolai=findViewById(R.id.funtoolai);

        // Status color start
        Window window = MainActivity.this.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.setStatusBarColor(ContextCompat.getColor(MainActivity.this, R.color.black));
        }
        // Status color End

        imageai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container,new imagefrag()).commit();
            }
        });
        //imageai END
        videoai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container,new videofrag()).commit();
            }
        });
        audioai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container,new audiofrag()).commit();

            }
        });
        writingai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container,new writingfrag()).commit();

            }
        });
        productiveai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container,new productivefrag()).commit();
            }
        });
        funtoolai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container,new funfrag()).commit();
            }
        });

        top10ai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container,new toptenfrag()).commit();
            }
        });
    }

}