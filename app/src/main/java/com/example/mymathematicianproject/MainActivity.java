package com.example.mymathematicianproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    HomePage homePage = new HomePage();
    ProfilePage profilePage = new ProfilePage();
    AiPage aiPage = new AiPage();
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView= findViewById(R.id.bottom_navigation);

        getSupportFragmentManager().beginTransaction().replace(R.id.container,homePage).commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(MenuItem item) {

                if (item.getItemId()== R.id.home_bottom){
                    getSupportFragmentManager().beginTransaction().replace(R.id.container,homePage).commit();
                }else if (item.getItemId()== R.id.profile_bottom){
                    getSupportFragmentManager().beginTransaction().replace(R.id.container,profilePage).commit();
                }else if (item.getItemId()== R.id.letter_bottom){
                    getSupportFragmentManager().beginTransaction().replace(R.id.container,aiPage).commit();
                }

                return false;
            }
        });


    }
}