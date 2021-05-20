package com.example.courtcounter;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.courtcounter.R;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int backupA=scoreTeamA;
    int backupB=scoreTeamB;

    /*
    declaring the components variables
     */
    TextView tvTeamAName, tvTeamBName;
    Button declareWinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        Extracting the id of the component variables
         */
        tvTeamAName = findViewById(R.id.tvTeamAName);
        tvTeamBName = findViewById(R.id.tvTeamBName);
        declareWinner = findViewById(R.id.declareWinnerButton);

        String TeamAName = getIntent().getStringExtra("TeamAName");
        String TeamBName = getIntent().getStringExtra("TeamBName");

        tvTeamBName.setText(TeamBName);
        tvTeamAName.setText(TeamAName);

        declareWinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String winner;
                if (scoreTeamA > scoreTeamB){
                    winner = TeamAName;
                }else if (scoreTeamA < scoreTeamB){
                    winner = TeamBName;
                }else{
                    winner = "Both";
                }

                Intent intent = new Intent(MainActivity.this, com.example.courtcounter.Activity4.class);
                intent.putExtra("WinningTeamName", winner);
                startActivity(intent);
            }
        });


    }

    /** undo last team A*/
    public void undoA(View v)
    {
        scoreTeamA=backupA;
        displayForTeamA(scoreTeamA);
    }

//    Undo last for B
    /** undo last team A*/
    public void undoB(View v)
    {
        scoreTeamB=backupB;
        displayForTeamB(scoreTeamB);
    }

//    minus one A
    public void minusOneA(View v)
    {
        if(scoreTeamA>0) scoreTeamA-=1;
        displayForTeamA(scoreTeamA);
    }

//    minus 1   B
public void minusOneb(View v)
{
    if(scoreTeamB>0) scoreTeamB-=1;
    displayForTeamB(scoreTeamB);
}

//

    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamA(View v) {
        backupA=scoreTeamA;
        scoreTeamA += 1;

        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    public void addTwoForTeamA(View v) {
        backupA=scoreTeamA;
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    public void addThreeForTeamA(View v) {
        backupA=scoreTeamA;
        scoreTeamA += 3;

        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    public void addThreeForTeamB(View v) {
        backupB=scoreTeamB;
        scoreTeamB += 3;

        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    public void addTwoForTeamB(View v) {
        backupB=scoreTeamB;
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamB(View v) {
        backupB=scoreTeamB;
        scoreTeamB += 1;

        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void resetScores(View view)
    {
        scoreTeamA=0;
        scoreTeamB=0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /*
    Displaying the winning team name
     */

//    public void decalreWinner(int scoreTeamA, int scoreTeamB){
//
//        if (scoreTeamA> scoreTeamB){
//            displayForTeamA();
//        }
//    }


}