package com.example.mymathematicianproject;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuizLog2 extends AppCompatActivity {
    private TextView questionTextView;
    private Button answer1Button, answer2Button, answer3Button, answer4Button;
    private Button nextButton;

    private SQLiteDatabase db;
    private List<Question> questionList;
    private int currentQuestionIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz_log2);

        questionTextView = findViewById(R.id.questionTextView);
        answer1Button = findViewById(R.id.answer1Button);
        answer2Button = findViewById(R.id.answer2Button);
        answer3Button = findViewById(R.id.answer3Button);
        answer4Button = findViewById(R.id.answer4Button);
        nextButton = findViewById(R.id.nextButton);

        QuestionDbHelper dbHelper = new QuestionDbHelper(this);
        db = dbHelper.getReadableDatabase();

        loadQuestions();

        showQuestion(currentQuestionIndex);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentQuestionIndex++;
                if (currentQuestionIndex < questionList.size()) {
                    showQuestion(currentQuestionIndex);
                    if (currentQuestionIndex == questionList.size() - 1) {
                        nextButton.setText("Finish");
                    }
                } else {
                    Intent intent = new Intent(QuizLog2.this, ResultsActivity.class);
                    // Pass quiz results to the ResultsActivity
                    startActivity(intent);
                }
            }
        });
    }
    @SuppressLint("Range")
    private void loadQuestions() {
        questionList = new ArrayList<>();

        Cursor cursor = db.rawQuery("SELECT * FROM questionsLog2", null);
        if (cursor.moveToFirst()) {
            do {
                String question = cursor.getString(cursor.getColumnIndex("question"));
                String answer1 = cursor.getString(cursor.getColumnIndex("answer1"));
                String answer2 = cursor.getString(cursor.getColumnIndex("answer2"));
                String answer3 = cursor.getString(cursor.getColumnIndex("answer3"));
                String answer4 = cursor.getString(cursor.getColumnIndex("answer4"));
                int correctAnswer = cursor.getInt(cursor.getColumnIndex("correct_answer"));

                questionList.add(new Question(question,
                        answer1, answer2, answer3, answer4, correctAnswer));
            } while (cursor.moveToNext());
        }
        cursor.close();

        Collections.shuffle(questionList);
        questionList = questionList.subList(0, 8); // Get 8 random questions
    }

    private void showQuestion(int index) {
        Question currentQuestion = questionList.get(index);
        questionTextView.setText(currentQuestion.getQuestion());
        answer1Button.setText(currentQuestion.getAnswer1());
        answer2Button.setText(currentQuestion.getAnswer2());
        answer3Button.setText(currentQuestion.getAnswer3());
        answer4Button.setText(currentQuestion.getAnswer4());
    }
}
