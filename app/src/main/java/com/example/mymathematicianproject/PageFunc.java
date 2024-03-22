package com.example.mymathematicianproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
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
    private int questionNumber = 0;
    QuestionDbHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_func);


        questionTextView = findViewById(R.id.questionTextView);
        answer1Button = findViewById(R.id.answer1Button);
        answer2Button = findViewById(R.id.answer2Button);
        answer3Button = findViewById(R.id.answer3Button);
        answer4Button = findViewById(R.id.answer4Button);
        nextButton = findViewById(R.id.nextButton);

        /*dbHelper = new QuestionDbHelper(this);
        SQLiteDatabase db = dbHelper.getReadableDatabase();

        displayQuestion();

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAnswer();
            }
        });*/
    }

    /*@SuppressLint("Range")
    private void displayQuestion() {
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM questionsDeriv ORDER BY RANDOM() LIMIT 1", null);
        if (cursor.moveToFirst()) {
            String question = cursor.getString(cursor.getColumnIndex("question"));
            String answer1 = cursor.getString(cursor.getColumnIndex("answer1"));
            String answer2 = cursor.getString(cursor.getColumnIndex("answer2"));
            String answer3 = cursor.getString(cursor.getColumnIndex("answer3"));
            String answer4 = cursor.getString(cursor.getColumnIndex("answer4"));

            questionTextView.setText(question);
            answer1Button.setText(answer1);
            answer2Button.setText(answer2);
            answer3Button.setText(answer3);
            answer4Button.setText(answer4);
        }
        cursor.close();
    }

    private  int score = 0;
    @SuppressLint("Range")
    private void checkAnswer() {
        answer1Button = findViewById(R.id.answer1Button);
        answer2Button = findViewById(R.id.answer2Button);
        answer3Button = findViewById(R.id.answer3Button);
        answer4Button = findViewById(R.id.answer4Button);

        String selectedAnswer = "";
        if (answer1Button.isSelected()){
            selectedAnswer = answer1Button.getText().toString();
        } else if (answer2Button.isSelected()) {
            selectedAnswer = answer2Button.getText().toString();
        }else if (answer3Button.isSelected()) {
            selectedAnswer = answer3Button.getText().toString();
        }else if (answer4Button.isSelected()) {
            selectedAnswer = answer4Button.getText().toString();
        }

        SQLiteDatabase db = dbHelper.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT correct_answer FROM questionsDeriv  LIMIT 1 OFFSET " + questionNumber, null);
        if (cursor.moveToFirst()){
            String correctAnswer = cursor.getString(cursor.getColumnIndex("correct_answer"));

            if (selectedAnswer.equals(correctAnswer)){
                score ++;
            }
        }
        cursor.close();


        if (questionNumber<7){
            questionNumber ++;
            displayQuestion();
            if (questionNumber == 7) {
                nextButton.setText("Finish");
            }
        }else {
            Intent intent = new Intent(PageFunc.this, ResultsActivity.class);
            startActivity(intent);
            finish();
        }
    }*/
}