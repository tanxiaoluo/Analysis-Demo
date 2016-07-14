package com.tanxiaoluo.testbird;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tanxiaoluo.common.ui.BaseActivity;
import com.tanxiaoluo.common.ui.HomeActivity;

public class TestBirdActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_bird);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                qStartActivity(context, HomeActivity.class);
                finish();
            }
        }, 1000);
    }
}
