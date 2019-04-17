package xyz.cruxlab.logprint;

import android.util.Log;

public class SLog {
    private static String TAG = "LogPrint";

    public static void d(String message) {
        Log.d(TAG, message);
    }
}
