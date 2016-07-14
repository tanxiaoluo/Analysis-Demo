package com.tanxiaoluo.common.utils;

import android.content.Context;
import android.telephony.TelephonyManager;

/**
 * Created by tanxiaoluo on 2016/3/9.
 */
public class DeviceUtil {

    public static String getDeviceId(Context paramContext)
    {
        return ((TelephonyManager)paramContext.getSystemService(Context.TELEPHONY_SERVICE)).getDeviceId();
    }
}
