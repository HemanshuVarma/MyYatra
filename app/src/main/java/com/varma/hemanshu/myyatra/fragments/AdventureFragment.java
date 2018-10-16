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
public class AdventureFragment extends Fragment {

    ListView listView;

    public AdventureFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_list_view, container, false);

        listView = rootView.findViewById(R.id.list_view);
        //Setting up arrayList
        final ArrayList<Data> dataArray = new ArrayList<>();
        dataArray.add(new Data(R.drawable.skydiving_mysore, R.string.name_skydiving,
                R.string.location_skydiving, R.string.desc_skydiving));
        dataArray.add(new Data(R.drawable.shimla_to_leh, R.string.name_ladakh,
                R.string.location_ladakh, R.string.desc_ladakh));
        dataArray.add(new Data(R.drawable.roopkund_trek, R.string.name_roopkund,
                R.string.location_roopkund, R.string.desc_roopkund));
        dataArray.add(new Data(R.drawable.flyboarding_goa, R.string.name_fly_boarding,
                R.string.location_fly_boarding, R.string.desc_fly_boarding));
        dataArray.add(new Data(R.drawable.parasailing_kerala, R.string.name_parasailing,
                R.string.location_parasailing, R.string.desc_parasailing));

        //Adapter for ArrayList
        DataAdapter adapter = new DataAdapter(getActivity(), dataArray);

        listView.setAdapter(adapter);
        return rootView;
    }

}
