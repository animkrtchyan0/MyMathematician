package com.example.mymathematicianproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class GameStartPage extends AppCompatActivity {
    private String topic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_start_page);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = getIntent();
                topic = intent.getStringExtra("TOPIC");
                Intent intent1 = new Intent(GameStartPage.this, QuestionPage.class);
                intent1.putExtra("TOPIC",topic);
                startActivity(intent1);
                finish();
            }
        },1500);

    }
}