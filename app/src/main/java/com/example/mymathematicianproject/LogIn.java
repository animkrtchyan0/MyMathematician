package com.example.mymathematicianproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LogIn extends AppCompatActivity {
    private EditText email;
    private EditText password;
    private Button log_in_button;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        log_in_button = findViewById(R.id.log_in_button);

        log_in_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneNumber  = email.getText().toString();
                String pass_word = password.getText().toString();

                if (phoneNumber.isEmpty() || pass_word.isEmpty()) {
                    Toast.makeText(LogIn.this ,"Please enter all fields", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent = new Intent(LogIn.this,MainActivity.class);
                    startActivity(intent);
                }
            }
        });

        Button button = findViewById(R.id.to_sigh_up_button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LogIn.this,SignUp.class);
                startActivity(intent);
            }
        });
    }
}