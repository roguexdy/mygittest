package com.xdy.gittest4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = new TextView(this);

        init();
    }

    private void init() {
        TextView textView = new TextView(this);
        ImageView imageView = new ImageView(this);
        VideoView videoView = new VideoView(this);
        ScrollView scrollView = new ScrollView(this);
    }
}
