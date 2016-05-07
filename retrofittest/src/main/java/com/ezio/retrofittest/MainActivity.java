package com.ezio.retrofittest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

import adapter.ListViewAdapter;
import api.Api;
import api.DataType;
import model.DataModel;
import model.Result;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private int page = 1;
    private ArrayList<Result> mDataList;
    private ListView mListView;
    private ListViewAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
    }

    private void initData() {
        mDataList = new ArrayList<>();
        Retrofit retrofit = new Retrofit
                .Builder()
                .baseUrl("http://gank.io/")// 定义访问的主机地址
                .addConverterFactory(GsonConverterFactory.create())//解析方式
                .build();
        Api api = retrofit.create(Api.class);
        Call<DataModel<ArrayList<Result>>> call = api.data(DataType.Benefit, 20, 1);
        //enqueue 异步  execute
        call.enqueue(new Callback<DataModel<ArrayList<Result>>>() {
            @Override
            public void onResponse(Call<DataModel<ArrayList<Result>>> call, Response<DataModel<ArrayList<Result>>> response) {
                if (response != null) {
                    DataModel<ArrayList<Result>> model = response.body();
                    if (model.dataResults ==null){
                        Log.e( "onResponse: ","null" );
                    }
                    mDataList.addAll(model.dataResults);
                    mListView = (ListView) findViewById(R.id.listview);
                    mAdapter = new ListViewAdapter(MainActivity.this, mDataList);
                    mListView.setAdapter(mAdapter);
                }
            }
            @Override
            public void onFailure(Call<DataModel<ArrayList<Result>>> call, Throwable t) {
                Log.e("onFailure: ", t.getMessage());
            }
        });
    }
}

