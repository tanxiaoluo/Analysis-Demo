package com.tanxiaoluo.common.ui;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.avos.avoscloud.AVException;
import com.avos.avoscloud.AVObject;
import com.avos.avoscloud.SaveCallback;
import com.tanxiaoluo.common.R;
import com.tanxiaoluo.common.utils.OnEventHelper;

import butterknife.OnClick;

public class HomeActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
// 测试 SDK 是否正常工作的代码
        AVObject testObject = new AVObject("TestObject");
        testObject.put("words","Hello World!");
        testObject.saveInBackground(new SaveCallback() {
            @Override
            public void done(AVException e) {
                if(e == null){
                    Log.d("saved","success!");
                }
            }
        });

    }

    public void onClick(View v){
        if (v.getId() == R.id.btn_crash_test) {
            OnEventHelper.onEvent(context, Event.ENTER_CRASH);
            qStartActivity(context,CrashActivity.class);
        } else {
            OnEventHelper.onEvent(context, Event.EMTER_EVENT);
        }
    }
}
