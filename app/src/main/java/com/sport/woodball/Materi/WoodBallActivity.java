package com.sport.woodball.Materi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

import com.sport.woodball.R;

/**
 * Created by vjivandro on 9/20/17.
 */

public class WoodBallActivity extends AppCompatActivity {

    AppCompatActivity materi = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.materi_woodball);

        LinearLayout sj = (LinearLayout) findViewById(R.id.sejarah);
        sj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s = new Intent(materi, SejarahActivity.class);
                startActivity(s);
            }
        });

        LinearLayout gm = (LinearLayout) findViewById(R.id.permainan);
        gm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pn = new Intent(materi, PermainanWoodBall.class);
                startActivity(pn);
            }
        });

        LinearLayout fs = (LinearLayout) findViewById(R.id.fasilitas);
        fs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ff = new Intent(materi, FasilitasActivity.class);
                startActivity(ff);
            }
        });
    }
}
