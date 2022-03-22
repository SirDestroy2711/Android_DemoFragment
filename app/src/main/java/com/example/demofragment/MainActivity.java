package com.example.demofragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment_A fragmentA = new Fragment_A();
        getSupportFragmentManager().beginTransaction().add(R.id.frame,fragmentA).commit();
    }
}