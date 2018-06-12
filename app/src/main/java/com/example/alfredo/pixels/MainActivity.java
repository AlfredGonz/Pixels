package com.example.alfredo.pixels;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.gigamole.infinitecycleviewpager.HorizontalInfiniteCycleViewPager;

import java.util.ArrayList;
import java.util.List;



public class MainActivity extends AppCompatActivity {

    Button leyendas, personajes, conocenos;

    List<Integer> lstImages = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();

        HorizontalInfiniteCycleViewPager pager = (HorizontalInfiniteCycleViewPager)findViewById(R.id.horizontalcycle);
        MyAdapter adapter = new MyAdapter(lstImages,getBaseContext());
        pager.setAdapter(adapter);

    }

    private void initData() {
        lstImages.add(R.drawable.proximamente);
        lstImages.add(R.drawable.leyendaspng);
        lstImages.add(R.drawable.cuartopng);
        //lstImages.add(R.drawable.pueblopng);
    }


    //onClick
    public void Leyendas(View v) {

        Intent intent = new Intent(MainActivity.this,VideoLeyendas.class);
        startActivity(intent);

    }

    public void Personajes(View v){
        Intent intent = new Intent(MainActivity.this,Personajes.class);
        startActivity(intent);
    }

    public void Conocenos(View v){
        Intent intent = new Intent(MainActivity.this,Conocenos.class);
        startActivity(intent);
    }

}
