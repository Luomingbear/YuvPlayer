package com.bear.yuvplayer;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ConfigurationInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by bear on 16-6-6.
 */
public class MainActivity extends Activity{

    private TextView textview;

    private Button   button_convert,button_play;

    private EditText editText_input;

    private String   src;   //地址

    private boolean Play=false,Convert=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        //是否支持opengl es 2.0
        textview=(TextView)findViewById(R.id.textView);
        textview.setText(isOpenGLES2(getApplicationContext()));

        //输入视频的地址
        editText_input=(EditText) findViewById(R.id.text_input);

        //转码
        button_convert=(Button)findViewById(R.id.button_convert);
        button_convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //
                src = editText_input.getText().toString();

                Toast.makeText(getApplicationContext(),"Convert!",Toast.LENGTH_SHORT).show();

            }
        });


        //播放
        button_play=(Button)findViewById(R.id.button_play);
        button_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //
                src = editText_input.getText().toString();

                Toast.makeText(getApplicationContext(),"Play!",Toast.LENGTH_SHORT).show();

            }
        });

    }

    //
    public String isOpenGLES2(Context context){
        ActivityManager am = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
        ConfigurationInfo info = am.getDeviceConfigurationInfo();
        if(info.reqGlEsVersion >= 0x20000){
            return "当前手机支持OpenGL ES2.0！";
        }else
            return "当前手机不支持OpenGL ES2.0！";
    }



}
