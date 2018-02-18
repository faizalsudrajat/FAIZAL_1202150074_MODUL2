package com.example.sal.faizal_1202150074_modul2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class menu extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void detailnya (View view){
        Intent p = new Intent(menu.this, detail.class); // untuk bisa pindah ke activity detail dari activity menu
        startActivity(p);
    }
}
