package com.tanxiaoluo.bughd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tanxiaoluo.common.ui.BaseActivity;
import com.tanxiaoluo.common.ui.HomeActivity;

public class BugHDActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bug_hd);
        qStartActivity(this, HomeActivity.class);
        finish();
    }
}
