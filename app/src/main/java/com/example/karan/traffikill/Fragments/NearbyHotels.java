package com.example.karan.traffikill.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.karan.traffikill.R;
import com.example.karan.traffikill.models.ResultData;

import java.util.ArrayList;

/**
 * Created by Karan on 28-07-2017.
 */

public class NearbyHotels extends Fragment{
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            View rootview;
            rootview = inflater.inflate(R.layout.fragment_nearby_hotels,container,false);

            return rootview;
        }

    public void updateList(ArrayList<ResultData> nearbyPlaces) {

    }
}
