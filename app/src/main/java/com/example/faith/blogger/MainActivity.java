package com.example.faith.blogger;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends Activity {
ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    iv= (ImageView) findViewById(R.id.imageView3);
        iv.setImageResource(R.drawable.blog);
    }
}
