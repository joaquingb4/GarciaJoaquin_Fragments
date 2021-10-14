package com.example.garciajoaquin_fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNav = findViewById(R.id.main_menu);
        bottomNav.setOnItemSelectedListener(item -> {
            Fragment selectedFragment = null;
            switch (item.getItemId()){
                case R.id.nav_home:
                    selectedFragment = new fragment_home();
                    break;
                case R.id.nav_list:
                    selectedFragment = new fragment_list();
                    break;
                case R.id.nav_registration:
                    selectedFragment = new fragment_registration();
                    break;
            }

            getSupportFragmentManager().beginTransaction().replace(R.id.fragmentHome, selectedFragment).commit();//Me he quedado aquí

            return true;
        });


    }
}