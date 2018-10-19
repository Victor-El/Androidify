package com.github.victor.androidify;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class TopicAdapter extends ArrayAdapter<Topic> {
    public TopicAdapter(Activity context, ArrayList<Topic> topicsArray) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, topicsArray);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.grid_item_view, parent, false);
        }

        // Get the  object located at this position in the list
        Topic topic = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.main_txt);
        // Get the textView
        // set this text on the name TextView
        nameTextView.setText(topic.getMaintopic());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView numberTextView = (TextView) listItemView.findViewById(R.id.details_txt);
        // Get the textView object and
        // set this text on the number TextView
        numberTextView.setText(topic.getmDetails());

        // so that it can be shown in the ListView
        return listItemView;
    }
}
