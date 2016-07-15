package com.tanxiaoluo.mta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tanxiaoluo.common.BaseApplication;
import com.tanxiaoluo.common.ui.BaseActivity;
import com.tanxiaoluo.common.ui.HomeActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        qStartActivity(context, HomeActivity.class);
        finish();
    }
}
