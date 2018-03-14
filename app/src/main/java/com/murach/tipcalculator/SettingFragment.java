package com.murach.tipcalculator;

import android.app.Activity;
import android.os.Bundle;
import android.preference.PreferenceFragment;

public class SettingFragment extends PreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //load the preference from the xml resource
        addPreferencesFromResource(R.xml.preferences);

        //display the fragment as the main content
        getFragmentManager().beginTransaction()
                .replace(android.R.id.content, new SettingFragment())
                .commit();

    }


}
