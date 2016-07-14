package com.tanxiaoluo.common.utils;

import android.content.Context;

import com.avos.avoscloud.AVOSCloud;

/**
 * Created by tanluo on 2016/7/14 0014.
 */
public class InitHelper {

    public static void initTestBird(Context context, String key) {

    }

    public static void initLeadCloudBase(Context context, String id, String key) {
        AVOSCloud.initialize(context, id, key);
    }

}
