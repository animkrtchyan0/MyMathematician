package com.example.mymathematicianproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddGeomQues extends AppCompatActivity {
    private EditText newQuestion;
    private EditText AddAnswer1;
    private EditText AddAnswer2;
    private EditText AddAnswer3;
    private EditText AddAnswer4;
    private EditText correctAns;
    private Button sendRequest;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_geom_ques);
        newQuestion = findViewById(R.id.newQuestion);
        AddAnswer1 = findViewById(R.id.myAns1);
        AddAnswer2 = findViewById(R.id.myAns2);
        AddAnswer3 = findViewById(R.id.myAns3);
        AddAnswer4 = findViewById(R.id.myAns4);
        correctAns = findViewById(R.id.myCorrectAns);
        sendRequest = findViewById(R.id.sendRequest);

        sendRequest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String question = newQuestion.getText().toString();
                String answer1 = AddAnswer1.getText().toString();
                String answer2 = AddAnswer2.getText().toString();
                String answer3 = AddAnswer3.getText().toString();
                String answer4 = AddAnswer4.getText().toString();
                String correct = correctAns.getText().toString();
                int correctNum = Integer.parseInt(correct);
                String category = "Geom";

                DataHolder.category = category;
                DataHolder.question = question;
                DataHolder.answer1 = answer1;
                DataHolder.answer2 = answer2;
                DataHolder.answer3 = answer3;
                DataHolder.answer4 = answer4;
                DataHolder.correctNum = correctNum;


            }
        });

    }
}