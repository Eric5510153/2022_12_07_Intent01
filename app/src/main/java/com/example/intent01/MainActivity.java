package com.example.intent01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
 Button buttonStarActivity_1,buttonStarActivity_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonStarActivity_1=findViewById(R.id.buttonStartActivity_1);
        buttonStarActivity_2=findViewById(R.id.buttonStartActivity_2);

        buttonStarActivity_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  i = new Intent(MainActivity.this,Activity_Two.class);
                startActivity(i);



            }
        });

        buttonStarActivity_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  i = new Intent(MainActivity.this,Activity_Three.class);

                startActivity(i);


            }
        });









    }
}