package com.ezio.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private ArrayList<BaseData> mDataList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // init();
        initDay();
      //  CallAll();

    }

    private void CallAll() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://gank.io/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        Api api = retrofit.create(Api.class);
        Call<data> call = api.defaultAll(10, 1);
        call.enqueue(new Callback<data>() {
            @Override
            public void onResponse(Call<data> call, Response<data> response) {
                 if (response.body() !=null){
                     List<data.ResultsEntity> results = response.body().getResults();
                 }
            }

            @Override
            public void onFailure(Call<data> call, Throwable t) {

            }
        });
    }

    private void initDay() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://gank.io/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        Api api = retrofit.create(Api.class);
        Call<DayData> call = api.day(2016,5,6);
        call.enqueue(new Callback<DayData>() {
            @Override
            public void onResponse(Call<DayData> call, Response<DayData> response) {
                if (response.body() != null){
                    List<String> category = response.body().getCategory();
                }
            }

            @Override
            public void onFailure(Call<DayData> call, Throwable t) {

            }
        });
    }

    private void init() {
        mDataList = new ArrayList<>();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://gank.io/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        Api api = retrofit.create(Api.class);
        Call<BaseModel<ArrayList<BaseData>>> call = api.defaultBenefits(20, 1);
        call.enqueue(new Callback<BaseModel<ArrayList<BaseData>>>() {
            @Override
            public void onResponse(Call<BaseModel<ArrayList<BaseData>>> call, Response<BaseModel<ArrayList<BaseData>>> response) {
                if (response.body() !=null){
                    mDataList.addAll(response.body().results);
                }
            }

            @Override
            public void onFailure(Call<BaseModel<ArrayList<BaseData>>> call, Throwable t) {
                //shibai
            }
        });
    }
}
