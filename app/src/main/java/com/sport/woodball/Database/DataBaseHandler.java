package com.sport.woodball.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.sport.woodball.R;

/**
 * Created by vjivandro on 9/25/17.
 */

public class DataBaseHandler extends SQLiteOpenHelper {
    final static String DB_NAME = "woodball";

    public DataBaseHandler(Context context){
        super(context, DB_NAME, null, 1);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        /*Tabel Variasi*/
        String sql = "CREATE TABLE IF NOT EXISTS variasi(_id INTEGER PRIMARY KEY AUTOINCREMENT, nama TEXT, variasi TEXT, tujuan TEXT, peralatan TEXT, petunjuk TEXT, image BLOB, icon BLOB)";
        db.execSQL(sql);

        ContentValues values = new ContentValues();
        values.put("_id","1");
        values.put("nama","Variasi 1");
        values.put("variasi","Latihan 1");
        values.put("tujuan","Agar atlet dapat menyelesaikan pukulan dengan cepat arah gawang atau finishing dengan jarak 1,5 meter.");
        values.put("peralatan","Peralatan yang digunakan dalam melakukan variasi latihan ini adalah meteran, gawang ( gate ) sebanyak 1 buah, bola sebanyak 10 buah, dan 1 buah Stick (mallet) untuk setiap atlet, blangko kontrol latihan.");
        values.put("petunjuk","Atlet diharapkan memukul bola dengan lurus pada jarak 1,5 meter karena zona finishing maksimal 2 meter dari gate, variasi ini menggunakan metode drill dengan 10 bola dengan ketentuan arah panah biru menjadi yang baik, arah panah merah daerah yang sedang dan arah panah kuning daerah yang cukup dengan ketentuan 10 kali pukulan. Pada latihan ini, pukulan finishing dari jarak 1,5 meter dengan ketentuan masing-masing atlet, memukul 10 bola kearah sasaran dengan sistem penilaian seperti digambar, untuk arah panah biru menyatakan nilai maksimal yaitu 3, arah panah  merah tepat pada gate bagian samping dengan nilai sedang atau nilai 2, dan sedangkan arah panah kuning menyatakan nilai cukup atau 1, karena arah bola tidak tepat sasaran atau kearah luar lapangan belakang gate.");
        values.put("image", R.drawable.variasi1);
        values.put("icon", R.drawable.var1);
        db.insert("variasi", "_id", values);

        values.put("_id","2");
        values.put("nama","Variasi 2");
        values.put("variasi","Latihan 2");
        values.put("tujuan","Agar atlet dapat menyelesaikan pukulan dengan cepat arah gawang atau finishing jarak 1,5 meter dengan arah lurus .");
        values.put("peralatan","Peralatan yang digunakan dalam melakukan variasi latihan ini adalah meteran, gawang ( gate ) sebanyak 1 buah, bola sebanyak 10 buah, dan 1 buah Stick (mallet),  untuk setiap atlet, blangko kontrol latihan dan kun l.");
        values.put("petunjuk","Atlet diharapkan memukul bola dengan lurus kea rah gate pada jarak 1,5 meter karena zona finishing maksimal 2 meter dari gate, variasi ini menggunakan metode drill dengan 10 pukulan dan dengan ketentuan dan penempatan bola sesuai dengan gambar serta sistem penilaianya untuk arah panah biru menyatakan nilai maksimal yaitu 3, arah panah  merah tepat pada gate bagian samping dengan nilai sedang atau nilai 2, dan sedangkan arah panah kuning menyatakan nilai cukup atau 1, karena arah bola tidak tepat sasaran atau kearah luar lapangan belakang gate. Pada latihan ini, latihan ini kita kombinasi dengan tambahan kun diantara jarak bola dengan gate, yaitu dengan jarak bola ke kun 1 m dan jarak kun ke arah gate 0,5 m, seperti yang dicontohkan pada gambar 2.6.");
        values.put("image",R.drawable.variasi2);
        values.put("icon", R.drawable.var2);
        db.insert("variasi", "_id", values);

        values.put("_id","3");
        values.put("nama","Variasi 3");
        values.put("variasi","Latihan 3");
        values.put("tujuan","Agar atlet dapat menyelesaikan pukulan dengan cepat arah gawang atau finishing jarak 1,5 meter dengan arah samping kiri dengan sudut kemiringan.");
        values.put("peralatan","Peralatan yang digunakan dalam melakukan variasi latihan ini adalah meteran, gawang ( gate ) sebanyak 1 buah, bola sebanyak 5 buah, dan 1 buah Stick (mallet) untuk setiap atlet, blangko kontrol latihan dan kun.");
        values.put("petunjuk","Atlet diharapkan memukul bola dengan lurus kea rah gate pada jarak 1,5 meter karena zona finishing maksimal 2 meter dari gate, variasi ini menggunakan metode drill dengan 10 pukulan dan dengan ketentuan dan penempatan bola sesuai dengan gambar serta sistem penilaianya untuk arah panah biru menyatakan nilai maksimal yaitu 3, arah panah  merah tepat pada gate bagian samping dengan nilai sedang atau nilai 2, dan sedangkan arah panah kuning menyatakan nilai cukup atau 1, karena arah bola tidak tepat sasaran atau kearah luar lapangan belakang gate. Pada latihan ini, kita kombinasi dengan tambahan kun ke arah serong ke kiri ,diantara jarak bola dengan gate, yaitu dengan jarak bola ke kun 1 m dan jarak kun ke arah gate 0,5 m, seperti yang dicontohkan pada gambar 2.7.");
        values.put("image",R.drawable.variasi3);
        values.put("icon", R.drawable.var3);
        db.insert("variasi","_id",values);

        values.put("_id","4");
        values.put("nama","Variasi 4");
        values.put("variasi","Latihan 4");
        values.put("tujuan","Agar atlet dapat menyelesaikan pukulan dengan cepat arah gawang atau finishing jarak 1,5 meter dengan arah samping kanan. Meningkatkan akurasi pukulan dalam permainan woodball");
        values.put("peralatan","Peralatan yang digunakan dalam melakukan variasi latihan ini adalah meteran, gawang ( gate ) sebanyak 1 buah, bola sebanyak 10 buah, dan 1 buah Stick (mallet) untuk setiap atlet, blangko kontrol latihan dan kun latihan.");
        values.put("petunjuk","Atlet diharapkan memukul bola dengan lurus kea rah gate pada jarak 1,5 meter karena zona finishing maksimal 2 meter dari gate, variasi ini menggunakan metode drill dengan 10 pukulan dan dengan ketentuan dan penempatan bola sesuai dengan gambar serta sistem penilaianya untuk arah panah biru menyatakan nilai maksimal yaitu 3, arah panah  merah tepat pada gate bagian samping dengan nilai sedang atau nilai 2, dan sedangkan arah panah kuning menyatakan nilai cukup atau 1, karena arah bola tidak tepat sasaran atau kearah luar lapangan belakang gate. Pada latihan ini, kita kombinasi dengan tambahan kun ke arah serong samping kanan. Atlet melakukan pukulan arah serong kanan sebanyak 10 kali. Diantara jarak bola dengan gate 1,5 meter,  jarak bola ke kun 1 m, jarak kun ke arah gate 0,5 m, dan jarak antar kun 20 cm  seperti yang dicontohkan pada gambar 2.8. ");
        values.put("image",R.drawable.variasi4);
        values.put("icon", R.drawable.var4);
        db.insert("variasi","_id",values);

        values.put("_id","5");
        values.put("nama","Variasi 5");
        values.put("variasi","Latihan 5");
        values.put("tujuan","1) Agar atlet dapat menyelesaikan pukulan dengan cepat arah gawang atau finishing jarak 1,5 meter dengan arah lurus.\n"+"2) Melatih akurasi finishing dan meningkatkan kelurusan dalam pukulan.");
        values.put("peralatan","Peralatan yang digunakan dalam melakukan variasi latihan ini adalah meteran, gawang ( gate ) sebanyak 1 buah, bola sebanyak 10 buah, dan 1 buah Stick (mallet) untuk setiap atlet, blangko kontrol latihan dan 2 bambu yang sudah di potong.");
        values.put("petunjuk","Atlet diharapkan memukul bola dengan lurus kea rah gate pada jarak 1,5 meter karena zona finishing maksimal 2 meter dari gate, model ini menggunakan metode drill dengan 10 bola dengan sistem penilaian seperti digambar, untuk arah panah biru menyatakan nilai maksimal yaitu 3, arah panah  merah tepat pada gate bagian samping dengan nilai sedang atau nilai 2, dan sedangkan arah panah kuning menyatakan nilai cukup atau 1, karena arah bola tidak tepat sasaran atau kearah luar lapangan belakang gate. \n" +
                "Pada latihan ini, kita kombinasi dengan tambahan 2 potongan bambu  dengan panjang 50 cm, diantara bola, jarak antar bambu 15 cm, dan dilakukan dari arah lurus dengan ketentuan jarak seperti variasi di atas dan posisi bola ke gate (posisi arah lurus) seperti contoh pada gambar 2.9. ");
        values.put("image",R.drawable.variasi5);
        values.put("icon", R.drawable.var5);
        db.insert("variasi","_id",values);

        values.put("_id","6");
        values.put("nama","Variasi 6");
        values.put("variasi","Latihan 6");
        values.put("tujuan","1) Agar atlet dapat menyelesaikan pukulan dengan cepat arah gawang atau finishing jarak 1,5 meter dengan arah lurus.\n" +
                "2) Melatih akurasi finishing dan meningkatkan kelurusan dalam pukulan pada posisi kemiringan.");
        values.put("peralatan","Peralatan yang digunakan dalam melakukan variasi latihan ini adalah meteran, gawang ( gate ) sebanyak 1 buah, bola sebanyak 10 buah, dan 1 buah Stick (mallet) untuk setiap atlet, blangko kontrol latihan, dan 2 bambu yang sudah di potong.");
        values.put("petunjuk","Atlet diharapkan memukul bola dengan lurus kea rah gate pada jarak 1,5 meter karena zona finishing maksimal 2 meter dari gate, model ini menggunakan metode drill dengan 10 bola dengan sistem penilaian seperti digambar, untuk arah panah biru menyatakan nilai maksimal yaitu 3, arah panah  merah tepat pada gate bagian samping dengan nilai sedang atau nilai 2, dan sedangkan arah panah kuning menyatakan nilai cukup atau 1, karena arah bola tidak tepat sasaran atau kearah luar lapangan belakang gate. \n" +
                "Pada latihan ini, kita kombinasi dengan tambahan potongan bambu  dengan panjang 50 cm, diantara bola, jarak antar kun sekitar 15 cm, dan dilakukan dari arah serong kanan dengan ketentuan jarak seperti di atas dan posisi bola ke gate (posisi serong ke samping kiri) seperti contoh pada gambar 2.10. ");
        values.put("image",R.drawable.variasi6);
        values.put("icon", R.drawable.var6);
        db.insert("variasi","_id",values);

        values.put("_id","7");
        values.put("nama","Variasi 7");
        values.put("variasi","Latihan 7");
        values.put("tujuan","1) Agar atlet dapat menyelesaikan pukulan dengan cepat arah gawang atau finishing jarak 1,5 meter dengan arah lurus.\n" +
                "2) Melatih akurasi finishing dan meningkatkan kelurusan dalam pukulan pada posisi kemiringan.");
        values.put("peralatan","Peralatan yang digunakan dalam melakukan variasi latihan ini adalah meteran, gawang ( gate ) sebanyak 1 buah, bola sebanyak 10 buah, dan 1 buah Stick (mallet) untuk setiap atlet, blangko kontrol latihan dan 2 bambu yang sudah di potong.");
        values.put("petunjuk","Atlet diharapkan memukul bola dengan lurus kea rah gate pada jarak 1,5 meter karena zona finishing maksimal 2 meter dari gate, model ini menggunakan metode drill dengan 10 bola dengan sistem penilaian seperti digambar, untuk arah panah biru menyatakan nilai maksimal yaitu 3, arah panah  merah tepat pada gate bagian samping dengan nilai sedang atau nilai 2, dan sedangkan arah panah kuning menyatakan nilai cukup atau 1, karena arah bola tidak tepat sasaran atau kearah luar lapangan belakang gate. \n" +
                "Pada latihan ini, kita kombinasi dengan tambahan potongan bambu  dengan panjang 50 cm, diantara bola, jarak antar kun sekitar 15 cm, dan dilakukan dari arah samping kanan dengan ketentuan jarak seperti di atas dan posisi bola ke gate (posisi serong ke samping kanan) seperti contoh pada gambar 2.11. ");
        values.put("image",R.drawable.variasi7);
        values.put("icon", R.drawable.var7);
        db.insert("variasi","_id",values);

        values.put("_id","8");
        values.put("nama","Variasi 8");
        values.put("variasi","Latihan 8");
        values.put("tujuan","1) Agar atlet dapat menyelesaikan pukulan dengan cepat arah gawang atau finishing jarak 3 meter dengan arah lurus.\n" +
                "2) Melatih akurasi finishing dan meningkatkan kelurusan dalam pukulan pada posisi lurur dengan halang rintang di depanya.");
        values.put("peralatan","Peralatan yang digunakan dalam melakukan variasi latihan ini adalah meteran, gawang ( gate ) sebanyak 1 buah, bola sebanyak 10 buah, dan 1 buah Stick (mallet) untuk setiap atlet, ranting/rumput, dan blangko kontrol latihan.");
        values.put("petunjuk","Atlet diharapkan memukul bola dengan lurus kea rah gate pada jarak 3 meter karena zona finishing maksimal 2 meter dari gate, variasi ini menggunakan metode drill dengan 10 pukulan dan dengan ketentuan dan penempatan bola sesuai dengan gambar serta sistem penilaianya untuk arah panah biru menyatakan nilai maksimal yaitu 3, arah panah  merah tepat pada gate bagian samping dengan nilai sedang atau nilai 2, dan sedangkan arah panah kuning menyatakan nilai cukup atau 1, karena arah bola tidak tepat sasaran atau kearah luar lapangan belakang gate.\n" +
                "Pada latihan ini, kita kombinasi dengan tambahan halang rintang berupa ranting pohon ataupun rumput agar meningkatkan akurasi dengan fairway halang rintang, dan dilakukan dari arah lurus dengan ketentuan jarak bola ke arah halang 1 meter seperti di atas dan posisi bola ke gate (posisi bidikan lurus) seperti contoh pada gambar. ");
        values.put("image",R.drawable.variasi8);
        values.put("icon", R.drawable.var8);
        db.insert("variasi","_id",values);

        values.put("_id","9");
        values.put("nama","Variasi 9");
        values.put("variasi","Latihan 9");
        values.put("tujuan","1) Agar atlet dapat menyelesaikan pukulan dengan cepat arah gawang atau finishing jarak 3 meter dengan arah lurus.\n" +
                "2) Melatih akurasi finishing dan meningkatkan kelurusan dalam pukulan pada posisi lurus dengan halang rintang di depanya dengan posisi sasaran miring.");
        values.put("peralatan","Peralatan yang digunakan dalam melakukan variasi latihan ini adalah meteran, gawang ( gate ) sebanyak 1 buah, bola sebanyak 10 buah, dan 1 buah Stick (mallet) untuk setiap atlet, blangko kontrol latihan dan halang rintang.");
        values.put("petunjuk","Atlet diharapkan memukul bola dengan lurus kea rah gate pada jarak 3 meter karena zona finishing maksimal 2 meter dari gate, variasi ini menggunakan metode drill dengan 10 pukulan dan dengan ketentuan dan penempatan bola sesuai dengan gambar serta sistem penilaianya untuk arah panah biru menyatakan nilai maksimal yaitu 3, arah panah  merah tepat pada gate bagian samping dengan nilai sedang atau nilai 2, dan sedangkan arah panah kuning menyatakan nilai cukup atau 1, karena arah bola tidak tepat sasaran atau kearah luar lapangan belakang gate.\n " +
                "Pada latihan ini, kita kombinasi dengan tambahan halang rintang berupa ranting pohon ataupun rumput agar meningkatkan akurasi dengan fairway halang rintang, dan dilakukan dari arah serong kiri dari gate dengan ketentuan jarak bola ke arah halang 1 meter seperti di atas dan posisi bola ke gate (posisi bidikan serong kiri dari gate) seperti contoh pada gambar.");
        values.put("image",R.drawable.variasi9);
        values.put("icon", R.drawable.var9);
        db.insert("variasi","_id",values);

        values.put("_id","10");
        values.put("nama","Variasi 10");
        values.put("variasi","Latihan 10");
        values.put("tujuan","1) Agar atlet dapat menyelesaikan pukulan dengan cepat arah gawang atau finishing jarak 3 meter dengan arah lurus.\n" +
                "2) Melatih akurasi finishing dan meningkatkan kelurusan dalam pukulan pada posisi lurus dengan halang rintang di depanya dengan posisi sasaran miring.");
        values.put("peralatan","Peralatan yang digunakan dalam melakukan variasi latihan ini adalah meteran, gawang ( gate ) sebanyak 1 buah, bola sebanyak 10 buah, dan 1 buah Stick (mallet) untuk setiap atlet, blangko kontrol latihan dan halang rintang.");
        values.put("petunjuk","Atlet diharapkan memukul bola dengan lurus kea rah gate pada jarak 3 meter karena zona finishing maksimal 2 meter dari gate, variasi ini menggunakan metode drill dengan 10 pukulan dan dengan ketentuan dan penempatan bola sesuai dengan gambar serta sistem penilaianya untuk arah panah biru menyatakan nilai maksimal yaitu 3, arah panah  merah tepat pada gate bagian samping dengan nilai sedang atau nilai 2, dan sedangkan arah panah kuning menyatakan nilai cukup atau 1, karena arah bola tidak tepat sasaran atau kearah luar lapangan belakang gate.\n " +
                "Pada latihan ini, kita kombinasi dengan tambahan halang rintang berupa ranting pohon ataupun rumput agar meningkatkan akurasi dengan fairway halang rintang, dan dilakukan dari arah samping kanan dengan ketentuan jarak bola ke arah halang 1 meter seperti di atas dan posisi bola ke gate (posisi bidikan miring kanan) seperti contoh pada gambar.");
        values.put("image",R.drawable.variasi10);
        values.put("icon", R.drawable.var10);
        db.insert("variasi","_id",values);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS variasi");
        onCreate(db);
    }
}
