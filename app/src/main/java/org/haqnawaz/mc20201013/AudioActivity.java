package org.haqnawaz.mc20201013;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class AudioActivity extends AppCompatActivity {

    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio);

        mp = MediaPlayer.create(this, R.raw.audio);


    }

    public void PlayMedia (View view){

        mp.start();

    }

    public void StopMedia (View view){
        mp.pause();
    }
}
