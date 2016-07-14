package com.tanxiaoluo.common.callback;

import android.content.Context;

/**
 * Created by tanluo on 2016/7/14 0014.
 */
public interface ActivityLifeCallback {
    void onCreate(Context context);

    void onStart(Context context);

    void onResume(Context context);

    void onPause(Context context);

    void onStop(Context context);

    void onDestroy(Context context);

    void onRestart(Context context);

}
