package com.tanxiaoluo.common;

import android.app.Application;
import android.content.Context;

import com.tanxiaoluo.common.callback.ActivityLifeCallback;
import com.tanxiaoluo.common.utils.CrashHelper;
import com.tanxiaoluo.common.utils.InitHelper;

/**
 * Created by tanluo on 2016/7/14 0014.
 */
public abstract class BaseApplication extends Application implements Const {

    protected ActivityLifeCallback callback;

    protected CrashHelper.CrashReportInterface crashReporter;

    @Override
    public void onCreate() {
        super.onCreate();
        initCallback();
        initReport();
        InitHelper.initLeadCloudBase(this, Key.LEAD_CLOUD_ID, Key.LEAD_CLOUD_KEY);
    }

    public abstract void onEvent(Context context, String eventId);

    public abstract void initCallback();

    public abstract void initReport();

    public ActivityLifeCallback getCallback() {
        return callback;
    }

    public CrashHelper.CrashReportInterface getCrashReporter() {
        return crashReporter;
    }
}
