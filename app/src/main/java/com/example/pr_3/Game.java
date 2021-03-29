package com.example.pr_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;

import java.util.concurrent.TimeUnit;

public class Game extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_game);
        Button btn_start = (Button)findViewById(R.id.button4);
        Button btn_drive = (Button)findViewById(R.id.button2);
        ImageView carPC = (ImageView)findViewById(R.id.imageView4);
        ImageView carUser = (ImageView)findViewById(R.id.imageView3);
        btn_drive.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                float translationX = carUser.getTranslationX();
                float translationY = carUser.getTranslationY();
                TranslateAnimation animation = new TranslateAnimation(translationX, translationX+2600, translationY,translationY);
                animation.setDuration(TimeUnit.SECONDS.toMillis(2L));
                animation.setFillAfter(true);
                carUser.startAnimation(animation);
                return false;
            }
        });
        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float translationX = carPC.getTranslationX();
                float translationY = carPC.getTranslationY();
                TranslateAnimation animation = new TranslateAnimation(translationX, translationX+2600, translationY,translationY);
                animation.setDuration(TimeUnit.SECONDS.toMillis(4L));
                animation.setFillAfter(true);
                carPC.startAnimation(animation);
            }
        });
    }
}