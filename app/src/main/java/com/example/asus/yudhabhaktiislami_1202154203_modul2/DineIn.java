package com.example.asus.yudhabhaktiislami_1202154203_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.Toast;

public class DineIn extends AppCompatActivity {

    Spinner nome; //deklarasi spinner yang di xml

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);
        setTitle("Dine In"); //Judul pada laman
        nome = findViewById(R.id.nomeja);//memanggil nama spinner
    }
    //command dibawah untuk menampilkan toast dan lanjut ke aktivity selanjutnya
    public void liatmenu(View view) {
        Toast.makeText(DineIn.this, nome.getSelectedItem().toString() + " dipilih", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(DineIn.this, ListMenu.class));
        finish();
    }
}