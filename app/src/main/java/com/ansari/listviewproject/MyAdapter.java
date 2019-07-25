package com.ansari.listviewproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {

    String[] countries;
    int[] imageIds;
    Context context;
    LayoutInflater inflater;

    public MyAdapter(String[] countries, int[] imageIds, Context context) {
        this.countries = countries;
        this.imageIds = imageIds;
        this.context = context;

        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return countries.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView tv;
        ImageView iv;
        View view = inflater.inflate(R.layout.item_layout,null);

        tv = view.findViewById(R.id.textViewItem);
        iv = view.findViewById(R.id.imageViewItem);

        tv.setText(countries[position]);
        iv.setImageResource(imageIds[position]);


        return view;
    }
}
