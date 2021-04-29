package com.example.latihan2_akb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class halaman_send_verify extends AppCompatActivity {

    //Identitas diri
    //Nama               : Agus Awaludin
    //Kelas              : IF-2
    //Nim                : 10118067
    //Tanggal Pengerjaan : 26 April 2020

    public void pindah4(View view){

        Intent intent = new Intent(this, halaman_Identitas.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halaman_send_verify);

        Intent intent = getIntent();
    }
}