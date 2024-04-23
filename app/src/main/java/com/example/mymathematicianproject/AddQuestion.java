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

        TextView textView = findViewById(R.id.textView2);
        Intent intent = getIntent();
        String topic = intent.getStringExtra("TOPIC");
        textView.setText(topic);

        Button sendRequest = findViewById(R.id.sendRequest);

        db = FirebaseFirestore.getInstance();

        sendRequest.setOnClickListener(new View.OnClickListener() {
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

    //Todo correct validation
    private boolean isValidQuestion() {
        return true;
    }
}