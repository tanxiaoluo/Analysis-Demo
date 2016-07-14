package com.tanxiaoluo.common.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.tanxiaoluo.common.BaseAppcation;
import com.tanxiaoluo.common.callback.ActivityLifeCallback;

/**
 * Created by tanluo on 2016/7/14 0014.
 */
public class BaseActivity extends AppCompatActivity {
    protected Context context;

    protected ActivityLifeCallback callback;

    protected ActivityLifeCallback defaultCallback = new ActivityLifeCallback() {
        @Override
        public void onCreate(Context context) {

        }

        @Override
        public void onStart(Context context) {

        }

        @Override
        public void onResume(Context context) {

        }

        @Override
        public void onPause(Context context) {

        }

        @Override
        public void onStop(Context context) {

        }

        @Override
        public void onDestroy(Context context) {

        }

        @Override
        public void onRestart(Context context) {

        }
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = this;
        callback = ((BaseAppcation)getApplication()).getCallback() == null ? defaultCallback
                : ((BaseAppcation)getApplication()).getCallback();
        callback.onCreate(context);
    }

    @Override
    protected void onStart() {
        super.onStart();
        callback.onStart(context);
    }

    @Override
    protected void onResume() {
        super.onResume();
        callback.onResume(context);
    }

    @Override
    protected void onPause() {
        super.onPause();
        callback.onPause(context);
    }

    @Override
    protected void onStop() {
        super.onStop();
        callback.onStop(context);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        callback.onDestroy(context);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        callback.onRestart(context);
    }
}
