package com.example.mymathematicianproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

import java.util.Objects;

public class DeleteAccepting extends AppCompatActivity {

    private Button yes;
    private Button no;
    FirebaseAuth auth;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_accepting);

        yes = findViewById(R.id.yes);
        no = findViewById(R.id.no);

        auth = FirebaseAuth.getInstance();
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Objects.requireNonNull(auth.getCurrentUser()).delete();
                FirebaseAuth.getInstance().signOut();
                Intent intent = new Intent(DeleteAccepting.this, LogIn.class);
                finish();
                startActivity(intent);
            }
        });

        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DeleteAccepting.this, MainActivity.class);
                finish();
                startActivity(intent);
            }
        });
    }
}