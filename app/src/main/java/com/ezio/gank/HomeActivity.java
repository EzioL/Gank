package com.ezio.gank;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.design.widget.NavigationView;

import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;


import api.Api;
import fragment.DataFragment;
import fragment.HomeFragment;
import fragment.WelfareFragment;

public class HomeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    //声明碎片相关对象

    FragmentManager mFragmentManager;
    FragmentTransaction mFragmentTransaction;
    DataFragment mAndroidFragment,mExpandFragment,mIOSFragment,
            mVideoFragment,mWebFragment;

    HomeFragment mHomeFragment;
    WelfareFragment mWelfareFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initDefault();
        initViews();

    }

    private void initDefault() {
        setTitle("首页");
        mFragmentManager = getFragmentManager();
        mFragmentTransaction = mFragmentManager.beginTransaction();
        //默认显示首页
        mHomeFragment = new HomeFragment();
        mFragmentTransaction.add(R.id.content_fl, mHomeFragment);
        mFragmentTransaction.commit();
    }

    private void hideAllFragments() {
        mFragmentTransaction = mFragmentManager.beginTransaction();
        //隐藏所有的碎片，首先需要知道碎片是否已经添加到事务中
        if (mHomeFragment != null && mHomeFragment.isAdded()){
            mFragmentTransaction.hide(mHomeFragment);
        }
        if (mAndroidFragment != null && mAndroidFragment.isAdded()){
            mFragmentTransaction.hide(mAndroidFragment);
        }
        if (mExpandFragment != null && mExpandFragment.isAdded()){
            mFragmentTransaction.hide(mExpandFragment);
        }
        if (mIOSFragment != null && mIOSFragment.isAdded()){
            mFragmentTransaction.hide(mIOSFragment);
        }
        if (mVideoFragment != null && mVideoFragment.isAdded()){
            mFragmentTransaction.hide(mVideoFragment);
        }
        if (mWebFragment != null && mWebFragment.isAdded()){
            mFragmentTransaction.hide(mWebFragment);
        }
        if (mWelfareFragment != null && mWelfareFragment.isAdded()){
            mFragmentTransaction.hide(mWelfareFragment);
        }

        mFragmentTransaction.commit();
    }
    private void showFragment(Fragment fragment) {
        //显示Fragment
        mFragmentTransaction = mFragmentManager.beginTransaction();
        mFragmentTransaction.show(fragment);
        mFragmentTransaction.commit();
    }

    private void initViews() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        //隐藏所有已经添加到事务中的碎片
        hideAllFragments();
        //初始化事务
        mFragmentTransaction = mFragmentManager.beginTransaction();
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        if (id == R.id.nav_main) {
            // Handle the camera action
            mFragmentTransaction.show(mHomeFragment);
            setTitle("首页");

        } else if (id == R.id.nav_welfare) {
            if (mWelfareFragment == null){
                mWelfareFragment = new WelfareFragment();
                mFragmentTransaction.add(R.id.content_fl, mWelfareFragment);
            } else {
                mFragmentTransaction.show(mHomeFragment);
            }
            setTitle("福利");
        }else if (id == R.id.nav_anroid) {
            if (mAndroidFragment == null){
                mAndroidFragment = new DataFragment();
                mAndroidFragment.setType(Api.Android);
                mFragmentTransaction.add(R.id.content_fl, mAndroidFragment);
            } else {
                mFragmentTransaction.show(mAndroidFragment);
            }
            setTitle("Android");
        }else if (id == R.id.nav_ios) {
            if (mIOSFragment == null){
                mIOSFragment = new DataFragment();
                mIOSFragment.setType(Api.IOS);
                mFragmentTransaction.add(R.id.content_fl, mIOSFragment);
            } else {
                mFragmentTransaction.show(mIOSFragment);
            }
            setTitle("iOS");
        }else if (id == R.id.nav_web) {
            if (mWebFragment == null){
                mWebFragment = new DataFragment();
                mWebFragment.setType(Api.Web);
                mFragmentTransaction.add(R.id.content_fl, mWebFragment);
            } else {
                mFragmentTransaction.show(mIOSFragment);
            }
            setTitle("前端");
        }else if (id == R.id.nav_video) {
            if (mVideoFragment == null){
                mVideoFragment = new DataFragment();
                mVideoFragment.setType(Api.VideoRest);
                mFragmentTransaction.add(R.id.content_fl, mVideoFragment);
            } else {
                mFragmentTransaction.show(mIOSFragment);
            }
            setTitle("休息视频");
        }else if (id == R.id.nav_expand) {
            if (mExpandFragment == null){
                mExpandFragment = new DataFragment();
                mExpandFragment.setType(Api.Expandresources);
                mFragmentTransaction.add(R.id.content_fl, mExpandFragment);
            } else {
                mFragmentTransaction.show(mIOSFragment);
            }
            setTitle("扩展资源");
        }
        //提交事务
        mFragmentTransaction.commit();
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
