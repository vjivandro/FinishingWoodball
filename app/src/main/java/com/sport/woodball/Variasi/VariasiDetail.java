package com.sport.woodball.Variasi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;

import com.sport.woodball.R;


/**
 * Created by vjivandro on 9/25/17.
 */

public class VariasiDetail extends AppCompatActivity {

    ImageView image;
    TextView variasi, tujuan, peralatan, petunjuk;
    ImageSwitcher imageSwitcher;
    Integer[] imageIDs = new Integer[3];
    int msg_image;

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.variasi_detail);

        Intent identifikasi = getIntent();
        msg_image = identifikasi.getIntExtra("dataIM", 0);
        String msg_variasi = identifikasi.getStringExtra("dataVariasi");
        String msg_tujuan = identifikasi.getStringExtra("dataTujuan");
        String msg_peralatan = identifikasi.getStringExtra("dataPeralatan");
        String msg_petunjuk = identifikasi.getStringExtra("dataPetunjuk");

        image = (ImageView) findViewById(R.id.imageVar);
        variasi = (TextView) findViewById(R.id.textVariasi);
        tujuan = (TextView) findViewById(R.id.textTujuan);
        peralatan = (TextView) findViewById(R.id.textPeralatan);
        petunjuk = (TextView) findViewById(R.id.textPetunjuk);

        image.setImageResource(msg_image);
        variasi.setText(msg_variasi);
        tujuan.setText(msg_tujuan);
        peralatan.setText(msg_peralatan);
        petunjuk.setText(msg_petunjuk);
    }
}
