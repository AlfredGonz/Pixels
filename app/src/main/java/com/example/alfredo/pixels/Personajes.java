package com.example.alfredo.pixels;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Personajes extends AppCompatActivity {

    Button button;
    Dialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personajes);

        dialog = new Dialog(this);

    }
        // Boton para cada personaje

    public void rosita(View view) {

        dialog.setContentView(R.layout.rosita);
        button = (Button)findViewById(R.id.buttonrosita);

        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();
    }

    public void jose(View view) {
        dialog.setContentView(R.layout.jose);
        button = (Button)findViewById(R.id.buttonjose);

        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();
    }

    public void donCatalino(View view) {
        dialog.setContentView(R.layout.don_catalino);
        button = (Button)findViewById(R.id.buttoncatalinoo);

        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();
    }

    public void profesor(View view) {
        dialog.setContentView(R.layout.profesor_guzman);
        button = (Button)findViewById(R.id.buttonprofguzman);

        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();
    }

    public void mirna(View view) {
        dialog.setContentView(R.layout.mirna);
        button = (Button)findViewById(R.id.buttonmirna);

        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();
    }

    public void bety(View view) {
        dialog.setContentView(R.layout.bety);
        button = (Button)findViewById(R.id.buttonbety);

        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();
    }
}
