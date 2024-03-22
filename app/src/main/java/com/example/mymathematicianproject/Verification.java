package com.example.mymathematicianproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Verification extends AppCompatActivity {
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification);

        auth = FirebaseAuth.getInstance();
        FirebaseUser User = auth.getCurrentUser();
        toastEmailOpen();
    }

    private void toastEmailOpen() {
        Toast.makeText(Verification.this, R.string.open_email, Toast.LENGTH_SHORT).show();
        Handler handler = new Handler();
        handler.postDelayed(() -> {
        }, 2000);
        new CountDownTimer(Integer.MAX_VALUE, 3000){
            public void onTick(long millisUntilFinished) {
                Intent intent = getIntent();
                String password = "";
                if (intent != null){
                    password = intent.getStringExtra("password");
                }
                auth.signInWithEmailAndPassword(auth.getCurrentUser().getEmail(), password).addOnCompleteListener(task -> {
                    if (auth.getCurrentUser().isEmailVerified()){
                        Toast.makeText(Verification.this, "Is verified", Toast.LENGTH_SHORT).show();
                        cancel();
                        startActivity(new Intent(Verification.this, MainActivity.class));
                        finish();
                    }
                });
            }

            @Override
            public void onFinish() {
            }
        }.start();
    }
}