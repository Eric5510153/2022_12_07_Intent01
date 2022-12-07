


package com.example.intent01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_Two extends AppCompatActivity {
    Button buttonStarActivity_1, buttonStarActivity_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        buttonStarActivity_1=findViewById(R.id.buttonStartActivity_1);
        buttonStarActivity_2=findViewById(R.id.buttonStartActivity_2);

        buttonStarActivity_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            finish();
            }
        });






        buttonStarActivity_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Activity_Two.this,Activity_Three.class);
                startActivity(i);



            }
        });



    }
}