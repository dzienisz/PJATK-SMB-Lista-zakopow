package com.dzieniszewski.listazakupw;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.EditText;

public class SettingsActivity extends Activity {
    SharedPreferences settings;
    SharedPreferences.Editor editor;

    @SuppressLint("CommitPrefEdits")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        settings = PreferenceManager.getDefaultSharedPreferences(this);
        editor = settings.edit();
        EditText color = findViewById(R.id.editText);
        EditText size = findViewById(R.id.editText2);
        color.setText(settings.getString("color", "RED"));
        size.setText(settings.getString("size", "20"));

        View root = findViewById(R.id.settings_view);
        root.setBackgroundColor(Color.parseColor(color.getText().toString().toLowerCase()));
    }

    public void onClick(View view) {
        EditText color = findViewById(R.id.editText);
        EditText size = findViewById(R.id.editText2);
        editor.putString("color", color.getText().toString());
        editor.putString("size", size.getText().toString());
        editor.apply();
        View root = findViewById(R.id.settings_view);
        root.setBackgroundColor(Color.parseColor(color.getText().toString().toLowerCase()));
        finish();
    }
}
