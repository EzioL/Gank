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


import fragment.AndroidFragment;
import fragment.ExpandFragment;
import fragment.HomeFragment;
import fragment.VideoFragment;
import fragment.WebFragment;
import fragment.WelfareFragment;
import fragment.iOSFragment;

public class HomeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    //声明碎片相关对象
    FragmentManager mFragmentManager;
    FragmentTransaction mFragmentTransaction;
    AndroidFragment mAndroidFragment;
    ExpandFragment mExpandFragment;
    HomeFragment mHomeFragment;
    iOSFragment mIOSFragment;
    VideoFragment mVideoFragment;
    WebFragment mWebFragment;
    WelfareFragment mWelfareFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setTitle("首页");
        mFragmentManager = getFragmentManager();
        initFragments();
        initViews();

    }

    private void initFragments() {

        mFragmentTransaction = mFragmentManager.beginTransaction();

        mHomeFragment = new HomeFragment();
        mFragmentTransaction.add(R.id.content_fl, mHomeFragment);

        mAndroidFragment = new AndroidFragment();
        mFragmentTransaction.add(R.id.content_fl, mAndroidFragment);

        mExpandFragment = new ExpandFragment();
        mFragmentTransaction.add(R.id.content_fl, mExpandFragment);

        mIOSFragment = new iOSFragment();
        mFragmentTransaction.add(R.id.content_fl, mIOSFragment);

        mVideoFragment = new VideoFragment();
        mFragmentTransaction.add(R.id.content_fl, mVideoFragment);

        mWebFragment = new WebFragment();
        mFragmentTransaction.add(R.id.content_fl, mWebFragment);

        mWelfareFragment = new WelfareFragment();
        mFragmentTransaction.add(R.id.content_fl, mWelfareFragment);

        mFragmentTransaction.hide(mHomeFragment);
        mFragmentTransaction.commit();
        hideFragments();
        showFragment(mHomeFragment);
    }

    private void hideFragments() {
        //隐藏所有的碎片，已经初始化和不为空
        mFragmentTransaction = mFragmentManager.beginTransaction();
        mFragmentTransaction.hide(mHomeFragment);
        mFragmentTransaction.hide(mAndroidFragment);
        mFragmentTransaction.hide(mExpandFragment);
        mFragmentTransaction.hide(mIOSFragment);
        mFragmentTransaction.hide(mVideoFragment);
        mFragmentTransaction.hide(mWebFragment);
        mFragmentTransaction.hide(mWelfareFragment);
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
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
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
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        if (id == R.id.nav_main) {
            // Handle the camera action
            hideFragments();
            showFragment(mHomeFragment);
            setTitle("首页");
        } else if (id == R.id.nav_welfare) {
            hideFragments();
            showFragment(mWelfareFragment);
            setTitle("福利");
        }else if (id == R.id.nav_anroid) {
            hideFragments();
            showFragment(mAndroidFragment);
            setTitle("Android");
        }else if (id == R.id.nav_ios) {
            hideFragments();
            showFragment(mIOSFragment);
            setTitle("iOS");
        }else if (id == R.id.nav_web) {
            hideFragments();
            showFragment(mWebFragment);
            setTitle("前端");
        }else if (id == R.id.nav_video) {
            hideFragments();
            showFragment(mVideoFragment);
            setTitle("休息视频");
        }else if (id == R.id.nav_expand) {
            hideFragments();
            showFragment(mExpandFragment);
            setTitle("扩展资源");
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
