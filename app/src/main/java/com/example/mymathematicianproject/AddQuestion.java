package com.example.mymathematicianproject;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class AddQuestion extends AppCompatActivity {
    private static final String TAG = "AddVarQues";
    private Button cancel;

    private EditText newQuestion;
    private EditText AddAnswer1;
    private EditText AddAnswer2;
    private EditText AddAnswer3;
    private EditText AddAnswer4;
    private EditText correctAns;
    private FirebaseFirestore db;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_ques);
        newQuestion = findViewById(R.id.newQuestion);
        AddAnswer1 = findViewById(R.id.myAns1);
        AddAnswer2 = findViewById(R.id.myAns2);
        AddAnswer3 = findViewById(R.id.myAns3);
        AddAnswer4 = findViewById(R.id.myAns4);
        correctAns = findViewById(R.id.myCorrectAns);
        cancel = findViewById(R.id.CancelRequest);

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddQuestion.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        TextView textView = findViewById(R.id.textView2);
        Intent intent = getIntent();
        String topic = intent.getStringExtra("TOPIC");
        textView.setText(topic);

        Button addQues = findViewById(R.id.sendRequest);

        db = FirebaseFirestore.getInstance();

        addQues.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isValidQuestion()) {
                    Map<String, Object> variableQues = new HashMap<>();
                    variableQues.put("question", newQuestion.getText().toString());
                    variableQues.put("answer1", AddAnswer1.getText().toString());
                    variableQues.put("answer2", AddAnswer2.getText().toString());
                    variableQues.put("answer3", AddAnswer3.getText().toString());
                    variableQues.put("answer4", AddAnswer4.getText().toString());
                    variableQues.put("correctAnswer", Integer.valueOf(correctAns.getText().toString()));


                    db.collection(topic)
                            .add(variableQues)
                            .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                                @Override
                                public void onSuccess(DocumentReference documentReference) {
                                    newQuestion.setText("");
                                    AddAnswer1.setText("");
                                    AddAnswer2.setText("");
                                    AddAnswer3.setText("");
                                    AddAnswer4.setText("");
                                    correctAns.setText("");
                                    Log.d(TAG, "DocumentSnapshot added with ID: " + documentReference.getId());
                                    Toast.makeText(AddQuestion.this, "Question is create.",
                                            Toast.LENGTH_SHORT).show();
                                }
                            })
                            .addOnFailureListener(new OnFailureListener() {
                                @Override
                                public void onFailure(@NonNull Exception e) {
                                    Log.w(TAG, "Error adding document", e);
                                }
                            });
                }
            }
        });
    }

    private boolean isValidQuestion() {

        String question = newQuestion.getText().toString();
        String ans1 = AddAnswer1.getText().toString();
        String ans2 = AddAnswer2.getText().toString();
        String ans3 = AddAnswer3.getText().toString();
        String ans4 = AddAnswer4.getText().toString();
        int number = Integer.valueOf(correctAns.getText().toString());
        String num = correctAns.getText().toString();

        if(ans1.isEmpty() || ans2.isEmpty() || ans3.isEmpty() || ans4.isEmpty() || question.isEmpty() || num.isEmpty()){
            Toast.makeText(AddQuestion.this, "Please enter all fields",
                    Toast.LENGTH_SHORT).show();
            return false;
        }
        if (number != 1 || number != 2 || number != 3 || number != 4){
            Toast.makeText(AddQuestion.this, "Please choose a number between 1-4",
                    Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }
}