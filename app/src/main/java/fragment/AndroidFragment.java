package fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.renderscript.Type;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import com.ezio.gank.R;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import adapter.MyAdapter;
import api.Api;
import dada.Entity;
import dada.TypeData;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import simplecache.ACache;

/**
 * Created by Ezio on 2016/5/7.
 */
public class AndroidFragment extends Fragment {
    ArrayList<Entity> mDadaList ;
    ListView mListView;
    MyAdapter adapter;
    ACache mCache;
    TypeData mData = null;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fargment_android,null);
        mListView = (ListView) view.findViewById(R.id.lv_android);
        mDadaList = new ArrayList<>();
        mCache = ACache.get(getActivity());
        // Requests();
        initData();
        return view;
    }

    private void initData() {

        if (mCache.getAsObject("Android") != null){
            mData = (TypeData) mCache.getAsObject("Android");
            mDadaList.addAll(mData.getResults());
            adapter = new MyAdapter(getActivity(),mDadaList);
            mListView.setAdapter(adapter);
        }else{
            Requests();
        }

    }

    private void Requests() {
        Retrofit retrofit = new Retrofit
                .Builder()
                .baseUrl("http://gank.io/")// 定义访问的主机地址
                .addConverterFactory(GsonConverterFactory.create())//解析方式
                .build();
        Api api = retrofit.create(Api.class);
        Call<TypeData> call = api.data(Api.Android,10,1);
        call.enqueue(new Callback<TypeData>() {
            @Override
            public void onResponse(Call<TypeData> call, Response<TypeData> response) {
                if (response.body()!=null){
                    mData = response.body();
                    mCache.put("Android",mData);
                   // initData();

                    mDadaList.addAll(mData.getResults());
                    adapter = new MyAdapter(getActivity(),mDadaList);
                    mListView.setAdapter(adapter);
                }
            }
            @Override
            public void onFailure(Call<TypeData> call, Throwable t) {
                
            }
        });
    }

}
