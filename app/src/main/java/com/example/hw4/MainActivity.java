package com.example.hw4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    int random = 0;
    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.button);
        iv = findViewById(R.id.imageView);
    }

    public void image(View view)
    {
        random = (int)(Math.random() * 3) + 1;
        btn.setText("number: "+random);
        if(random == 1)
        {
            iv.setImageResource(R.drawable.num1);
        }
        else if(random == 2)
        {
            iv.setImageResource(R.drawable.num2);
        }
        else
        {
            iv.setImageResource(R.drawable.num3);
        }
    }
}