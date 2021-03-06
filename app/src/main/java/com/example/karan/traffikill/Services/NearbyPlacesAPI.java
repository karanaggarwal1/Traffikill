package com.example.karan.traffikill.Services;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NearbyPlacesAPI {
    public NearbyPlacesClient getNearbyPlacesClient() {
        String BASE_URL = "https://maps.googleapis.com/maps/api/place/nearbysearch/";
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(NearbyPlacesClient.class);
    }

}
