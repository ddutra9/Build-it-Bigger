package com.example.jokedisplay;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class JokeActivity extends AppCompatActivity {

    public static String JOKE_KEY = "joke_key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
    }

}
