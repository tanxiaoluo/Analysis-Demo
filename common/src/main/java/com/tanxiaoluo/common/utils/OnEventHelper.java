package com.tanxiaoluo.common.utils;

import android.content.Context;

import com.tanxiaoluo.common.BaseApplication;

/**
 * Created by tanluo on 2016/7/14 0014.
 */
public class OnEventHelper {

    public static void onEvent(Context context, String eventId) {
        if (context.getApplicationContext() instanceof BaseApplication) {
            ((BaseApplication) context.getApplicationContext()).onEvent(context, eventId);
        }
    }
}
