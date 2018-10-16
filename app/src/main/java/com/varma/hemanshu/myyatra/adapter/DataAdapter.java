package com.varma.hemanshu.myyatra.adapter;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.varma.hemanshu.myyatra.Data;
import com.varma.hemanshu.myyatra.R;

import java.util.ArrayList;

/**
 * Adapter for Data Class
 */
public class DataAdapter extends ArrayAdapter<Data> {

    //View Holder for Efficient Access of Data in getView Method
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

        //ViewHolder instance
        ViewHolder holder;

        View listItem = convertView;
        if (listItem == null) {
            //Inflating the View if it isn't the memory or accessed for first time
            listItem = LayoutInflater.from(getContext()).inflate(R.layout.acitivity_data, parent, false);

            //Storing in an Holder View
            holder = new ViewHolder();
            holder.imageView = (ImageView) listItem.findViewById(R.id.thumbnail_iv);
            holder.nameView = (TextView) listItem.findViewById(R.id.name);
            holder.locationView = (TextView) listItem.findViewById(R.id.location);
            holder.descView = (TextView) listItem.findViewById(R.id.description);
            //A tag to Holder for Accessing when needed again
            listItem.setTag(holder);
        } else {
            //Getting the data using Tag which is initialized when created for first time
            holder = (ViewHolder) listItem.getTag();
        }

        //Getting the Current position in the Data List
        Data currentData = getItem(position);
        //Setting the Views onto the Screen
        holder.imageView.setImageResource(currentData.getImageResourceId());
        holder.nameView.setText(currentData.getName());
        holder.locationView.setText(currentData.getLocation());
        holder.descView.setText(currentData.getDescription());

        return listItem;
    }

}
