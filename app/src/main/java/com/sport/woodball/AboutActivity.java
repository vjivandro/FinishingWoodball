package com.sport.woodball;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AboutActivity extends AppCompatActivity {

    AppCompatActivity about = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button own = (Button) findViewById(R.id.owner);
        own.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ceo = new Intent(about, AboutOwner.class);
                startActivity(ceo);
            }
        });
        Button video = (Button) findViewById(R.id.videografi);
        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alert = new AlertDialog.Builder(about);
                alert.setTitle("Videografer");
                alert.setMessage("Sandy Yulianto");
                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                AlertDialog dialog = alert.create();
                dialog.show();
            }
        });

        Button desinger = (Button) findViewById(R.id.desiner);
        desinger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alert = new AlertDialog.Builder(about);
                alert.setTitle("Designer");
                alert.setMessage("Miftahul Husna Ibnu Febrian");
                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                AlertDialog dialog = alert.create();
                dialog.show();
            }
        });

        Button pro = (Button) findViewById(R.id.mobile);
        pro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alert = new AlertDialog.Builder(about);
                alert.setTitle("Mobile Developer");
                alert.setMessage("Juris Vassa Ivandro");
                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                AlertDialog dialog = alert.create();
                dialog.show();
            }
        });


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent email = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto","yunan.fadlila@gmail.com", null
                ));
                email.putExtra(Intent.EXTRA_SUBJECT, "Judul Email");
                startActivity(Intent.createChooser(email, "Send email..."));
                /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
            }
        });

        TextView fak = (TextView) findViewById(R.id.fak);
        fak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fik = new Intent(about, WebFikActivity.class);
                startActivity(fik);
            }
        });

        TextView univ = (TextView) findViewById(R.id.univ);
        univ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent um = new Intent(about, WebUnivActivity.class);
                startActivity(um);
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
