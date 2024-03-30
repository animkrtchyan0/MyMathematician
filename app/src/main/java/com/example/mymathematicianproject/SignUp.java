package com.example.mymathematicianproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class SignUp extends AppCompatActivity {
    private EditText add_email;
    private EditText add_password;
    private EditText add_con_password;

    private Button sigh_up;
    FirebaseAuth mAuth;

    public  void  onStart(){
        super.onStart();
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if (currentUser != null){
            Intent intent = new Intent(SignUp.this, MainActivity.class);
            startActivity(intent);
            finish();
        }
    }
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        mAuth = FirebaseAuth.getInstance();
        add_email = findViewById(R.id.email);
        add_password = findViewById(R.id.password);
        add_con_password = findViewById(R.id.con_password);
        sigh_up = findViewById(R.id.sigh_up);


        sigh_up.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String email  = add_email.getText().toString();
                String password = add_password.getText().toString();
                String con_password = add_con_password.getText().toString();



                if (email.isEmpty() || password.isEmpty() || con_password.isEmpty() ) {
                    Toast.makeText(SignUp.this ,"Please enter all fields", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (!password.equals(con_password)) {
                    Toast.makeText(SignUp.this ,"Password does not match", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(password.length() < 8){
                    Toast.makeText(SignUp.this ,"Password must be at least 8 characters long", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (!Patterns.EMAIL_ADDRESS.matcher(email.toLowerCase()).matches()){
                    Toast.makeText(SignUp.this, "No valid email address", Toast.LENGTH_SHORT).show();
                }

                mAuth.createUserWithEmailAndPassword(email, password)
                        .addOnCompleteListener(task ->   {
                                if (task.isSuccessful()) {
                                    mAuth.getCurrentUser().sendEmailVerification()
                                            .addOnCompleteListener(new OnCompleteListener<Void>() {
                                                @Override
                                                public void onComplete(@NonNull Task<Void> task) {
                                                   if (task.isSuccessful()){
                                                       Toast.makeText(SignUp.this, "Registration succeed.Please verify your email.", Toast.LENGTH_SHORT).show();
                                                   }else {
                                                       Toast.makeText(SignUp.this, "Authentication failed.", Toast.LENGTH_SHORT).show();
                                                   }
                                                }
                                            });
                                } else {
                                    Toast.makeText(SignUp.this,task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                                }

                        } );
            }
        });
    }
}