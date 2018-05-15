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
public class WoodsFragment extends Fragment {


    public WoodsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.item_list, container, false);
        ArrayList<Places> woodsName = new ArrayList<Places>();
        woodsName.add(new Places(R.string.grotticelle, R.drawable.ic_nature_people_black_24dp, R.string.grotticelleDescription, R.string.groticelleInfo, R.string.grotticelleMap));
        woodsName.add(new Places(R.string.pisconi, R.drawable.ic_nature_people_black_24dp, R.string.pisconiDescription, R.string.pisconiInfo, R.string.pisconiMap));
        woodsName.add(new Places(R.string.Riserva, R.drawable.ic_nature_people_black_24dp, R.string.sanGiulianoDescription, R.string.sangiulianoInfo, R.string.sanGiulianoMap));
        PlacesAdapter adapter = new PlacesAdapter(getActivity(), woodsName);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }

}
