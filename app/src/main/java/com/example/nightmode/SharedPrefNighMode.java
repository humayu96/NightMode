package com.example.nightmode;

import android.content.Context;
import android.content.SharedPreferences;

class SharedPrefNighMode {

    private SharedPreferences sharedPreferences;


    SharedPrefNighMode(Context context) {
        sharedPreferences = context.getSharedPreferences("filename",Context.MODE_PRIVATE);
    }
    // this method will save the nightMode State : True or False
    void setNightModeState(Boolean state) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean("NightMode",state);
        editor.apply();
    }
    // this method will load the Night Mode State
    Boolean loadNightModeState(){
        return sharedPreferences.getBoolean("NightMode",false);
    }
}
