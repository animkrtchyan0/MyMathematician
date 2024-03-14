package com.example.mymathematicianproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class LevelPageReal extends AppCompatActivity {

    LinearLayout level1;
    LinearLayout level2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_page_real);

        level1 = findViewById(R.id.level1);
        level2 = findViewById(R.id.level2);

        level1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LevelPageReal.this,QuizArithm1.class);
                startActivity(intent);
            }
        });

        level2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LevelPageReal.this,QuizArithm2.class);
                startActivity(intent);
            }
        });
    }
}