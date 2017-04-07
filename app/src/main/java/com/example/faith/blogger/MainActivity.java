package com.example.faith.blogger;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends Activity {
ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    iv= (ImageView) findViewById(R.id.imageView3);
        iv.setImageResource(R.drawable.blog);
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {

            public void run() {

                Intent i=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(i);
                finish();

            }

        }, 3000);
    }
}
