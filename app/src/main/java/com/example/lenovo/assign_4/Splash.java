package com.example.lenovo.assign_4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.PopupMenu;

public class Splash extends AppCompatActivity {
    ImageView iv;
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        iv=(ImageView)findViewById(R.id.ivsplash);
        Animation myanim= AnimationUtils.loadAnimation(this,R.anim.mytransition);
        iv.setAnimation(myanim);



        i=new Intent(this,home.class);
        Thread t = new Thread() {
            public void run() {
                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    startActivity(i);
                    finish();
                }
            }
        };
        t.start();
    }
}
