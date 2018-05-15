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
public class Castle extends Fragment {


    public Castle() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.item_list, container, false);
        ArrayList<Places> castleName = new ArrayList<Places>();
        castleName.add(new Places(R.string.malconsiglio, R.drawable.castle_2672317_640, R.string.malconsiglioDescription, R.string.infoMalconsiglio, R.string.mapMalconsiglio));
        castleName.add(new Places(R.string.genzano, R.drawable.castle_2672317_640, R.string.MontesericoDescription, R.string.InfoSerico, R.string.MapSerico));
        castleName.add(new Places(R.string.sichinulfo, R.drawable.castle_2672317_640, R.string.sichinulfoDescription, R.string.infoSichinulfo, R.string.mapSichinulfo));
        PlacesAdapter adapter = new PlacesAdapter(getContext(), castleName);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }

}
