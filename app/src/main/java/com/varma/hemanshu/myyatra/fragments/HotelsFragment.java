package com.varma.hemanshu.myyatra.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.varma.hemanshu.myyatra.Data;
import com.varma.hemanshu.myyatra.R;
import com.varma.hemanshu.myyatra.adapter.DataAdapter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HotelsFragment extends Fragment {

    ListView listView;

    public HotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_list_view, container, false);

        listView = rootView.findViewById(R.id.list_view);
        //Setting up arrayList
        final ArrayList<Data> dataArray = new ArrayList<>();
        dataArray.add(new Data(R.drawable.taj_falaknuma, R.string.name_taj_falaknuma,
                R.string.location_taj_falaknuma, R.string.desc_taj_falaknuma));
        dataArray.add(new Data(R.drawable.taj_lake_palace, R.string.name_taj_lake,
                R.string.location_taj_lake, R.string.desc_taj_lake));
        dataArray.add(new Data(R.drawable.the_tamara_coorg, R.string.name_tamara_coorg,
                R.string.location_tamara_coorg, R.string.desc_tamara_coorg));
        dataArray.add(new Data(R.drawable.trident_gurgaon, R.string.name_trident,
                R.string.location_trident, R.string.desc_trident));
        dataArray.add(new Data(R.drawable.windflower_hall_shimla, R.string.name_wildflower_shimla,
                R.string.location_wildflower_shimla, R.string.desc_wildflower_shimla));

        //Adapter for ArrayList
        DataAdapter adapter = new DataAdapter(getActivity(), dataArray);

        listView.setAdapter(adapter);
        return rootView;
    }

}
