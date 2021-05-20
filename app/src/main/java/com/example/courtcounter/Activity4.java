package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activity4 extends AppCompatActivity {

    /*
    Declare the variables
     */
    TextView tvWinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        /*
        extract the id
         */
        tvWinner = findViewById(R.id.tvWinner);

        String winnerName = getIntent().getStringExtra("WinningTeamName");

        if (winnerName == "Both"){
            tvWinner.setText("Congratulation to both the teams. It's a Tie.");
        }else{
            tvWinner.setText("Congratulation "+winnerName+ " for winning this game.");
        }

    }
}