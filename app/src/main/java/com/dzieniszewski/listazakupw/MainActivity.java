package com.dzieniszewski.listazakupw;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;

public class MainActivity extends Activity {

    SharedPreferences preferences;
    View root;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        preferences = PreferenceManager.getDefaultSharedPreferences(this);
        root = findViewById(R.id.main_activity);

        root.setBackgroundColor(Color.parseColor(preferences.getString("color", "WHITE")));
    }

    @Override
    protected void onResume() {
        super.onResume();
        root.setBackgroundColor(Color.parseColor(preferences.getString("color", "WHITE")));
    }

    public void lista(View v) {
        Intent intent1 = new Intent(this, ListActivity.class);
        startActivity(intent1);
    }

    public void opcje(View v) {
        Intent intent1 = new Intent(this, SettingsActivity.class);
        startActivity(intent1);
    }
}
