package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int totalScoreA = 0;
    int totalScoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void resetScore(View view) {
        totalScoreA = 0;
        totalScoreB = 0;
        displayForTeamA(totalScoreA);
        displayForTeamB(totalScoreB);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(totalScoreA));
    }

    public void addThreeToTeamA(View view) {
        totalScoreA += 3;
        displayForTeamA(totalScoreA);


    }

    public void addTwoToTeamA(View view) {
        totalScoreA += 2;
        displayForTeamA(totalScoreA);
    }

    public void addOneToTeamA(View view) {
        totalScoreA++;
        displayForTeamA(totalScoreA);
    }


    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(totalScoreB));
    }

    public void addThreeToTeamB(View view) {
        totalScoreB += 3;
        displayForTeamB(3);


    }

    public void addTwoToTeamB(View view) {
        totalScoreB += 2;
        displayForTeamB(totalScoreB);
    }

    public void addOneToTeamB(View view) {
        totalScoreB++;
        displayForTeamB(totalScoreB);
    }


}
