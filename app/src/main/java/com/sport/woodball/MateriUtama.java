package com.sport.woodball;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.sport.woodball.Variasi.VariasiActivity;

public class MateriUtama extends AppCompatActivity {

    AppCompatActivity myclass = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_utama);

        // Menu 4
        Button menu4 = (Button) findViewById(R.id.btnVariasi);
        menu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent me = new Intent(myclass, VariasiActivity.class);
                startActivity(me);
            }
        });

        // Menu 5
        Button menu5 = (Button) findViewById(R.id.btnVideo);
        menu5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vd = new Intent(myclass, VideoActivity.class);
                startActivity(vd);
            }
        });
    }
}
