package com.example.michaelburgener_ceng319_lab1;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link bottom#newInstance} factory method to
 * create an instance of this fragment.
 */
public class bottom extends Fragment {

    public TextView textView;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public bottom() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment bottom.
     */
    // TODO: Rename and change types and number of parameters
    public static bottom newInstance(String param1, String param2) {
        bottom fragment = new bottom();
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
        View view = inflater.inflate(R.layout.fragment_bottom, container, false);

        textView = (TextView) view.findViewById(R.id.botTextView);
        textView.setTextColor(Color.MAGENTA);
        textView.setBackgroundColor(Color.GRAY);
        appendTextView(getResources().getString(R.string.mainactivity));
        Toast.makeText(getContext(), getResources().getString(R.string.oncreateview_bot), Toast.LENGTH_SHORT).show();
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        Toast.makeText(getContext(), getResources().getString(R.string.onstart_bot),Toast.LENGTH_SHORT).show();
    }

    public void appendTextView(String s){
        textView.append(s+"\n");
    }


}