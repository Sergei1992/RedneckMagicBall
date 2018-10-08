package com.sergei.s.ershov.redneckmagicball;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView img;
    Button btn;
    Random rng = new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Toast Example
        Toast toast = Toast.makeText(this,
                "Wats up Redneck!", Toast.LENGTH_LONG);
        toast.show();

       final Animation fade = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);

        img = (ImageView) findViewById(R.id.myImage);
        btn = (Button) findViewById(R.id.myButton);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int randomNumber = rng.nextInt(8) + 1;

                switch (randomNumber) {
                    case 1:
                        img.setImageResource(R.drawable.healno);
                        img.startAnimation(fade);
                        break;

                    case 2:
                        img.setImageResource(R.drawable.healyes);
                        img.startAnimation(fade);
                        break;

                    case 3:
                        img.setImageResource(R.drawable.dont);
                        img.startAnimation(fade);
                        break;

                    case 4:
                        img.setImageResource(R.drawable.tryit);
                        img.startAnimation(fade);
                        break;

                    case 5:
                        img.setImageResource(R.drawable.wut);
                        img.startAnimation(fade);
                        break;

                    case 6:
                        img.setImageResource(R.drawable.doubit);
                        img.startAnimation(fade);
                        break;

                    case 7:
                        img.setImageResource(R.drawable.drunk);
                        img.startAnimation(fade);
                        break;

                    case 8:
                        img.setImageResource(R.drawable.pussy);
                        img.startAnimation(fade);
                        break;

                }
            }
        });

    }
}
