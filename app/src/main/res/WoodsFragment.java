package com.example.andrea.basilicatanascosta;


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



        ArrayList<Item> woodsName= new ArrayList<Item>();
        woodsName.add(new Item(R.string.grotticelle));
        woodsName.add(new Item(R.string.pisconi));
        woodsName.add(new Item(R.string.Riserva));


        com.example.andrea.basilicatanascosta.titleAdapter adapter = new com.example.andrea.basilicatanascosta.titleAdapter(getActivity(), woodsName);

        ListView listView = (ListView)rootView.findViewById (R.id.list);

        listView.setAdapter(adapter);











        return rootView;






    }

}
