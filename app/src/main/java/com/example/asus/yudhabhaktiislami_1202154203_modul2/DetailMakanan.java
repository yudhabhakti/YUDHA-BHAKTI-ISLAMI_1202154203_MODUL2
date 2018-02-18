package com.example.asus.yudhabhaktiislami_1202154203_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailMakanan extends AppCompatActivity {

    ImageView foto; //Deklarasi nama imageView
    TextView nama, harga, komposisi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_makanan);
        setTitle("Detail Menu"); //Judul pada laman
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); //untuk menambakan action bar

        //mengambil pada xml menurut id
        foto = findViewById(R.id.gambarr);
        nama = findViewById(R.id.detailnama);
        komposisi = findViewById(R.id.detailkomposisi);
        harga = findViewById(R.id.detailharga);

        //Menerima dan menampilkan data yang dipilih
        harga.setText(getIntent().getStringExtra("harga"));
        komposisi.setText(getIntent().getStringExtra("komposisi"));
        nama.setText(getIntent().getStringExtra("nama"));
        foto.setImageDrawable(this.getResources().getDrawable(Integer.valueOf(getIntent().getStringExtra("foto"))));
    }
}