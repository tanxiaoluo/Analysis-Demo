package com.tanxiaoluo.common.ui;

import android.os.Bundle;
import android.view.View;

import com.tanxiaoluo.common.BaseApplication;
import com.tanxiaoluo.common.R;
import com.tanxiaoluo.common.utils.CrashHelper;

public class CrashActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crash);
    }

    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.btn_crash_null) {
            CrashHelper.nullPointCrash();
        } else if (id == R.id.btn_event_index) {
            CrashHelper.arrayIndexCrash();
        } else if (id == R.id.btn_event_custom) {
            CrashHelper.customCrash();
        } else if (id == R.id.btn_event_catch) {
            if (getApplication() instanceof BaseApplication) {
                if (((BaseApplication) getApplication()).getCrashReporter() != null) {
                    CrashHelper.capturedExcetion(((BaseApplication) getApplication()).getCrashReporter());
                }
            }
        }
    }
}
