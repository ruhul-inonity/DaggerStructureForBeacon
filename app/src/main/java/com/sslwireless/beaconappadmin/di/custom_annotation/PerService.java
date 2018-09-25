package com.sslwireless.beaconappadmin.di.custom_annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by ruhul on 9/26/18.
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerService {
}
