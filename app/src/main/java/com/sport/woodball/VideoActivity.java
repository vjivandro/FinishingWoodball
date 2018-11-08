package com.sport.woodball;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.sport.woodball.R;
import com.sport.woodball.Video.Video_Variasi1;
import com.sport.woodball.Video.Video_Variasi2;
import com.sport.woodball.Video.Video_Variasi3;
import com.sport.woodball.Video.Video_Variasi4;
import com.sport.woodball.Video.Video_Variasi5;
import com.sport.woodball.Video.Video_Variasi6;
import com.sport.woodball.Video.Video_Variasi7;
import com.sport.woodball.Video.Video_Variasi8;
import com.sport.woodball.Video.Video_Variasi9;
import com.sport.woodball.Video.Video_Variasi10;

/**
 * Created by vjivandro on 9/28/17.
 */

public class VideoActivity extends AppCompatActivity {
    AppCompatActivity video = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        Button variasi1 = (Button) findViewById(R.id.vd1);
        variasi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent video1 = new Intent(video, Video_Variasi1.class);
                startActivity(video1);
            }
        });

        Button variasi2 = (Button) findViewById(R.id.vd2);
        variasi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent video2 = new Intent(video, Video_Variasi2.class);
                startActivity(video2);
            }
        });

        Button variasi3 = (Button) findViewById(R.id.vd3);
        variasi3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent video3 = new Intent(video, Video_Variasi3.class);
                startActivity(video3);
            }
        });

        Button variasi4 = (Button) findViewById(R.id.vd4);
        variasi4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent video4 = new Intent(video, Video_Variasi4.class);
                startActivity(video4);
            }
        });
        
        Button variasi5 = (Button) findViewById(R.id.vd5);
        variasi5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent video5 = new Intent(video, Video_Variasi5.class);
                startActivity(video5);
            }
        });

        Button variasi6 = (Button) findViewById(R.id.vd6);
        variasi6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent video6 = new Intent(video, Video_Variasi6.class);
                startActivity(video6);
            }
        });

        Button variasi7 = (Button) findViewById(R.id.vd7);
        variasi7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent video7 = new Intent(video, Video_Variasi7.class);
                startActivity(video7);
            }
        });

        Button variasi8 = (Button) findViewById(R.id.vd8);
        variasi8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent video8 = new Intent(video, Video_Variasi8.class);
                startActivity(video8);
            }
        });

        Button variasi9 = (Button) findViewById(R.id.vd9);
        variasi9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent video9 = new Intent(video, Video_Variasi9.class);
                startActivity(video9);
            }
        });

        Button variasi10 = (Button) findViewById(R.id.vd10);
        variasi10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent video10 = new Intent(video, Video_Variasi10.class);
                startActivity(video10);
            }
        });
    }
}
