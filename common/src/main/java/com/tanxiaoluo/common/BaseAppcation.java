package com.tanxiaoluo.common;

import android.app.Application;
import android.content.Context;

import com.tanxiaoluo.common.callback.ActivityLifeCallback;

/**
 * Created by tanluo on 2016/7/14 0014.
 */
public abstract class BaseAppcation extends Application {

    private ActivityLifeCallback callback;

    public abstract void onEvent(Context context, String eventId);

    public ActivityLifeCallback getCallback() {
        return callback;
    }

    public void setCallback(ActivityLifeCallback callback) {
        this.callback = callback;
    }
}
