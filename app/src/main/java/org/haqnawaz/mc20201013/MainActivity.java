package org.haqnawaz.mc20201013;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Animation (View view)
    {
        ImageView imageView = findViewById(R.id.imageViewBat);

        //imageView.animate().alpha(0).setDuration(3000);

        //imageView.animate().translationYBy(-1000).setDuration(2000);

       // imageView.animate().rotation(720).setDuration(1000);

       // imageView.animate().rotation(720).alpha(0).setDuration(4000);

      //  imageView.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000);

        imageView.animate().rotation(720).scaleX(0.5f).scaleY(0.5f).setDuration(2000);



    }

}
