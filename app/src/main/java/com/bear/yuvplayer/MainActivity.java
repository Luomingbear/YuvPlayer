package com.bear.yuvplayer;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ConfigurationInfo;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by bear on 16-6-6.
 */
public class MainActivity extends Activity{

    private TextView textview;

    private Button   ok;

    private EditText editText_input;

    private EditText editText_output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        //是否支持opengl es 2.0
        textview=(TextView)findViewById(R.id.textView);
        textview.setText(isOpenGLES2(getApplicationContext()));

        //


    }

    public String isOpenGLES2(Context context){
        ActivityManager am = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
        ConfigurationInfo info = am.getDeviceConfigurationInfo();
        if(info.reqGlEsVersion >= 0x20000){
            return "当前手机支持OpenGL ES2.0！";
        }else
            return "当前手机不支持OpenGL ES2.0！";
    }



}
