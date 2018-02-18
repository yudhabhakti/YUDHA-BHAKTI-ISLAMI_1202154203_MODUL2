package com.example.asus.yudhabhaktiislami_1202154203_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Home extends AppCompatActivity {
    RadioGroup ragr; //deklarasi variable

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ragr = findViewById(R.id.ragr); //mengambil data dari home.xml berdasarkan id
    }
    // command dibawah adalah digunakan untuk memilih berupa radio button
    public void masukmenu(View view) {
        int id = ragr.getCheckedRadioButtonId();
        RadioButton rb = findViewById(id);
        String pilih = rb.getText().toString();
        switch (pilih) {
            case "Take Away":
                startActivity(new Intent(Home.this, TakeAway.class));
                Toast.makeText(Home.this, "Take Away", Toast.LENGTH_SHORT).show();
                break;
            case "Dine In":
                startActivity(new Intent(Home.this, DineIn.class));
                Toast.makeText(Home.this, "Dine In", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}