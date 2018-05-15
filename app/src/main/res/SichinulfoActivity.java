package com.example.andrea.basilicatanascosta;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class SichinulfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_list);

        ArrayList<Places> sichinulfoView = new ArrayList<Places>();
        sichinulfoView.add(new Places (R.string.sichinulfo,R.drawable.grottole,R.string.sichinulfoDescription,R.string.infoSichinulfo,R.string.mapSichinulfo));
        PlacesAdapter adapter = new PlacesAdapter(this, sichinulfoView);

        ListView listView = (ListView)findViewById (R.id.list);

        listView.setAdapter(adapter);


    }
}
