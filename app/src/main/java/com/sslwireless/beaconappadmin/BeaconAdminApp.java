package com.sslwireless.beaconappadmin;

import android.app.Application;

import com.sslwireless.beaconappadmin.di.component.ApplicationComponent;
import com.sslwireless.beaconappadmin.di.component.DaggerApplicationComponent;
import com.sslwireless.beaconappadmin.di.module.ApplicationModule;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by ruhul on 9/26/18.
 */
public class BeaconAdminApp extends Application {

    public static final String TAG = "BeaconAdminApp";
    public ApplicationComponent mApplicationComponent;
    private static BeaconAdminApp mInstance;

    public ApplicationComponent getApplicationComponent() {
        return mApplicationComponent;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
        mApplicationComponent = initDagger(this);

        Realm.init(this);
        RealmConfiguration realmConfig = new RealmConfiguration.Builder()
                .name("beaconapp.realm")
                .schemaVersion(0)
                .build();
        Realm.setDefaultConfiguration(realmConfig);

    }

    protected ApplicationComponent initDagger(BeaconAdminApp application) {
        return DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(application))
                .build();
    }

    public static synchronized BeaconAdminApp getInstance() {
        return mInstance;
    }
}
