package com.example.asus.yudhabhaktiislami_1202154203_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ListMenu extends AppCompatActivity {

    RecyclerView rv; //Deklarasi nama RecyclerView
    mnAdapter adapter; //Deklarasi nama mnAdapter
    List<pilihMenu> listmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_menu);
        setTitle("Menu");

        //untuk meneg INIT recyclerview dan adapternya
        listmenu = new ArrayList<>();
        rv = findViewById(R.id.listMenu);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this));
        initdata();
    }

    //command dibawah untuk mengambil dan memasukkan gambar
    private void initdata() {
        listmenu.add(new pilihMenu(R.drawable.telurgulung, "Telur Gulung ", 10000, "Telur, Bumbu, Kecap, Keju"));
        listmenu.add(new pilihMenu(R.drawable.tempebro, "Tempe enak", 4000, "kedelai, tepung, keju dan saos"));
        listmenu.add(new pilihMenu(R.drawable.cilok, "Cilok enak lo", 10000, "Tepung, Tepung lagi, bumbu"));
        listmenu.add(new pilihMenu(R.drawable.mielidi, "Mie lidi hot", 15000, "Mie lidi - lidian dan bumbu penyedap"));
        listmenu.add(new pilihMenu(R.drawable.nasikuning, "Nasi Kuning berkah", 20000, "Nasi, kuning, telur, ayam, sayuran"));
        adapter = new mnAdapter(this, listmenu);
        rv.setAdapter(adapter);
    }
}