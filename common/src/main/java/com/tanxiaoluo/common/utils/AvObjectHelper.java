package com.tanxiaoluo.common.utils;

import android.content.Context;

import com.avos.avoscloud.AVException;
import com.avos.avoscloud.AVObject;
import com.avos.avoscloud.SaveCallback;

/**
 * Created by tanluo on 2016/7/14 0014.
 */
public class AvObjectHelper {

    public static void onEvent(Context context,String projectName, String eventId){
        AVObject avObject = new AVObject(projectName);
        avObject.put("eventId", eventId);
        avObject.put("userId", DeviceUtil.getDeviceId(context));
        avObject.saveInBackground();
    }
}
