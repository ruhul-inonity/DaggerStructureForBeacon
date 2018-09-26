package com.sslwireless.beaconappadmin.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.sslwireless.beaconappadmin.BeaconAdminApp;
import com.sslwireless.beaconappadmin.R;

import butterknife.ButterKnife;
import io.realm.Realm;

public class MainActivity extends AppCompatActivity {

    Realm realm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((BeaconAdminApp) getApplication()).getApplicationComponent().inject(this);
        ButterKnife.bind(this);
        realm = Realm.getDefaultInstance();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        realm.close();
    }
}
