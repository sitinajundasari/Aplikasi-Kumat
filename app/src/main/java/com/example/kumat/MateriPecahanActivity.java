package com.example.kumat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MateriPecahanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi_pecahan);
    }
    public void btnKembali(View view){
        Intent myIntent = new Intent(this, MateriKelas3Activity.class);
        startActivity(myIntent);
    }
}