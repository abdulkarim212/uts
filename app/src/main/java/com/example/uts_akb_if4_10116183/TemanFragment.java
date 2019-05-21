package com.example.uts_akb_if4_10116183;

//tanggal 20 mei 2019
//10116183
//abdul karim malik a
//IF-4

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class TemanFragment extends Fragment {


    public TemanFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_teman, container, false);
        String[] menuItems = {"10101021-Aldy Ferdian-IF4","10101022-Haji Ghofur-IF3","10101023-Jajang Blake-IF3","10101024-Rifal-IF3"
        ,"10101025-Sumarno-IF9"};

        ListView listView = (ListView) view.findViewById(R.id.mainMenu);

        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                menuItems
        );

        listView.setAdapter(listViewAdapter);
        // Inflate the layout for this fragment
        return view;
    }

}
