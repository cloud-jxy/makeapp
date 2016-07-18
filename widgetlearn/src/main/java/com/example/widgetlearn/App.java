package com.example.widgetlearn;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;

/**
 * Created by Nevermore on 16/7/18.
 */
public class App extends Application {
    public static Context sContext;

    @Override
    public void onCreate() {
        super.onCreate();
        sContext = this;
    }



    public static Context getContext() {
        return sContext;
    }
}
