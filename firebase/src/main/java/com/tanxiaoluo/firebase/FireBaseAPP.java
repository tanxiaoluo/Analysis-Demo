package com.tanxiaoluo.firebase;

import android.content.Context;
import android.os.Bundle;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crash.FirebaseCrash;
import com.tanxiaoluo.common.BaseApplication;
import com.tanxiaoluo.common.utils.AvObjectHelper;
import com.tanxiaoluo.common.utils.CrashHelper;

/**
 * Created by tanluo on 2016/7/15 0015.
 */
public class FireBaseAPP extends BaseApplication {

    private FirebaseAnalytics mFireBaseAnalytics;

    @Override
    public void onCreate() {
        super.onCreate();
        mFireBaseAnalytics = FirebaseAnalytics.getInstance(this);
    }


    @Override
    public void onEvent(Context context, String eventId) {
        AvObjectHelper.onEvent(context, "fireBase", eventId);
        Bundle bundle = new Bundle();
        bundle.putString(FirebaseAnalytics.Param.ITEM_ID, eventId);
        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, eventId);
        mFireBaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);
    }

    @Override
    public void initCallback() {

    }

    @Override
    public void initReport() {
        crashReporter = new CrashHelper.CrashReportInterface() {
            @Override
            public void report(Exception e) {
                FirebaseCrash.report(e);
            }
        };
    }
}
