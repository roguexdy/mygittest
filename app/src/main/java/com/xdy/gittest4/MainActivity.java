package com.xdy.gittest4;

import android.support.v4.view.NestedScrollingChild;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.HorizontalScrollView;
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

        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(this);
        NestedScrollingChild nestedScrollingChild = new NestedScrollingChild() {
            @Override
            public void setNestedScrollingEnabled(boolean enabled) {

            }

            @Override
            public boolean isNestedScrollingEnabled() {
                return false;
            }

            @Override
            public boolean startNestedScroll(int axes) {
                return false;
            }

            @Override
            public void stopNestedScroll() {

            }

            @Override
            public boolean hasNestedScrollingParent() {
                return false;
            }

            @Override
            public boolean dispatchNestedScroll(int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int[] offsetInWindow) {
                return false;
            }

            @Override
            public boolean dispatchNestedPreScroll(int dx, int dy, int[] consumed, int[] offsetInWindow) {
                return false;
            }

            @Override
            public boolean dispatchNestedFling(float velocityX, float velocityY, boolean consumed) {
                return false;
            }

            @Override
            public boolean dispatchNestedPreFling(float velocityX, float velocityY) {
                return false;
            }
        };
    }
}
