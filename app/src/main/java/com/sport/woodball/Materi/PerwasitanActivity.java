package com.sport.woodball.Materi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

import com.sport.woodball.R;


/**
 * Created by vjivandro on 9/30/17.
 */

public class PerwasitanActivity extends AppCompatActivity {

    AppCompatActivity materi = this;

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.perwasitan_main);


        LinearLayout tanda = (LinearLayout) findViewById(R.id.tanda);
        tanda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent wt = new Intent(materi, TandaWasit.class);
                startActivity(wt);
            }
        });

        LinearLayout jenis = (LinearLayout) findViewById(R.id.jenis);
        jenis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent jn = new Intent(materi, JenisScoreSheet.class);
                startActivity(jn);
            }
        });

        LinearLayout nomor = (LinearLayout) findViewById(R.id.nomor);
        nomor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent no = new Intent(materi, Penomoran.class);
                startActivity(no);
            }
        });

        LinearLayout hasil = (LinearLayout) findViewById(R.id.hasil);
        hasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hsl = new Intent(materi, HasilAkhir.class);
                startActivity(hsl);
            }
        });
    }
}
