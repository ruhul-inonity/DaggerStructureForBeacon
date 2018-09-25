package com.sslwireless.beaconappadmin.di.module;

import android.app.Service;

import dagger.Module;

/**
 * Created by ruhul on 9/26/18.
 */
@Module
public class ServiceModule {

    private final Service mService;

    public ServiceModule(Service service) {
        mService = service;
    }
}
