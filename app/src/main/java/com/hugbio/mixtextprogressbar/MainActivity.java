package com.hugbio.mixtextprogressbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    MixTextProgressBar mixTextProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mixTextProgressBar = findViewById(R.id.mixTextProgressBar);
        mixTextProgressBar.setMax(100);
        mixTextProgressBar.setProgress(0);
        new Thread(new Runnable() {
            @Override
            public void run() {
                int progress = mixTextProgressBar.getProgress();
                while ( progress <= 100){
                    mixTextProgressBar.setProgress(progress);
                    mixTextProgressBar.setText("当前进度："+progress+"%");
                    progress ++;
                    try {
                        Thread.sleep(60);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
