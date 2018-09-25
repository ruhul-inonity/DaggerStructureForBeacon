package com.sslwireless.beaconappadmin.di.component;

import com.sslwireless.beaconappadmin.BeaconAdminApp;
import com.sslwireless.beaconappadmin.data.PreferenceHelper;
import com.sslwireless.beaconappadmin.di.module.ApplicationModule;
import com.sslwireless.beaconappadmin.di.module.PresenterModule;
import com.sslwireless.beaconappadmin.ui.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by ruhul on 9/26/18.
 */

@Singleton
@Component(modules = {ApplicationModule.class, PresenterModule.class})
public interface ApplicationComponent {
    void inject(BeaconAdminApp beaconAdminApp);
    void inject(PreferenceHelper preferenceHelper);

    void inject(MainActivity mainActivity);


}
