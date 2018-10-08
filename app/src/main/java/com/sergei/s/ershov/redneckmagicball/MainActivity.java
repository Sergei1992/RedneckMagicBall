package com.sergei.s.ershov.redneckmagicball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
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

        img = (ImageView) findViewById(R.id.myImage);
        btn = (Button) findViewById(R.id.myButton);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int randomNumber = rng.nextInt(8) + 1;

                switch (randomNumber) {
                    case 1:
                        img.setImageResource(R.drawable.healno);
                        break;

                    case 2:
                        img.setImageResource(R.drawable.healyes);
                        break;

                    case 3:
                        img.setImageResource(R.drawable.dont);
                        break;

                    case 4:
                        img.setImageResource(R.drawable.tryit);
                        break;

                    case 5:
                        img.setImageResource(R.drawable.wut);
                        break;

                    case 6:
                        img.setImageResource(R.drawable.doubit);
                        break;

                    case 7:
                        img.setImageResource(R.drawable.drunk);
                        break;

                    case 8:
                        img.setImageResource(R.drawable.pussy);
                        break;

                }
            }
        });

    }
}
