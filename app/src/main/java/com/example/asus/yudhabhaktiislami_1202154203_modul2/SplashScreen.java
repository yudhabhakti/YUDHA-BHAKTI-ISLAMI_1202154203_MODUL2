package com.example.asus.yudhabhaktiislami_1202154203_modul2;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

public class SplashScreen extends AppCompatActivity {

    private static int splashInterval = 3000; //Ini berfungsi untuk lamanya kita menunggu displash screen

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN); //Membuat layar menjadi fullscreen
        setContentView(R.layout.activity_splash_screen);

        //Command dibawah berfungsi untuk menjadwalkan pesan yg ditampilkan
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this, Home.class);
                startActivity(intent); // untuk pindah ke aktivity berikutnya

                Toast.makeText(SplashScreen.this, "YUDHA BHAKTI ISLAMI_1202154203", Toast.LENGTH_LONG).show();
                this.finish(); //untuk menampilkan tulisan seperti message
            }

            private void finish() {

            }
        }, splashInterval);
    }
}