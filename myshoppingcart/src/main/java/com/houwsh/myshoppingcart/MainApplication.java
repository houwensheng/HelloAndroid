package com.houwsh.myshoppingcart;

import android.app.Application;
import android.graphics.Bitmap;
import android.util.Log;

import java.util.HashMap;

public class MainApplication extends Application {
    private final static String TAG = "MainApplication";
    private static MainApplication mApp;
    public HashMap<String, String> mInfoMap = new HashMap<>();

    public static MainApplication getInstance() {
        return mApp;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mApp = this;
        Log.d(TAG, "onCreate");
    }

    public HashMap<Long, Bitmap> mIconMap = new HashMap<Long, Bitmap>();
}
