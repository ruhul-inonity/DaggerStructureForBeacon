package com.sslwireless.beaconappadmin.data;

import android.content.SharedPreferences;

import javax.inject.Inject;

/**
 * Created by ruhul on 9/26/18.
 */

public class PreferenceHelper implements IPreferenceHelper{
    public static final String PREF_NAME = "BeaconAppAdmin";
    public static final String PREF_KEY_USER_ID = "UserId";

    private final SharedPreferences mPreferenceHelper;

    @Inject
    public PreferenceHelper(SharedPreferences sharedPreferences) {
        mPreferenceHelper = sharedPreferences;
    }

    @Override
    public void setUserId(String userId) {
        mPreferenceHelper.edit().putString(PREF_KEY_USER_ID, userId).apply();
    }

    @Override
    public String getUserId() {
        return mPreferenceHelper.getString(PREF_KEY_USER_ID, null);
    }
}
