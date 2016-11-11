package com.example.android.quizzz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    Map<String, String> questions;
    TextView question;
    Button answer1;
    Button answer2;
    Button answer3;
    Button answer4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.questions = new HashMap<>();
        this.question = (TextView) findViewById(R.id.questions_textView);
        this.answer1 = (Button) findViewById(R.id.answer1_button);
        this.answer2 = (Button) findViewById(R.id.answer2_button);
        this.answer3 = (Button) findViewById(R.id.answer3_button);
        this.answer4 = (Button) findViewById(R.id.answer4_button);
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
