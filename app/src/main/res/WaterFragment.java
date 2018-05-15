package com.example.andrea.basilicatanascosta;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
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



        ArrayList<Item> waterName= new ArrayList<Item>();
        waterName.add(new Item(R.string.grotticelle));
        waterName.add(new Item(R.string.pisconi));
        waterName.add(new Item(R.string.Riserva));


        titleAdapter adapter = new titleAdapter(getActivity(), waterName);

        ListView listView = (ListView)rootView.findViewById (R.id.list);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {



                if (position == 0) {
                    //code specific to first list item
                    Intent myIntent = new Intent(view.getContext(), CastleFragment.class);
                    startActivityForResult(myIntent, 0);



                }
                if(position==1){
                    Intent myIntent = new Intent(view.getContext(), malconsiglioActivity.class);
                    startActivityForResult(myIntent, 0);


                }
            }
        });











        return rootView;
    }

}
