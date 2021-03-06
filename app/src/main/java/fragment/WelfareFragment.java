package fragment;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.ezio.gank.DisplayActivity;
import com.ezio.gank.R;

import java.util.ArrayList;

import adapter.RecyclerViewAdapter;
import adapter.WelfareAdapter;
import api.Api;
import dada.CacheData;
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
public class WelfareFragment extends Fragment {
    SwipeRefreshLayout swipeRefreshLayout;
    RecyclerView recyclerView;
    boolean isLoading;
    private ArrayList<Entity> data ;

    private WelfareAdapter adapter;
    private Handler handler = new Handler();
    int page = 1;
    ACache mCache;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fargment_welfare,null);

        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView_welf);
        swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.SwipeRefreshLayout_welf);
        data =  new ArrayList<>();
        adapter = new WelfareAdapter(getActivity(), data);
        mCache = ACache.get(getActivity());



        initData();
        initViews();

        return view;
    }
    private void initData() {
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                getData();
            }
        }, 1500);
    }
    private void initViews() {
        swipeRefreshLayout.setColorSchemeColors(R.color.primary);
        swipeRefreshLayout.post(new Runnable() {
            @Override
            public void run() {
                swipeRefreshLayout.setRefreshing(true);
            }
        });
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        page = 1;
                        data.clear();
                        refresh();
                    }
                },2000);
            }
        });
        //new LinearLayoutManager(getActivity());
        //new GridLayoutManager(getActivity(),3);
        //new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        final GridLayoutManager layoutManager = new GridLayoutManager(getActivity(),2);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
            }
            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                int lastVisibleItemPosition = layoutManager.findLastVisibleItemPosition();
                if (lastVisibleItemPosition + 1 == adapter.getItemCount()) {
                    boolean isRefreshing = swipeRefreshLayout.isRefreshing();
                    if (isRefreshing) {
                        adapter.notifyItemRemoved(adapter.getItemCount());
                        return;
                    }
                    if (!isLoading) {
                        isLoading = true;
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                refresh();
                                isLoading = false;
                            }
                        }, 1000);
                    }
                }
            }
        });
        //添加点击事件
        adapter.setOnItemClickListener(new WelfareAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(getActivity(), data.get(position).getWho(), Toast.LENGTH_SHORT).show();
               /* String url = data.get(position).getUrl();
                Intent intent = new Intent(getActivity(), DisplayActivity.class);
                intent.putExtra("url",url);
                getActivity().startActivity(intent);*/
            }

            public void onItemLongClick(View view, int position) {

            }
        });

    }



    private void getData() {
        refresh();
    }
    private void refresh() {
        Retrofit retrofit = new Retrofit
                .Builder()
                .baseUrl("http://gank.io/")// 定义访问的主机地址
                .addConverterFactory(GsonConverterFactory.create())//解析方式
                .build();
        Api api = retrofit.create(Api.class);
        Log.e("page: ", page + "");
        Call<TypeData> call = api.data(Api.Welfare, 10, page++);
        call.enqueue(new Callback<TypeData>() {
            @Override
            public void onResponse(Call<TypeData> call, Response<TypeData> response) {

                data.addAll(response.body().getResults());
                adapter.notifyDataSetChanged();
                swipeRefreshLayout.setRefreshing(false);
                adapter.notifyItemRemoved(adapter.getItemCount());

                //缓存当前请求页数+数据(最开始使用Map,Map不支持序列化)
                //以后进行判断加载
                CacheData cacheData = new CacheData(page,data);
                mCache.put(Api.Welfare, cacheData);
            }
            @Override
            public void onFailure(Call<TypeData> call, Throwable t) {

            }
        });
    }
}
