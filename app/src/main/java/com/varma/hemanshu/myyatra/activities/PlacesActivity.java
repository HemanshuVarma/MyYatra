package com.varma.hemanshu.myyatra.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.varma.hemanshu.myyatra.Data;
import com.varma.hemanshu.myyatra.DataAdapter;
import com.varma.hemanshu.myyatra.R;

import java.util.ArrayList;

public class PlacesActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        listView = findViewById(R.id.list_view);
        //Setting up arrayList
        final ArrayList<Data> dataArray = new ArrayList<>();
        dataArray.add(new Data(R.drawable.taj_mahal, R.string.name_taj_mahal,
                R.string.location_taj_mahal, R.string.desc_taj_mahal));
        dataArray.add(new Data(R.drawable.qutub_minar, R.string.name_qutub_minar,
                R.string.location_qutub_minar, R.string.desc_qutub_minar));
        dataArray.add(new Data(R.drawable.sun_temple, R.string.name_sun_temple,
                R.string.location_sun_temple, R.string.desc_sun_temple));
        dataArray.add(new Data(R.drawable.khajuraho_temple, R.string.name_khajuraho_temple,
                R.string.location_khajuraho_temple, R.string.desc_khajuraho_temple));
        dataArray.add(new Data(R.drawable.mahabodhi_temple, R.string.name_mahabodhi_temple,
                R.string.location_mahabodhi_temple, R.string.desc_mahabodhi_temple));

        //Adapter for ArrayList
        DataAdapter adapter = new DataAdapter(this, dataArray);

        listView.setAdapter(adapter);
    }
}
