package com.example.kumat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class MateriPerpangkatanActivity extends AppCompatActivity {
    VideoView mVideoView;
    MediaController mediaController;
    Button play1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi_perpangkatan);

        //Inisialisasi VideoView, MediaController dan Button
        mVideoView = findViewById(R.id.mVideoView);
        play1 = findViewById(R.id.play1);
        mediaController = new MediaController(this);

        //Menjalankan Video saat tombol Play di Klik
        play1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Variable Uri untuk menentukan lokasi Resource Video yang akan ditampilkan
                Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+ R.raw.penyajian_data);

                mVideoView.setVideoURI(uri);

                //Memasang MediaController untuk menampilkan tombol play, pause, dsb
                mVideoView.setMediaController(mediaController);
                mediaController.setAnchorView(mVideoView);

                //Menjalankan Video
                mVideoView.start();

                ImageView lefticon = findViewById(R.id.lefticon);
                TextView title = findViewById(R.id.toolbartitle);

                lefticon.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MateriPerpangkatanActivity.this, "You clicked in left icon", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }
    public void btnKembali(View view){
        Intent myIntent = new Intent(this, MateriKelas4Activity.class);
        startActivity(myIntent);
    }
}