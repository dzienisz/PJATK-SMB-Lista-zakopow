package com.dzieniszewski.listazakupw;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ListActivity extends Activity {

    SharedPreferences preferences;
    View root;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        preferences = PreferenceManager.getDefaultSharedPreferences(this);
        root = findViewById(R.id.list_activity);

        root.setBackgroundColor(Color.parseColor(preferences.getString("color", "WHITE")));


        final ListView listview = findViewById(R.id.listview);

        final ArrayList<Product> list = new ArrayList<>();

        list.add(new Product("Mercedes", "200.000", 1));
        list.add(new Product("Peugeot", "10.000", 0));
        list.add(new Product("Ferrari", "1.000.000", 0));
        list.add(new Product("Mercedes", "200.000", 0));
        list.add(new Product("Peugeot", "10.000", 0));
        list.add(new Product("Ferrari", "1.000.000", 0));
        list.add(new Product("Mercedes", "200.000", 0));
        list.add(new Product("Peugeot", "10.000", 0));
        list.add(new Product("Ferrari", "1.000.000", 0));
        list.add(new Product("Mercedes", "200.000", 0));
        list.add(new Product("Peugeot", "10.000", 0));
        list.add(new Product("Ferrari", "1.000.000", 0));

        final MyArrayAdapter myadapter = new MyArrayAdapter(this, R.layout.activity_product_view, list);
        listview.setAdapter(myadapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                final Product element = (Product) parent.getItemAtPosition(position);
            }
        });
    }
}
