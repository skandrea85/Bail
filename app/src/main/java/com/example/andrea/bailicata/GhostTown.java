package com.example.andrea.bailicata;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class GhostTown extends Fragment {


    public GhostTown() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.item_list, container, false);
        ArrayList<Places> townName = new ArrayList<Places>();
        townName.add(new Places(R.string.Craco, R.drawable.ic_location_city_black_24dp, R.string.cracoDescription, R.string.cracoInfo, R.string.cracoMap));
        townName.add(new Places(R.string.Alianello, R.drawable.ic_location_city_black_24dp, R.string.alinaelloDescription, R.string.alianelloInfo, R.string.alianelloMap));
        townName.add(new Places(R.string.Campomaggiore, R.drawable.ic_location_city_black_24dp, R.string.alinaelloDescription, R.string.alianelloInfo, R.string.mapSichinulfo));
        PlacesAdapter adapter = new PlacesAdapter(getContext(), townName);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }

}
