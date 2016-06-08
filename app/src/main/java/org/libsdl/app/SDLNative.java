package org.libsdl.app;

/**
 * Created by bear on 16-6-8.
 */
public class SDLNative {
    //导入需要的包
    static {
        System.loadLibrary("SDL2");
        //System.loadLibrary("SDL2_image");
        //System.loadLibrary("SDL2_mixer");
        //System.loadLibrary("SDL2_net");
        //System.loadLibrary("SDL2_ttf");
        //System.loadLibrary("SDL2main");
        System.loadLibrary("SDL2play");
    }

    //初始化
    public native void SDLInit(String inputDir);


//    public native




    //

}
