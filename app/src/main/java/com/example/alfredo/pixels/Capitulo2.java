package com.example.alfredo.pixels;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class Capitulo2 extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener,YouTubePlayer.PlaybackEventListener {

    String claveYoutube="AIzaSyBZPqpCDLXqRtxrScPATpjtLBxqCO2ycps";
    YouTubePlayerView youTubePlayerView;
    TextView txtV, txtv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capitulo2);

        //Cambia la fuente del texto
        txtV=(TextView)findViewById(R.id.titulo);
        Typeface face= Typeface.createFromAsset(getAssets(),"fonts/fuente2.ttf");
        txtV.setTypeface(face);

        txtv2=(TextView)findViewById(R.id.txt2);
        Typeface sinopsis= Typeface.createFromAsset(getAssets(),"fonts/fuente3.ttf");
        txtv2.setTypeface(sinopsis);

        youTubePlayerView=(YouTubePlayerView)findViewById(R.id.youtube_view);
        youTubePlayerView.initialize(claveYoutube,this);

    }
    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean fueRestaurado) {
        if (!fueRestaurado){
            youTubePlayer.cueVideo("yYdX0J0efHM"); //id del video https://youtu.be/yYdX0J0efHM"
        }
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
        if(youTubeInitializationResult.isUserRecoverableError()){
            youTubeInitializationResult.getErrorDialog(this,1).show();
        }else{
            String error = "Error al inicializar Youtube"+youTubeInitializationResult.toString();

            Toast.makeText(getApplication(),error,Toast.LENGTH_LONG).show();
        }

    }public void onActivityResult(int requestCode,int resultcode, Intent data){

        if (resultcode == 1){
            getYoutubePlayerProvider().initialize(claveYoutube,this);
        }
    }

    protected YouTubePlayer.Provider getYoutubePlayerProvider(){
        return youTubePlayerView;
    }

    @Override
    public void onPlaying() {

    }

    @Override
    public void onPaused() {

    }

    @Override
    public void onStopped() {

    }

    @Override
    public void onBuffering(boolean b) {

    }

    @Override
    public void onSeekTo(int i) {

    }
}
