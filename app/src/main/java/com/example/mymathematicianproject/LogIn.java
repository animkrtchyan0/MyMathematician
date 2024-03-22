package com.example.mymathematicianproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LogIn extends AppCompatActivity {
    private EditText add_email;
    private EditText add_password;
    private Button log_in_button;
    FirebaseAuth mAuth;
    Button button;

    @Override
    public void onStart() {
        super.onStart();
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if(currentUser != null){
            Intent intent = new Intent(LogIn.this,MainActivity.class);
            startActivity(intent);
            finish();
        }
    }

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        add_email = findViewById(R.id.email);
        add_password = findViewById(R.id.password);
        log_in_button = findViewById(R.id.log_in_button);
        mAuth = FirebaseAuth.getInstance();

        log_in_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email  = add_email.getText().toString();
                String password = add_password.getText().toString();

                if (email.isEmpty() || password.isEmpty()) {
                    Toast.makeText(LogIn.this ,"Please enter all fields", Toast.LENGTH_SHORT).show();
                    return;
                }
                mAuth.signInWithEmailAndPassword(email, password)
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    Intent intent = new Intent(LogIn.this,MainActivity.class);
                                    startActivity(intent);
                                    finish();
                                    /* if (mAuth.getCurrentUser().isEmailVerified()){
                                        Intent intent = new Intent(LogIn.this,MainActivity.class);
                                        startActivity(intent);
                                        finish();
                                    }else {
                                        Toast.makeText(LogIn.this, "Please verify your email.",
                                                Toast.LENGTH_SHORT).show();
                                    }*/
                                } else {
                                    Toast.makeText(LogIn.this, "Authentication failed.",
                                            Toast.LENGTH_SHORT).show();
                                }
                            }
                        } );
            }
        });

        button = findViewById(R.id.to_sigh_up_button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LogIn.this,SignUp.class);
                startActivity(intent);
            }
        });
    }
}