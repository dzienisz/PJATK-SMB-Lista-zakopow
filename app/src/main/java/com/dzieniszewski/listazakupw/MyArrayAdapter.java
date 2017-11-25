package com.dzieniszewski.listazakupw;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MyArrayAdapter extends ArrayAdapter<Product> {

    public ArrayList<Product> data;

    MyArrayAdapter(@NonNull Context context, int resource, ArrayList<Product> list) {
        super(context, resource, list);
        this.data = list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view;

        Product p = this.data.get(position);

        if (convertView == null)
            view = LayoutInflater.from(this.getContext()).inflate(R.layout.activity_product_view, null);
        else view = convertView;

        TextView productName = view.findViewById(R.id.product_name);
        productName.setText(p.getName());

        TextView productPrice = view.findViewById(R.id.product_price);
        productPrice.setText(p.getPrice());

        return view;
    }
}
