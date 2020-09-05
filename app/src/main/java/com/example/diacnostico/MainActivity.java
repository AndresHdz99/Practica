package com.example.diacnostico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    ImageView imagenes;
    Button boton;
    Random ran;
    Integer[] img ={ R.drawable.image1, R.drawable.image2, R.drawable.image3,
            R.drawable.image4, R.drawable.image5, R.drawable.image6,
            R.drawable.image7, R.drawable.image8, R.drawable.image9,
            R.drawable.image10
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagenes =(ImageView)findViewById(R.id.imageC);
        boton= (Button)findViewById(R.id.buttonCambio);
        ran = new Random();
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imagenes.setImageResource(img[ran.nextInt(img.length)]);
            }
        });
    }
}
