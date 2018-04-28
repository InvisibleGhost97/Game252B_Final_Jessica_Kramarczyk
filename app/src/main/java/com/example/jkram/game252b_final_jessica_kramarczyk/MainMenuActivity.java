package com.example.jkram.game252b_final_jessica_kramarczyk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class MainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    public void StartGame(View view) {
        Intent myIntent = new Intent(MainMenuActivity.this, MainActivity.class);
        startActivity(myIntent);
    }

    public void helpScreen(View view) {

    }

    public void quitGame(View view) {
        finish();
        System.exit(0);
    }
}
