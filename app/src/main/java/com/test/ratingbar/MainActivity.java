package com.test.ratingbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.test.ratingbar.view.RatingBar;

public class MainActivity extends AppCompatActivity {

    private RatingBar mRatingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initView(){
        mRatingBar = (com.test.ratingbar.view.RatingBar) findViewById(R.id.star);
    }

    private void initData(){
        mRatingBar.setClickable(false);
        mRatingBar.setStar(3.5f);
    }
}
