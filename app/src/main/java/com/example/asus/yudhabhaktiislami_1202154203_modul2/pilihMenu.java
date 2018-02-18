package com.example.asus.yudhabhaktiislami_1202154203_modul2;

/**
 * Created by ASUS on 18/02/2018.
 */

    //Mendeklarasikan variable
public class pilihMenu {
    int foto;
    String nama;
    int harga;
    String komposisi;

    //untuk mengambil nilai yang sudah dideklarasikan
    public pilihMenu(int foto, String nama, int harga, String komposisi) {
        this.foto = foto;
        this.nama = nama;
        this.harga = harga;
        this.komposisi = komposisi;
    }

    //mendefinisikan identifier masing2 variable
    public int getFoto() {
        return foto;
    }
    public String getNama() {
        return nama;
    }
    public int getHarga() {
        return harga;
    }
    public String getKomposisi() {
        return komposisi;
    }
}
