package com.example.latihan2_akb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class halaman_Identitas extends AppCompatActivity {

    //Identitas diri
    //Nama               : Agus Awaludin
    //Kelas              : IF-2
    //Nim                : 10118067
    //Tanggal Pengerjaan : 26 April 2020

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halaman__identitas);

        Intent intent = getIntent();

    }
}