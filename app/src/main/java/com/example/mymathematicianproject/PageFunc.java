package com.example.mymathematicianproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PageFunc extends AppCompatActivity {
    private TextView questionTextView;
    private Button answer1Button, answer2Button, answer3Button, answer4Button;
    private Button nextButton;
    private int score = 0;
    private  SQLiteDatabase db;
    private int questionNum = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_func);

        QuestionDbHelper databaseHelper = new QuestionDbHelper(this);
        db = databaseHelper.getReadableDatabase();


        questionTextView = findViewById(R.id.questionTextView);
        answer1Button = findViewById(R.id.answer1Button);
        answer2Button = findViewById(R.id.answer2Button);
        answer3Button = findViewById(R.id.answer3Button);
        answer4Button = findViewById(R.id.answer4Button);
        nextButton = findViewById(R.id.nextButton);

        loadQuestion();
    }

    @SuppressLint("Range")
    private void loadQuestion() {
        answer1Button.setBackgroundColor(Color.WHITE);
        answer2Button.setBackgroundColor(Color.WHITE);
        answer3Button.setBackgroundColor(Color.WHITE);
        answer4Button.setBackgroundColor(Color.WHITE);

        answer1Button.setEnabled(true);
        answer2Button.setEnabled(true);
        answer3Button.setEnabled(true);
        answer4Button.setEnabled(true);

        Cursor cursor = db.rawQuery("SELECT * FROM quizFunc ORDER BY RANDOM() LIMIT 1",null);
        if(cursor.moveToFirst()){
            String question = cursor.getString(cursor.getColumnIndex("question"));
            String answer1 = cursor.getString(cursor.getColumnIndex("answer1"));
            String answer2 = cursor.getString(cursor.getColumnIndex("answer2"));
            String answer3 = cursor.getString(cursor.getColumnIndex("answer3"));
            String answer4 = cursor.getString(cursor.getColumnIndex("answer4"));
            int correctAnswer = cursor.getInt(cursor.getColumnIndex("correct_answer"));

            questionTextView.setText(question);
            answer1Button.setText(answer1);
            answer2Button.setText(answer2);
            answer3Button.setText(answer3);
            answer4Button.setText(answer4);

            answer1Button.setOnClickListener(v -> checkAnswer(1, correctAnswer));
            answer2Button.setOnClickListener(v -> checkAnswer(2, correctAnswer));
            answer3Button.setOnClickListener(v -> checkAnswer(3, correctAnswer));
            answer4Button.setOnClickListener(v -> checkAnswer(4, correctAnswer));


            questionNum ++;
            if (questionNum < 8){
                nextButton.setText("Next");
                nextButton.setOnClickListener(v -> loadQuestion());
            }else if(questionNum == 8){
                nextButton.setOnClickListener(v -> loadQuestion());
                nextButton.setText("Finish");
            }else{
                onDestroy();
            }
        }
    }

    private void checkAnswer(int selectedAnswer, int correctAnswer) {
        if (selectedAnswer == correctAnswer){
            switch (selectedAnswer){
                case 1:
                    answer1Button.setBackgroundColor(Color.GREEN);
                    break;
                case 2:
                    answer2Button.setBackgroundColor(Color.GREEN);
                    break;
                case 3:
                    answer3Button.setBackgroundColor(Color.GREEN);
                    break;
                case 4:
                    answer4Button.setBackgroundColor(Color.GREEN);
                    break;
            }
            score++;
        }else {
            switch (selectedAnswer){
                case 1:
                    answer1Button.setBackgroundColor(Color.RED);
                    break;
                case 2:
                    answer2Button.setBackgroundColor(Color.RED);
                    break;
                case 3:
                    answer3Button.setBackgroundColor(Color.RED);
                    break;
                case 4:
                    answer4Button.setBackgroundColor(Color.RED);
                    break;
            }
        }
        answer1Button.setEnabled(false);
        answer2Button.setEnabled(false);
        answer3Button.setEnabled(false);
        answer4Button.setEnabled(false);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        db.close();
        Intent intent = new Intent(this, ResultsActivity.class);
        intent.putExtra("SCORE", score);
        startActivity(intent);
    }
}