package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_2 extends AppCompatActivity {

    /*
    Declaring variables
     */
    Button btnAct2Start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        /*
        Extracting the id of the components
         */

        btnAct2Start = findViewById(R.id.btnAct2Start);

        btnAct2Start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity_2.this, com.example.courtcounter.Activity3.class);
                startActivity(intent);
            }
        });
    }
}