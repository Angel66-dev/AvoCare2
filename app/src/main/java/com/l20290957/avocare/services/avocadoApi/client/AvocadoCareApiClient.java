package com.l20290957.avocare.services.avocadoApi.client;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class AvocadoCareApiClient {

    private static final String BASE_URL = "http://172.28.192.1:3000/api/v1/";
    private static Retrofit _instance;


    public static Retrofit get_instance(){
        if(_instance==null){
            _instance=new Retrofit.Builder()
                    .baseUrl(AvocadoCareApiClient.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build();
        }
        return _instance;
    }
}
