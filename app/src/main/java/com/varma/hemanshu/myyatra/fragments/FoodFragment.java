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
public class FoodFragment extends Fragment {

    ListView listView;

    public FoodFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_list_view, container, false);

        listView = rootView.findViewById(R.id.list_view);
        //Setting up arrayList
        final ArrayList<Data> dataArray = new ArrayList<>();
        dataArray.add(new Data(R.drawable.chole_bhature_punjab, R.string.name_chole_bhature,
                R.string.location_chole_bhature, R.string.desc_chole_bhature));
        dataArray.add(new Data(R.drawable.butter_chicken_punjab, R.string.name_butter_chicken,
                R.string.location_butter_chicken, R.string.desc_butter_chicken));
        dataArray.add(new Data(R.drawable.biryani_hyderabad, R.string.name_biryani_hyd,
                R.string.location_biryani_hyd, R.string.desc_biryani_hyd));
        dataArray.add(new Data(R.drawable.dhokla_gujarat, R.string.name_dhokla,
                R.string.location_dhokla, R.string.desc_dhokla));
        dataArray.add(new Data(R.drawable.seekh_kebab_lucknow, R.string.name_seekh_kebabs,
                R.string.location_seekh_kebabs, R.string.desc_seekh_kebabs));

        //Adapter for ArrayList
        DataAdapter adapter = new DataAdapter(getActivity(), dataArray);

        listView.setAdapter(adapter);
        return rootView;
    }

}
