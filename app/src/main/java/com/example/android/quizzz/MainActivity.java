package com.example.android.quizzz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView question1;
    RadioButton answer1a;
    RadioButton answer1b;
    RadioButton answer1c;
    RadioButton answer1d;
    TextView question2;
    RadioButton answer2a;
    RadioButton answer2b;
    RadioButton answer2c;
    RadioButton answer2d;
    TextView question3;
    RadioButton answer3a;
    RadioButton answer3b;
    RadioButton answer3c;
    RadioButton answer3d;
    TextView question4;
    RadioButton answer4a;
    RadioButton answer4b;
    RadioButton answer4c;
    RadioButton answer4d;
    TextView question5;
    RadioButton answer5a;
    RadioButton answer5b;
    RadioButton answer5c;
    RadioButton answer5d;
    TextView question6;
    RadioButton answer6a;
    RadioButton answer6b;
    RadioButton answer6c;
    RadioButton answer6d;
    private int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.count = 0;
        findElements();
        assignQuestions();
    }

    public void submitAnswers() {
        calculateScore();
        Toast.makeText(this, "You got " + this.count + " answers correct out of 6!", Toast.LENGTH_LONG).show();
    }

    public void calculateScore() {
        if (answer1c.isChecked())
            count++;
        if (answer2c.isChecked())
            count++;
        if (answer3a.isChecked())
            count++;
        if (answer4c.isChecked())
            count++;
        if (answer5a.isChecked())
            count++;
        if (answer6a.isChecked())
            count++;
    }

    public void assignQuestions() {
        question1.setText("1. There are five birds sitting on electric wire. Two were shot and killed by a hunter. How many are left?");
        answer1a.setText("3 birds");
        answer1b.setText("0 birds");
        answer1c.setText("2 birds"); // correct
        answer1d.setText("5 birds");
        question2.setText("2. There is a big turtle. It is walking with a little turtle. The little turtle is the big turtle's son but the big turtle isn't the dad. who is the big turtle?");
        answer2a.setText("A stranger");
        answer2b.setText("His step dad");
        answer2c.setText("The mom"); //
        answer2d.setText("Step mom");
        question3.setText("3. What's 1+2+3+4+5+6+.....+98+99+100?");
        answer3a.setText("5050"); //
        answer3b.setText("10100");
        answer3c.setText("12345678910");
        answer3d.setText("100");
        question4.setText("4. A guy is condemned to death. He has to choose a room.\n" +
                "room #1: A fiery inferno\n" +
                "room #2: 30 assassins with loaded guns.\n" +
                "room #3: A room full of hungry lions that didn't eat in 3 months.\n" +
                "Which room is the safest?");
        answer4a.setText("Room #2 because the assassins might not shoot you.");
        answer4b.setText("Room #1 because you think so");
        answer4c.setText("Room #3 because the lions would be dead if it didn't eat in 3 months");   //
        answer4d.setText("None");
        question5.setText("5. Jim's peacock laid an egg on Bobby's lawn. Who's egg is it?");
        answer5a.setText("Nobody");    //
        answer5b.setText("Bobby's because its on his lawn");
        answer5c.setText("The Peacocks because it was the one who laid the egg");
        answer5d.setText("Jim's because its Jim's peacock");
        question6.setText("6. A magician said if anybody can be under water for 10 minutes, he'll give them $100,000. A young boy volunteered and won. How is that possible?");
        answer6a.setText("He got a cup of water and put it on his head so he is under water");  //
        answer6b.setText("He cheated and won");
        answer6c.setText("He went in a swimming pool and did it");
        answer6d.setText("He stole it");

    }

    public void findElements() {
        this.question1 = (TextView) findViewById(R.id.question1_textView);
        this.answer1a = (RadioButton) findViewById(R.id.answer1_a);
        this.answer1b = (RadioButton) findViewById(R.id.answer1_b);
        this.answer1c = (RadioButton) findViewById(R.id.answer1_c);
        this.answer1d = (RadioButton) findViewById(R.id.answer1_d);
        RadioGroup answer1 = new RadioGroup(getApplicationContext());
        answer1.addView(answer1a);
        answer1.addView(answer1b);
        answer1.addView(answer1c);
        answer1.addView(answer1d);
        this.question2 = (TextView) findViewById(R.id.question2_textView);
        this.answer2a = (RadioButton) findViewById(R.id.answer2_a);
        this.answer2b = (RadioButton) findViewById(R.id.answer2_b);
        this.answer2c = (RadioButton) findViewById(R.id.answer2_c);
        this.answer2d = (RadioButton) findViewById(R.id.answer2_d);
        RadioGroup answer2 = new RadioGroup(getApplicationContext());
        answer2.addView(answer2a);
        answer2.addView(answer2b);
        answer2.addView(answer2c);
        answer2.addView(answer2d);
        this.question3 = (TextView) findViewById(R.id.question3_textView);
        this.answer3a = (RadioButton) findViewById(R.id.answer3_a);
        this.answer3b = (RadioButton) findViewById(R.id.answer3_b);
        this.answer3c = (RadioButton) findViewById(R.id.answer3_c);
        this.answer3d = (RadioButton) findViewById(R.id.answer3_d);
        RadioGroup answer3 = new RadioGroup(getApplicationContext());
        answer3.addView(answer3a);
        answer3.addView(answer3b);
        answer3.addView(answer3c);
        answer3.addView(answer3d);
        this.question4 = (TextView) findViewById(R.id.question4_textView);
        this.answer4a = (RadioButton) findViewById(R.id.answer4_a);
        this.answer4b = (RadioButton) findViewById(R.id.answer4_b);
        this.answer4c = (RadioButton) findViewById(R.id.answer4_c);
        this.answer4d = (RadioButton) findViewById(R.id.answer4_d);
        RadioGroup answer4 = new RadioGroup(getApplicationContext());
        answer4.addView(answer4a);
        answer4.addView(answer4b);
        answer4.addView(answer4c);
        answer4.addView(answer4d);
        this.question5 = (TextView) findViewById(R.id.question5_textView);
        this.answer5a = (RadioButton) findViewById(R.id.answer5_a);
        this.answer5b = (RadioButton) findViewById(R.id.answer5_b);
        this.answer5c = (RadioButton) findViewById(R.id.answer5_c);
        this.answer5d = (RadioButton) findViewById(R.id.answer5_d);
        RadioGroup answer5 = new RadioGroup(getApplicationContext());
        answer5.addView(answer5a);
        answer5.addView(answer5b);
        answer5.addView(answer5c);
        answer5.addView(answer5d);
        this.question6 = (TextView) findViewById(R.id.question6_textView);
        this.answer6a = (RadioButton) findViewById(R.id.answer6_a);
        this.answer6b = (RadioButton) findViewById(R.id.answer6_b);
        this.answer6c = (RadioButton) findViewById(R.id.answer6_c);
        this.answer6d = (RadioButton) findViewById(R.id.answer6_d);
        RadioGroup answer6 = new RadioGroup(getApplicationContext());
        answer6.addView(answer6a);
        answer6.addView(answer6b);
        answer6.addView(answer6c);
        answer6.addView(answer6d);
    }
}
