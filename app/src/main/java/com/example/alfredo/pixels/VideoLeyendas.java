package com.example.alfredo.pixels;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class VideoLeyendas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_leyendas);
    }

    public void capitulo(View view) {
        Intent intent = new Intent(VideoLeyendas.this,Capitulo1.class);
        startActivity(intent);
    }

    public void capitulo2(View view) {
        Intent intent = new Intent(VideoLeyendas.this,Capitulo2.class);
        startActivity(intent);
    }

    public void capitulo3(View view) {
        Intent intent = new Intent(VideoLeyendas.this,Capitulo3.class);
        startActivity(intent);
    }
}
