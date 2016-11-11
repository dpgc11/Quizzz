package com.example.android.quizzz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    Map<String, String> questions;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.questions = new HashMap<>();
        this.question1 = (TextView) findViewById(R.id.question1_textView);
        this.answer1a = (RadioButton) findViewById(R.id.answer1_a);
        this.answer1b = (RadioButton) findViewById(R.id.answer1_b);
        this.answer1c = (RadioButton) findViewById(R.id.answer1_c);
        this.answer1d = (RadioButton) findViewById(R.id.answer1_d);
        this.question2 = (TextView) findViewById(R.id.question2_textView);
        this.answer2a = (RadioButton) findViewById(R.id.answer2_a);
        this.answer2b = (RadioButton) findViewById(R.id.answer2_b);
        this.answer2c = (RadioButton) findViewById(R.id.answer2_c);
        this.answer2d = (RadioButton) findViewById(R.id.answer2_d);
        this.question3 = (TextView) findViewById(R.id.question3_textView);
        this.answer3a = (RadioButton) findViewById(R.id.answer3_a);
        this.answer3b = (RadioButton) findViewById(R.id.answer3_b);
        this.answer3c = (RadioButton) findViewById(R.id.answer3_c);
        this.answer3d = (RadioButton) findViewById(R.id.answer3_d);
        this.question4 = (TextView) findViewById(R.id.question4_textView);
        this.answer4a = (RadioButton) findViewById(R.id.answer4_a);
        this.answer4b = (RadioButton) findViewById(R.id.answer4_b);
        this.answer4c = (RadioButton) findViewById(R.id.answer4_c);
        this.answer4d = (RadioButton) findViewById(R.id.answer4_d);
        this.question5 = (TextView) findViewById(R.id.question5_textView);
        this.answer5a = (RadioButton) findViewById(R.id.answer5_a);
        this.answer5b = (RadioButton) findViewById(R.id.answer5_b);
        this.answer5c = (RadioButton) findViewById(R.id.answer5_c);
        this.answer5d = (RadioButton) findViewById(R.id.answer5_d);
        this.question6 = (TextView) findViewById(R.id.question6_textView);
        this.answer6a = (RadioButton) findViewById(R.id.answer6_a);
        this.answer6b = (RadioButton) findViewById(R.id.answer6_b);
        this.answer6c = (RadioButton) findViewById(R.id.answer6_c);
        this.answer6d = (RadioButton) findViewById(R.id.answer6_d);
    }

    public void addQuestion(String question, String answer) {
        if (!this.questions.containsKey(question)) {
            this.questions.put(question, answer);
        }
    }

    public boolean getAnswer(String question, String answer) {
        boolean flag = false;

        if (this.questions.containsKey(question)) {
            for (String q : this.questions.keySet()) {
                if (this.questions.get(q).equalsIgnoreCase(answer)) {
                    flag = true;
                } else {
                    flag = false;
                }
            }
        }

        return flag;
    }

    public void answer(View view) {

    }
}
