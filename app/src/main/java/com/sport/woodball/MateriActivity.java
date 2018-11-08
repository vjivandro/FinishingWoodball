package com.sport.woodball;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Button;

import com.sport.woodball.Materi.ManfaatActivity;
import com.sport.woodball.Materi.PerwasitanActivity;
import com.sport.woodball.Materi.WoodBallActivity;
import com.sport.woodball.R;
import com.sport.woodball.Variasi.VariasiActivity;
import com.sport.woodball.VideoActivity;

/**
 * Created by vjivandro on 9/20/17.
 */

public class MateriActivity extends AppCompatActivity {

    AppCompatActivity myclass = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi);

        // Menu 1
        Button menu1 = (Button) findViewById(R.id.btnWb);
        menu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ms = new Intent(myclass, WoodBallActivity.class);
                startActivity(ms);
            }
        });

        // Menu 2
        Button menu2 = (Button) findViewById(R.id.btnWasit);
        menu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent md = new Intent(myclass, PerwasitanActivity.class);
                startActivity(md);
            }
        });

        // Menu 3

        Button menu3 = (Button) findViewById(R.id.btnManfaat);
        menu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mf = new Intent(myclass, ManfaatActivity.class);
                startActivity(mf);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.option_menu_item_1:
                // TODO Something when menu item selected
                Intent help = new Intent(this, BantuanActivity.class);
                startActivity(help);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
