package com.example.unite7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;

import com.example.unite7.Uyg3.Uyg3;

import java.sql.SQLData;

public class MainActivity extends AppCompatActivity {

    SQLiteDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createDB();
    }

    private void createDB() {
        database = openOrCreateDatabase("Urun", MODE_PRIVATE, null);

        String TABLO = "CREATE TABLE IF NOT EXISTS urunler(id INT PRIMARY KEY, urunadi TEXT, fiyat DOUBLE, adet INTEGER)";
        database.execSQL(TABLO);
    }

    public void uyg1Goster(View view) {
        Intent i = new Intent(MainActivity.this, Uyg1.class);
        startActivity(i);
    }

    public void uyg2Goster(View view) {
        Intent i = new Intent(MainActivity.this, Uyg2.class);
        startActivity(i);
    }

    public void uyg3Goster(View view) {
        Intent i = new Intent(MainActivity.this, Uyg3.class);
        startActivity(i);




    }
}