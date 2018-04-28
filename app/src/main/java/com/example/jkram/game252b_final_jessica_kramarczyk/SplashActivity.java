package com.example.jkram.game252b_final_jessica_kramarczyk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread timer = new Thread(){
            public void run(){
                try{
                    sleep(2000);

                }catch (InterruptedException e){
                    e.printStackTrace();
                }

                finally {
                    Intent myIntent = new Intent(SplashActivity.this, MainMenuActivity.class);
                    startActivity(myIntent);

                }
            }
        };

        timer.start();
    }

    protected void onPause(){
        super.onPause();


        this.finish();
    }


}

