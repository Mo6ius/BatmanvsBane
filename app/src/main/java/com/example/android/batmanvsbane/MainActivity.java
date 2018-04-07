package com.example.android.batmanvsbane;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Track the score for Batman
    int scoreBatman = 0;

    // Track the score for Bane
    int scoreBane = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score for Batman by 3 points.
     */
    public void addThreeForBatman(View view) {
        scoreBatman += 3;
        displayForBatman(scoreBatman);
    }

    /**
     * Increase the score for Batman by 5 points.
     */
    public void addFiveForBatman(View view) {
        scoreBatman += 5;
        displayForBatman(scoreBatman);
    }

    /**
     * Increase the score for Batman by 2 points.
     */
    public void addTwoForBatman(View view) {
        scoreBatman += 2;
        displayForBatman(scoreBatman);
    }

    /**
     * Displays the given score for Batman.
     */
    public void displayForBatman(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamBatman);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Bane by 3 points.
     */
    public void addThreeForBane(View view) {
        scoreBane += 3;
        displayForBane(scoreBane);
    }

    /**
     * Increase the score for Bane by 5 points.
     */
    public void addFiveForBane(View view) {
        scoreBane += 5;
        displayForBane(scoreBane);
    }

    /**
     * Increase the score for Bane by 2 points.
     */
    public void addTwoForBane(View view) {
        scoreBane += 2;
        displayForBane(scoreBane);
    }

    /**
     * Displays the given score for Bane.
     */
    public void displayForBane(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamBane);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Resets the score for both teams back to 0.
     */
    public void resetScore(View view) {
        scoreBatman = 0;
        scoreBane = 0;
        displayForBatman(scoreBatman);
        displayForBane(scoreBane);
    }

}