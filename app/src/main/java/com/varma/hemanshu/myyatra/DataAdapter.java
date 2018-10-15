package com.varma.hemanshu.myyatra;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class DataAdapter extends ArrayAdapter<Data> {

    static class ViewHolder {
        ImageView imageView;
        TextView nameView;
        TextView locationView;
        TextView descView;

    }

    public DataAdapter(Activity context, ArrayList<Data> dataArray) {
        super(context, 0, dataArray);


    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        ViewHolder holder;

        View listItem = convertView;
        if (listItem == null) {
            listItem = LayoutInflater.from(getContext()).inflate(R.layout.acitivity_data, parent, false);

            holder = new ViewHolder();
            holder.imageView = (ImageView) listItem.findViewById(R.id.thumbnail_iv);
            holder.nameView = (TextView) listItem.findViewById(R.id.name);
            holder.locationView = (TextView) listItem.findViewById(R.id.location);
            holder.descView = (TextView) listItem.findViewById(R.id.description);
            listItem.setTag(holder);
        } else {
            holder = (ViewHolder) listItem.getTag();
        }
        Data currentData = getItem(position);
        holder.imageView.setImageResource(currentData.getImageResourceId());
        holder.nameView.setText(currentData.getName());
        holder.locationView.setText(currentData.getLocation());
        holder.descView.setText(currentData.getDescription());

        return listItem;
    }

}
