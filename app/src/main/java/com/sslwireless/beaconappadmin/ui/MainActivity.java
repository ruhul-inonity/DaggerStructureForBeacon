package com.sslwireless.beaconappadmin.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.sslwireless.beaconappadmin.BeaconAdminApp;
import com.sslwireless.beaconappadmin.R;

import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((BeaconAdminApp) getApplication()).getApplicationComponent().inject(this);
        ButterKnife.bind(this);
    }
}
