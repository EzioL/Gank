package fragment;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ezio.gank.DisplayActivity;
import com.ezio.gank.R;
import java.util.ArrayList;
import adapter.RecyclerAdapter;
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
public class iOSFragment extends Fragment {
    RecyclerView.LayoutManager mLayoutManager;
    private RecyclerView mRecyclerView;
    private RecyclerAdapter mAdapter;
    private ArrayList<Entity> mDadaList ;
    private TypeData mData = null;

    ACache mCache;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fargment_ios,null);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.ios_rv);
        mDadaList = new ArrayList<>();
        mLayoutManager = new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false);
        mCache = ACache.get(getActivity());
        init();
        return view;
    }

    private void init() {
        if (mCache.getAsObject("iOS") != null){
            mData = (TypeData) mCache.getAsObject("Android");
            initData();
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
        Call<TypeData> call = api.data(Api.IOS, 10, 1);
        call.enqueue(new Callback<TypeData>() {
            @Override
            public void onResponse(Call<TypeData> call, Response<TypeData> response) {
                if (response.body() != null) {
                    mData = response.body();
                    mCache.put("iOS",mData);
                    initData();
                }
            }

            @Override
            public void onFailure(Call<TypeData> call, Throwable t) {

            }
        });
    }

    private void initData() {
        mDadaList.addAll(mData.getResults());
        mAdapter = new RecyclerAdapter(getActivity(),mDadaList);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter.setOnItemClickListener(new RecyclerAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
               // Toast.makeText(getActivity(), position+"", Toast.LENGTH_SHORT).show();
                String url = mDadaList.get(position).getUrl();
                Intent intent = new Intent(getActivity(), DisplayActivity.class);
                intent.putExtra("url",url);
                getActivity().startActivity(intent);
            }
        });
       
    }
}
