package com.dbs.databind;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.dbs.databind.databinding.ActivityMainBinding;

/**
 * Created by windws on 09-Apr-16.
 */
public class MainActivity extends Activity {
    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        UserModel userModel = new UserModel("gitanjli", "de@gms.com", true);
        activityMainBinding.setUser(userModel);

    }
}
