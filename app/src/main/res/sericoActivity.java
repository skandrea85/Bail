package com.example.andrea.basilicatanascosta;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class sericoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_list);

        ArrayList<Places>sericoView = new ArrayList<Places>();
        sericoView.add(new Places (R.string.genzano,R.drawable.monteserico,R.string.MontesericoDescription,R.string.InfoSerico,R.string.MapSerico));
       PlacesAdapter adapter = new PlacesAdapter(this, sericoView);

        ListView listView = (ListView)findViewById (R.id.list);

        listView.setAdapter(adapter);



    }



}
