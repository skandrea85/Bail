package com.example.andrea.basilicatanascosta;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class titleAdapter extends ArrayAdapter<Item> {



        public titleAdapter(Context context, ArrayList<Item> item) {
            super(context, 0, item);



        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // Check if an existing view is being reused, otherwise inflate the view
            View listItemView = convertView;
            if (listItemView == null) {
                listItemView = LayoutInflater.from(getContext()).inflate(
                        R.layout.name_list, parent, false);
            }

            Item currentItem = getItem(position);

            TextView titleTextView = (TextView) listItemView.findViewById(R.id.title_name);

           titleTextView.setText(currentItem.getName());




            return listItemView;

        }
    }

