package com.example.andrea.bailicata;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlacesAdapter extends ArrayAdapter<Places> {


    public PlacesAdapter(Context context, ArrayList<Places> words) {
        super(context, 0, words);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.attraction_layout, parent, false);
        }
        Places currentPlaces = getItem(position);
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title_text);
        titleTextView.setText(currentPlaces.getSite());
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_view);
        imageView.setImageResource(currentPlaces.getImage());
        TextView descriptionText = (TextView) listItemView.findViewById(R.id.description_view);
        descriptionText.setText(currentPlaces.getDescription());
        TextView infoText = (TextView) listItemView.findViewById(R.id.info_view);
        infoText.setText(currentPlaces.getInfo());
        TextView mapText = (TextView) listItemView.findViewById(R.id.map_view);
        mapText.setText(currentPlaces.getMap());
        return listItemView;

    }
}
