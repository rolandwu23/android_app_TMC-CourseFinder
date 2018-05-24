package com.example.lenovo.assign_4;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class home extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    FragmentTransaction fragmentTransaction;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        fragmentTransaction=getFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.fcontent,new home_screen());
        fragmentTransaction.commit();
        getSupportActionBar().setTitle("Home");



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
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



    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

    switch (id){
        case R.id.home:
            fragmentTransaction=getFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fcontent,new home_screen()).addToBackStack(null);
            fragmentTransaction.commit();
            getSupportActionBar().setTitle("Home");

            break;
        case R.id.short_course:
            fragmentTransaction=getFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fcontent,new short_course()).addToBackStack(null);
            fragmentTransaction.commit();
            getSupportActionBar().setTitle("Short Course");

            break;
        case R.id.long_course:
            fragmentTransaction=getFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fcontent,new long_course()).addToBackStack(null);
            fragmentTransaction.commit();
            getSupportActionBar().setTitle("Course By Discipline");

            break;
        case R.id.contact:
            fragmentTransaction=getFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fcontent,new Contact()).addToBackStack(null);
            fragmentTransaction.commit();
            getSupportActionBar().setTitle("Contact");

            break;

    }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
