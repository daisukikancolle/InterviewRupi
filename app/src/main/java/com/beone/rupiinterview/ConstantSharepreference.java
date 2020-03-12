//package com.beone.rupiinterview;
//
//import android.content.Context;
//import android.os.Build;
//
//import androidx.annotation.RequiresApi;
//
//import java.util.prefs.Preferences;
//
//public class ConstantSharepreference {
//
//  private static Preferences sharedPreferences;
//
//  @RequiresApi(api = Build.VERSION_CODES.Q)
//  public static final Preferences getSharedPreferences(Context context) {
//    if (sharedPreferences == null) {
//     sharedPreferences = new com.beone.rupiinterview.Preferences(context);
//
//    }
//    return sharedPreferences;
//  }
//}
//
