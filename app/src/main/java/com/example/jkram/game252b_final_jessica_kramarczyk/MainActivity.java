package com.example.jkram.game252b_final_jessica_kramarczyk;

import android.graphics.drawable.AnimationDrawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView m1,m2,m3,m4,m5,m6;

    TextView txt_Left, txt_Score;

    Random ran = new Random();

    int score = 0, fps = 0, left = 0, tempifLeft=0;
    int which = 0, whichsvae=0;

    AnimationDrawable animMole;

    Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_Left = (TextView) findViewById(R.id.left);
        txt_Score = (TextView) findViewById(R.id.score);

        m1 = (ImageView) findViewById(R.id.mole1);
        m2 = (ImageView) findViewById(R.id.mole2);
        m3 = (ImageView) findViewById(R.id.mole3);
        m4 = (ImageView) findViewById(R.id.mole4);
        m5 = (ImageView) findViewById(R.id.mole5);
        m6 = (ImageView) findViewById(R.id.mole6);

        startButton = (Button) findViewById(R.id.startButton);

        m1.setVisibility(View.INVISIBLE);
        m2.setVisibility(View.INVISIBLE);
        m3.setVisibility(View.INVISIBLE);
        m4.setVisibility(View.INVISIBLE);
        m5.setVisibility(View.INVISIBLE);
        m6.setVisibility(View.INVISIBLE);

        startButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                left = 5;
                txt_Left.setText("Left: " + left);
                txt_Score.setText("Score: " + score);
                android.os.Handler handler = new android.os.Handler();
                handler.postDelayed(new Runnable(){
                    @Override
                    public void run(){
                        theGameAction();
                    }
                },1000);
                startButton.setEnabled(false);
                startButton.setVisibility(View.INVISIBLE);
            }
        });

    }

    private void theGameAction(){
        if (score <10){
            fps = 1000;
        }
        else if(score>=10 && score <15){
            fps = 950;
        }
        else if(score>=15 && score <20){
            fps = 900;
        }
        else if(score>=20 && score <25){
            fps = 850;
        }
        else if(score>=25 && score <30){
            fps = 800;
        }
        else if(score>=30 && score <35){
            fps = 750;
        }
        else if(score>=40 && score <40){
            fps = 700;
        }
        else if(score>=45 && score <45){
            fps = 650;
        }
        else if(score>=50 && score <55){
            fps = 600;
        }
        else if(score>=55 && score <60){
            fps = 550;
        }
        else if(score>=60 && score <65){
            fps = 500;
        }
        else if(score>=65 && score <70){
            fps = 450;
        }
        else if(score>=75){
            fps =350;
        }

        animMole = (AnimationDrawable) ContextCompat.getDrawable(this, R.drawable.anim);
        do {
            which = ran.nextInt(6)+1;

        }while(whichsvae == which);
        whichsvae = which;

        if (which ==1){
            m1.setImageDrawable(animMole);
            m1.setVisibility(View.VISIBLE);
            m1.setEnabled(true);
        }
        else if(which == 2){
            m2.setImageDrawable(animMole);
            m2.setVisibility(View.VISIBLE);
            m2.setEnabled(true);
        }

        else if(which == 3){
            m3.setImageDrawable(animMole);
            m3.setVisibility(View.VISIBLE);
            m3.setEnabled(true);
        }

        if (which ==4){
            m4.setImageDrawable(animMole);
            m4.setVisibility(View.VISIBLE);
            m4.setEnabled(true);
        }
        else if(which == 5){
            m5.setImageDrawable(animMole);
            m5.setVisibility(View.VISIBLE);
            m5.setEnabled(true);
        }

        else if(which == 6){
            m6.setImageDrawable(animMole);
            m6.setVisibility(View.VISIBLE);
            m6.setEnabled(true);
        }
        animMole.start();
        android.os.Handler handler = new android.os.Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                m1.setVisibility(View.INVISIBLE);
                m2.setVisibility(View.INVISIBLE);
                m3.setVisibility(View.INVISIBLE);
                m4.setVisibility(View.INVISIBLE);
                m5.setVisibility(View.INVISIBLE);
                m6.setVisibility(View.INVISIBLE);

                m1.setEnabled(false);
                m2.setEnabled(false);
                m3.setEnabled(false);
                m4.setEnabled(false);
                m5.setEnabled(false);
                m6.setEnabled(false);

                if (tempifLeft == 0){
                    left--;
                    txt_Left.setText("LEFT: " + left);
                }
                else if (tempifLeft ==1){
                    tempifLeft = 0;
                }

                if (left == 0){
                    Toast.makeText(MainActivity.this, "GAMEOVER", Toast.LENGTH_SHORT).show();
                    //startButton.setEnabled(true);

                }
                else if (left>0){
                    theGameAction();
                }
            }
        },fps);

    }

    public void clickMole1(View view) {
        tempifLeft = 1;
        m1.setImageResource(R.drawable.hit);
        score++;
        txt_Score.setText("Score: " + score);
        m1.setEnabled(false);
    }
    public void clickMole2(View view) {
        tempifLeft = 1;
        m2.setImageResource(R.drawable.hit);
        score++;
        txt_Score.setText("Score: " + score);
        m2.setEnabled(false);
    }
    public void clickMole3(View view) {
        tempifLeft = 1;
        m3.setImageResource(R.drawable.hit);
        score++;
        txt_Score.setText("Score: " + score);
        m3.setEnabled(false);
    }
    public void clickMole4(View view) {
        tempifLeft = 1;
        m4.setImageResource(R.drawable.hit);
        score++;
        txt_Score.setText("Score: " + score);
        m4.setEnabled(false);
    }
    public void clickMole5(View view) {
        tempifLeft = 1;
        m5.setImageResource(R.drawable.hit);
        score++;
        txt_Score.setText("Score: " + score);
        m5.setEnabled(false);
    }
    public void clickMole6(View view) {
        tempifLeft = 1;
        m6.setImageResource(R.drawable.hit);
        score++;
        txt_Score.setText("Score: " + score);
        m6.setEnabled(false);
    }


}
