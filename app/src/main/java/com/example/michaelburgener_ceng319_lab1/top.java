package com.example.michaelburgener_ceng319_lab1;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link top#newInstance} factory method to
 * create an instance of this fragment.
 */
public class top extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public top() {
        // Required empty public constructor

    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment top.
     */
    // TODO: Rename and change types and number of parameters
    public static top newInstance(String param1, String param2) {
        top fragment = new top();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_top, container, false);
        String [] listItems= {"AI Activity", "VR Activity"};
        ListView menu = (ListView) view.findViewById(R.id.topListView);

        ArrayAdapter<String> ListViewAdapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,listItems);
        menu.setAdapter(ListViewAdapter);

        menu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {
                    Intent aiAct = new Intent(getActivity(), aiActivity.class);
                    startActivity(aiAct);
                }
                if (i == 1) {
                    Intent vrAct = new Intent(getActivity(), vrActivity.class);
                    startActivity(vrAct);
                }
            }
        });

        return view;
    }
}