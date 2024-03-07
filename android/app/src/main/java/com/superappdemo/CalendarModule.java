package com.superappdemo;

import android.content.Intent;
import android.util.Log;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.unity3d.player.UnityPlayerActivity;

public class CalendarModule extends ReactContextBaseJavaModule {
    CalendarModule(ReactApplicationContext context) {
        super(context);
    }

    @NonNull
    @Override
    public String getName() {
        return "CalendarModule";
    }

    @ReactMethod
    public void createCalendarEvent() {
        Log.d("CalendarModule", "Create event called with name: " );
        Intent intent = new Intent(getCurrentActivity(), UnityPlayerActivity.class);
        getCurrentActivity().startActivity(intent);
    }
}
