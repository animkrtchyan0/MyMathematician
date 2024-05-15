package com.example.mymathematicianproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.List;
import java.util.Random;

public class QuestionPage extends AppCompatActivity {
    private static final String TAG = "PageVar";

    private TextView questionTextView;
    private Button answer1Button, answer2Button, answer3Button, answer4Button;
    private Button nextButton;
    private CanvasView canvasView;
    private int score = 0;
    private FirebaseFirestore db;
    private int questionNum = 0;
    private String topic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_question);

        db = FirebaseFirestore.getInstance();

        Intent intent = getIntent();
        topic = intent.getStringExtra("TOPIC");

        questionTextView = findViewById(R.id.questionTextView);
        answer1Button = findViewById(R.id.answer1Button);
        answer2Button = findViewById(R.id.answer2Button);
        answer3Button = findViewById(R.id.answer3Button);
        answer4Button = findViewById(R.id.answer4Button);
        nextButton = findViewById(R.id.nextButton);

        canvasView = findViewById(R.id.canvas_view);
        Button cleanButton = findViewById(R.id.clean_button);
        cleanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                canvasView.clearCanvas();
            }
        });


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

        db.collection(topic)
                .get()
                .addOnSuccessListener(new OnSuccessListener<QuerySnapshot>() {
                    @SuppressLint("SetTextI18n")
                    @Override
                    public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                        List<DocumentSnapshot> documents = queryDocumentSnapshots.getDocuments();
                        int randomIndex = new Random().nextInt(documents.size());
                        DocumentSnapshot randomDocument = documents.get(randomIndex);

                        String question = randomDocument.getString("question");
                        String answer1 = randomDocument.getString("answer1");
                        String answer2 = randomDocument.getString("answer2");
                        String answer3 = randomDocument.getString("answer3");
                        String answer4 = randomDocument.getString("answer4");
                        int correctAnswer = randomDocument.getLong("correctAnswer").intValue();

                        questionTextView.setText(/*questionNum + 1 + ") " +*/ question);
                        answer1Button.setText(answer1);
                        answer2Button.setText(answer2);
                        answer3Button.setText(answer3);
                        answer4Button.setText(answer4);

                        answer1Button.setOnClickListener(v -> checkAnswer(1, correctAnswer));
                        answer2Button.setOnClickListener(v -> checkAnswer(2, correctAnswer));
                        answer3Button.setOnClickListener(v -> checkAnswer(3, correctAnswer));
                        answer4Button.setOnClickListener(v -> checkAnswer(4, correctAnswer));

                        questionNum++;
                        if (questionNum < 8) {
                            nextButton.setText("Next");
                            nextButton.setOnClickListener(v -> loadQuestion());
                        } else if (questionNum == 8) {
                            nextButton.setOnClickListener(v -> loadQuestion());
                            nextButton.setText("Finish");
                        } else {
                            onDestroy();
                        }
                    }
                });
    }

    private void checkAnswer(int selectedAnswer, int correctAnswer) {
        addColorToAnswer(selectedAnswer, Color.RED);
        addColorToAnswer(correctAnswer, Color.GREEN);

        if (selectedAnswer == correctAnswer){
            score++;
        }
        answer1Button.setEnabled(false);
        answer2Button.setEnabled(false);
        answer3Button.setEnabled(false);
        answer4Button.setEnabled(false);
    }

    private void addColorToAnswer(int answer, int color) {
        switch (answer) {
            case 1:
                answer1Button.setBackgroundColor(color);
                break;
            case 2:
                answer2Button.setBackgroundColor(color);
                break;
            case 3:
                answer3Button.setBackgroundColor(color);
                break;
            case 4:
                answer4Button.setBackgroundColor(color);
                break;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Intent intent = new Intent(this, ResultsActivity.class);
        intent.putExtra("SCORE", score);
        startActivity(intent);
    }
}