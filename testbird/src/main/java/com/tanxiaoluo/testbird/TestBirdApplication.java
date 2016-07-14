package com.tanxiaoluo.testbird;

import android.content.Context;

import com.avos.avoscloud.AVObject;
import com.tanxiaoluo.common.BaseApplication;
import com.tanxiaoluo.common.callback.ActivityLifeCallback;
import com.tanxiaoluo.common.utils.AvObjectHelper;
import com.tanxiaoluo.common.utils.CrashHelper;
import com.testbird.artisan.TestBirdAgent.CrashManager;

/**
 * Created by tanluo on 2016/7/14 0014.
 */
public class TestBirdApplication extends BaseApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        CrashManager.register(this, Key.TEST_BIRD_KEY);
    }

    @Override
    public void onEvent(Context context, String eventId) {
        //testBird只有崩溃统计
    }

    @Override
    public void initCallback() {
        callback = new ActivityLifeCallback() {
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
    }

    @Override
    public void initReport() {
        crashReporter = new CrashHelper.CrashReportInterface() {
            @Override
            public void report(Exception e) {
                CrashManager.getInstance().submitException(e);
            }
        };
    }
}
