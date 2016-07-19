package com.tanxiaoluo.lean;

import android.content.Context;

import com.avos.avoscloud.AVAnalytics;
import com.tanxiaoluo.common.BaseApplication;
import com.tanxiaoluo.common.callback.ActivityLifeCallback;
import com.tanxiaoluo.common.utils.AvObjectHelper;

/**
 * Created by tanluo on 2016/7/15 0015.
 */
public class LeanApp extends BaseApplication {

    @Override
    public void onCreate() {
        super.onCreate();
//        AVOSCloud.initialize(this, Key.LEAD_CLOUD_ID, Key.LEAD_CLOUD_KEY);
        AVAnalytics.enableCrashReport(getApplicationContext(),true);
    }

    @Override
    public void onEvent(Context context, String eventId) {
        AvObjectHelper.onEvent(context, "Lean", eventId);
        AVAnalytics.onEvent(context, eventId);
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
                AVAnalytics.onResume(context);
            }

            @Override
            public void onPause(Context context) {
                AVAnalytics.onPause(context);
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

    }
}
