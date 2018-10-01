package com.sergei.s.ershov.redneckmagicball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView txt;
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

        txt = (TextView) findViewById(R.id.myText);
        btn = (Button) findViewById(R.id.myButton);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int randomNumber = rng.nextInt(8) + 1;

                switch (randomNumber) {
                    case 1:
                        txt.setText("Heal No");
                        break;

                    case 2:
                        txt.setText("Heal Yes");
                        break;

                    case 3:
                        txt.setText("I tell you what, don`t");
                        break;

                    case 4:
                        txt.setText("Just tri it");
                        break;

                    case 5:
                        txt.setText("Wut?");
                        break;

                    case 6:
                        txt.setText("I doubt it");
                        break;

                    case 7:
                        txt.setText("Imma alredy drunk");
                        break;

                    case 8:
                        txt.setText("Don`t be a pussy");
                        break;

                }
            }
        });

    }
}
