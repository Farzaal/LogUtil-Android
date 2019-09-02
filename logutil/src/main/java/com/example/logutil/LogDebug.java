package com.example.logutil;

import android.util.Log;

public class LogDebug {

    private static final String TAG = "LOG_DEBUG_LIBRARY";

    public static void d(String message) {
        Log.d(TAG, message);
    }
}
