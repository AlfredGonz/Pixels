package com.example.alfredo.pixels;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class Conocenos extends AppCompatActivity {

    ViewFlipper slide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conocenos);

        int images[]=
                {
                    R.drawable.slide1, R.drawable.slide2,
                    R.drawable.slide3, R.drawable.slide4,
                    R.drawable.slide5,R.drawable.slide6,
                    R.drawable.slide7,R.drawable.slide8,
                    R.drawable.slide9,R.drawable.slide10
                };
        slide = findViewById(R.id.slide);

     /*   for (int i=0; i<images.length;i++)
        {
            flipperImagenes(images[i]);
        }*/
        //for each
     for(int imagen : images)
     {
         flipperImagenes(imagen);
     }
    //------------------------------------------------------------------------
    }
    //------------------------------------------------------------------------

    public void flipperImagenes(int imagen)
    {
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(imagen);

        slide.addView(imageView);
        slide.setFlipInterval(3000); //3 segundos
        slide.setAutoStart(true);

        //animacion
        slide.setInAnimation(this,android.R.anim.slide_in_left);
        slide.setOutAnimation(this,android.R.anim.slide_out_right);
    }

//-----------------------------------------------------------------------------------------//
    //OnClick redes sociales
    public void facebook(View view) {
        Uri uri = Uri.parse("https://www.facebook.com/leyendas.mesoamericanas.1");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void twitter(View view) {
        Uri uri = Uri.parse("https://twitter.com/mesoamericanas?lang=es");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void instagram(View view) {
        Uri uri = Uri.parse("https://www.instagram.com/leyendasmesoamericanases/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void technosal(View view) {
        Uri uri = Uri.parse("http://www.technosal.com");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}
