package xyz.cruxlab.logprint;

import android.util.Log;

public class SLog {
    public static String TAG = "SLog -->";

    public static void d(String message) {
        Log.d(TAG, message);
    }

    public static void d(int message) {
        Log.d(TAG, message + "");
    }

    public static void d(float message) {
        Log.d(TAG, message + "");
    }

    public static void d(double message) {
        Log.d(TAG, message + "");
    }

    // error log

    public static void e(int message) {
        Log.e(TAG, message + "");
    }

    public static void e(String message) {
        Log.e(TAG, message);
    }


    // with tag

    public static void d(String TAG, String message) {
        Log.d(TAG, message);
    }

    public static void d(String TAG, int message) {
        Log.d(TAG, message + "");
    }

    public static void e(String TAG, int message) {
        Log.e(TAG, message + "");
    }

    public static void e(String TAG, String message) {
        Log.e(TAG, message);
    }
}
