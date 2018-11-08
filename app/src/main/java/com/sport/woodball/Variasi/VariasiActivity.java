package com.sport.woodball.Variasi;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.SimpleCursorAdapter;

import com.sport.woodball.Database.DataBaseHandler;
import com.sport.woodball.R;

/**
 * Created by vjivandro on 9/20/17.
 */

public class VariasiActivity extends AppCompatActivity {
    protected GridView gd;
    protected ListAdapter adapter;
    SQLiteDatabase db;
    Cursor cursor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.variasi_grid);

        db = (new DataBaseHandler(this)).getWritableDatabase();
        gd = (GridView) findViewById(R.id.grid);

        try {
            cursor = db.rawQuery("SELECT * FROM variasi ORDER BY _id", null);
            adapter = new SimpleCursorAdapter(this, R.layout.variasi_main, cursor,
                    new String[] { "nama", "icon" }, new int[] {
                    R.id.nama, R.id.image });
            gd.setAdapter(adapter);
            gd.setTextFilterEnabled(true);
            gd.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView<?> parent, View v,
                                        int position, long id) {
                    detail(position);

                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public void detail(int position) {
        int image = 0;
        String _id = "";
        String variasi = "";
        String tujuan = "";
        String peralatan ="";
        String petunjuk ="";
        if (cursor.moveToFirst()) {
            cursor.moveToPosition(position);
            image = cursor.getInt(cursor.getColumnIndex("image"));
            variasi = cursor.getString(cursor.getColumnIndex("variasi"));
            tujuan = cursor.getString(cursor.getColumnIndex("tujuan"));
            peralatan = cursor.getString(cursor.getColumnIndex("peralatan"));
            petunjuk = cursor.getString(cursor.getColumnIndex("petunjuk"));
        }

        Intent iIntent = new Intent(this, VariasiDetail.class);
        iIntent.putExtra("dataIM", image);
        iIntent.putExtra("dataVariasi", variasi);
        iIntent.putExtra("dataTujuan", tujuan);
        iIntent.putExtra("dataPeralatan", peralatan);
        iIntent.putExtra("dataPetunjuk", petunjuk);
        setResult(RESULT_OK, iIntent);
        startActivityForResult(iIntent, 99);




    }
}
