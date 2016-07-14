package com.tanxiaoluo.common.utils;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by tanluo on 2016/7/14 0014.
 */
public class CrashHelper {

    public static interface CrashReportInterface {
        void report(Exception e);
    }

    public static void nullPointCrash(){
        String str = null;
        int a = str.length();
    }

    public static void arrayIndexCrash(){
        String[] strs = new String[2];
        strs[3] = "";
    }

    public static void customCrash() {
        // TODO

    }

    public static void capturedExcetion(CrashReportInterface reporter) {
        try {
            nullPointCrash();
        }
        catch (NullPointerException e1){
            e1.printStackTrace();
            reporter.report(e1);
        }
    }
}
