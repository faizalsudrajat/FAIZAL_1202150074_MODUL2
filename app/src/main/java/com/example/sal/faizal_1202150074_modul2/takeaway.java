package com.example.sal.faizal_1202150074_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class takeaway extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_takeaway);

        Button button = (Button) findViewById(R.id.button); //untuk mendapatkan id button

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(takeaway.this, menu.class); // untuk pindah dari activity TakeAway ke activity menu
                startActivity(a);
            }
        });
    }
}
