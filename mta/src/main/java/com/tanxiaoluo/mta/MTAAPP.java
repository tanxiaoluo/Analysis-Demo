package com.tanxiaoluo.mta;

import android.content.Context;

import com.tanxiaoluo.common.BaseApplication;
import com.tanxiaoluo.common.utils.AvObjectHelper;
import com.tanxiaoluo.common.utils.CrashHelper;
import com.tencent.stat.MtaSDkException;
import com.tencent.stat.StatConfig;
import com.tencent.stat.StatReportStrategy;
import com.tencent.stat.StatService;
import com.tencent.stat.common.StatConstants;

/**
 * Created by tanluo on 2016/7/15 0015.
 */
public class MTAAPP extends BaseApplication {

    @Override
    public void onCreate() {
        super.onCreate();
//        StatConfig.setDebugEnable(true);
//        StatConfig.setStatSendStrategy(StatReportStrategy.INSTANT );  默认INSTANT
        try {
            StatService.startStatService(this, Key.MTA_APP_ID, StatConstants.VERSION);
        } catch (MtaSDkException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void onEvent(Context context, String eventId) {
        AvObjectHelper.onEvent(context,"MTA",eventId);
        StatService.trackCustomEvent(context, eventId);
    }

    @Override
    public void initCallback() {

    }

    @Override
    public void initReport() {
        crashReporter = new CrashHelper.CrashReportInterface() {
            @Override
            public void report(Exception e) {
                StatService.reportException(MTAAPP.this, e);
            }
        };
    }
}
