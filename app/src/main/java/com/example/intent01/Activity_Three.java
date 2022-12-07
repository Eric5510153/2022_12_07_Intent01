


package com.example.intent01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Activity_Three extends AppCompatActivity {
    Button buttonStarActivity_1,buttonStarActivity_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
        buttonStarActivity_2=findViewById(R.id.buttonStartActivity_2);
        buttonStarActivity_1=findViewById(R.id.buttonStartActivity_1);

        buttonStarActivity_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


        buttonStarActivity_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Activity_Three.this,Activity_Two.class);
                startActivity(i);



            }
        });






    }
}