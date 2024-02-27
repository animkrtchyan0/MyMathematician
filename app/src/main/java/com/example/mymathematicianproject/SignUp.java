package com.example.mymathematicianproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {
    private EditText name;
    private EditText email;
    private EditText password;
    private Button sigh_up;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        sigh_up = findViewById(R.id.sigh_up);


        sigh_up.setOnClickListener(new View.OnClickListener() {

            String add_name  = name.getText().toString();
            String add_email  = email.getText().toString();
            String add_password = password.getText().toString();

            @Override
            public void onClick(View v) {
                if (add_name.isEmpty()   || add_email.isEmpty() || add_password.isEmpty()) {
                    Toast.makeText(SignUp.this ,"Please enter all fields", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent = new Intent(SignUp.this,MainActivity.class);
                    startActivity(intent);
                }
            }
        });

    }

}