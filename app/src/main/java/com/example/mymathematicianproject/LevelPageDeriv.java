package com.example.mymathematicianproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class LevelPageDeriv extends AppCompatActivity {
    private LinearLayout level1,level2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_page_deriv);

        level1 = findViewById(R.id.level1);
        level2 = findViewById(R.id.level2);

        level1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LevelPageDeriv.this,QuizDeriv1.class);
                startActivity(intent);
                finish();
            }
        });
        level2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LevelPageDeriv.this,QuizDeriv2.class);
                startActivity(intent);
                finish();
            }
        });
    }
}