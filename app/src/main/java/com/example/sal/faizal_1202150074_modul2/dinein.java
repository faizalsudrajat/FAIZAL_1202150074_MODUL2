package com.example.sal.faizal_1202150074_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dinein extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinein);


    }


    public void menu(View view) {
        Intent b = new Intent(dinein.this, menu.class); //untuk pindah dari activity detail ke activity menu
        startActivity(b); //start
    }
}
