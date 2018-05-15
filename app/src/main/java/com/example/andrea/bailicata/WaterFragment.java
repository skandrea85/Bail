package com.example.andrea.bailicata;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class WaterFragment extends Fragment {
    public WaterFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.item_list, container, false);
        ArrayList<Places> waterName = new ArrayList<Places>();
        waterName.add(new Places(R.string.Lao, R.drawable.lake_2026083_640, R.string.laoDesription, R.string.laoInfo, R.string.laoMap));
        waterName.add(new Places(R.string.Monticchio, R.drawable.lake_2026083_640, R.string.monticchioDescription, R.string.monticchioInfo, R.string.monticchioMao));
        waterName.add(new Places(R.string.Noce, R.drawable.lake_2026083_640, R.string.descriptionNoce, R.string.infoNoce, R.string.noceMap));
        PlacesAdapter adapter = new PlacesAdapter(getContext(), waterName);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }

}
