package example.android.udacitychallenge2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


        /*  Initial Score of Team A and Team B */
        int scoreTeamA = 0;
        int scoreTeamB = 0;
        /*  Initial Fouls of Team A and Team B */
        int foulsTeamA = 0;
        int foulsTeamB = 0;
        /* Initial  Violations of Team A and Team B */
        int violationsTeamA = 0;
        int violationsTeamB = 0;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }

        @Override
        protected void onSaveInstanceState(Bundle outState) {
            super.onSaveInstanceState(outState);
            outState.putInt("KEY_state_scoreTeamA", scoreTeamA);
            outState.putInt("KEY_state_scoreTeamB", scoreTeamB);
            outState.putInt("KEY_state_foulsTeamA", foulsTeamA);
            outState.putInt("KEY_state_foulsTeamB", foulsTeamB);
            outState.putInt("KEY_state_violationsTeamA", violationsTeamA);
            outState.putInt("KEY_state_violationsTeamB", violationsTeamB);
        }

        @Override
        protected void onRestoreInstanceState(Bundle savedInstanceState) {
            super.onRestoreInstanceState(savedInstanceState);
            scoreTeamA = savedInstanceState.getInt("KEY_state_scoreTeamA");
            scoreTeamB = savedInstanceState.getInt("KEY_state_scoreTeamB");
            foulsTeamA = savedInstanceState.getInt("KEY_state_foulsTeamA");
            foulsTeamB = savedInstanceState.getInt("KEY_state_foulsTeamB");
            violationsTeamA = savedInstanceState.getInt("KEY_state_violationsTeamA");
            violationsTeamB = savedInstanceState.getInt("KEY_state_violationsTeamB");
            displayPointTeamA(scoreTeamA);
            displayForTeamB(scoreTeamB);
            displayFoulsForTeamA(foulsTeamA);
            displayFoulsForTeamB(foulsTeamB);
            displayViolationsForTeamA(violationsTeamA);
            displayViolationsForTeamB(violationsTeamB);
        }

        /**
         * Displaying the score for Team A.
         */
        public void displayPointTeamA(int score) {
            TextView scoreView = (TextView) findViewById(R.id.team_a_score);
            scoreView.setText(String.valueOf(score));
        }

        /*
         * Increasing the score for team A by 3 points
         */
        public void addThreeForTeamA(View view){
            scoreTeamA = scoreTeamA + 3;
            displayPointTeamA(scoreTeamA);
        }

        /*
         *Increase the score for team A by 2 points
         */
        public void addTwoForTeamA(View view){
            scoreTeamA = scoreTeamA + 2;
            displayPointTeamA(scoreTeamA);
        }

        /*
         *Increase the score for team A by 1 point
         */
        public void addOneForTeamA(View view){
            scoreTeamA = scoreTeamA + 1;
            displayPointTeamA(scoreTeamA);
        }

        /**
         * Displays the given score for Team B.
         */
        public void displayForTeamB(int score) {
            TextView scoreView = (TextView) findViewById(R.id.team_b_score);
            scoreView.setText(String.valueOf(score));
        }


        /*
         *Increase the score for team B by 3 points
         */
        public void addThreeForTeamB(View view){
            scoreTeamB = scoreTeamB + 3;
            displayForTeamB(scoreTeamB);
        }

        /*
         *Increase the score for team B by 2 points
         */
        public void addTwoForTeamB(View view){
            scoreTeamB = scoreTeamB + 2;
            displayForTeamB(scoreTeamB);
        }

        /*
         *Increase the score for team B by 1 points
         */
        public void addOneForTeamB(View view){
            scoreTeamB = scoreTeamB + 1;
            displayForTeamB(scoreTeamB);
        }

        /**
         * Displays the foul for Team A.
         */
        public void displayFoulsForTeamA(int score) {
            TextView scoreView = (TextView) findViewById(R.id.team_a_fouls);
            scoreView.setText(String.valueOf(score));
        }

        /*
         *Increase the foul for team A by 1 points
         */
        public void addFoulsForTeamA(View view){
            foulsTeamA = foulsTeamA + 1;
            displayFoulsForTeamA(foulsTeamA);
        }

        /**
         * Displays the violation for Team A.
         */
        public void displayViolationsForTeamA(int score) {
            TextView scoreView = (TextView) findViewById(R.id.team_a_violations);
            scoreView.setText(String.valueOf(score));
        }

        /*
         *Increase the violation for team A by 1 points
         */
        public void addViolationsForTeamA(View view){
            violationsTeamA = violationsTeamA + 1;
            displayViolationsForTeamA(violationsTeamA);
        }

        /**
         * Displays the foul for Team B.
         */
        public void displayFoulsForTeamB(int score) {
            TextView scoreView = (TextView) findViewById(R.id.team_b_fouls);
            scoreView.setText(String.valueOf(score));
        }

        /*
         *Increase the foul for team B by 1 points
         */
        public void addFoulsForTeamB(View view){
            foulsTeamB = foulsTeamB + 1;
            displayFoulsForTeamB(foulsTeamB);
        }

        /**
         * Displays the violation for Team B.
         */
        public void displayViolationsForTeamB(int score) {
            TextView scoreView = (TextView) findViewById(R.id.team_b_violations);
            scoreView.setText(String.valueOf(score));
        }

        /*
         *Increase the violation for team B by 1 points
         */
        public void addViolationsForTeamB(View view){
            violationsTeamB = violationsTeamB + 1;
            displayViolationsForTeamB(violationsTeamB);
        }

        /*
         *Reset and display scores, fouls amd violations for team A and team B
         */
        public void resetScores(View view){
            scoreTeamA = 0;
            displayPointTeamA(scoreTeamA);
            scoreTeamB = 0;
            displayForTeamB(scoreTeamB);
            foulsTeamA = 0;
            displayFoulsForTeamA(foulsTeamA);
            violationsTeamA = 0;
            displayViolationsForTeamA(violationsTeamA);
            foulsTeamB = 0;
            displayFoulsForTeamB(foulsTeamB);
            violationsTeamB = 0;
            displayViolationsForTeamB(violationsTeamB);
        }
    }
