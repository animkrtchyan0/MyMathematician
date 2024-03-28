package com.example.mymathematicianproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultsActivity extends AppCompatActivity {

    private TextView progress_perc;

    private Button back_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        Intent intent = getIntent();
        int score = intent.getIntExtra("SCORE", 0);
        float scores = (float) (score * 12.5);
        String scoreSting = Float.toString(scores);
        progress_perc = findViewById(R.id.progress_perc);
        progress_perc.setText(scoreSting);


        back_btn = findViewById(R.id.back_btn);

        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ResultsActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}