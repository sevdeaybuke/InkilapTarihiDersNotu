package com.sevdeaybuke.inkilaptarihi;

import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        toolbar.setBackgroundColor(getColor(R.color.statusRenk)); /*status renk değiştirme*/
        Window window = getWindow();
        window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT_WATCH) {
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(getResources().getColor(R.color.status_bar));
        }

        /*anasayfa yüklü gelmesi için   */
        if(savedInstanceState==null){

            GirisFragment girisFragment = new GirisFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.blank_fragment, girisFragment).commit();
        }


      /*  FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

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
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }



    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        Fragment fragment = null;
        if (id == R.id.kavramlar) {
            fragment = new Kavramlar();
            ((Kavramlar) fragment).id = 4;
        } else if (id == R.id.aydinlanma) {
            fragment = new Kavramlar();
            ((Kavramlar) fragment).id = 5;
        } else if (id == R.id.cöküs) {
            fragment = new Kavramlar();
            ((Kavramlar) fragment).id = 6;
        } else if (id == R.id.bir_mesrutiyet) {
            fragment = new Kavramlar();
            ((Kavramlar) fragment).id = 7;
        } else if (id == R.id.iki_mesrutiyet) {
            fragment = new Kavramlar();
            ((Kavramlar) fragment).id = 8;
        } else if (id == R.id.fikir_hareketleri) {
            fragment = new Kavramlar();
            ((Kavramlar) fragment).id = 9;
        }else if (id == R.id.trablusgarp) {
            fragment = new Kavramlar();
            ((Kavramlar) fragment).id = 10;
        }else if (id == R.id.usi_antlasmasi) {
            fragment = new Kavramlar();
            ((Kavramlar) fragment).id =11;
        }else if (id == R.id.bir_balkan) {
            fragment = new Kavramlar();
            ((Kavramlar) fragment).id = 12;
        }else if (id == R.id.iki_balkan) {
            fragment = new Kavramlar();
            ((Kavramlar) fragment).id = 13;
        }else if (id == R.id.birinci_dünya) {
            fragment = new Kavramlar();
            ((Kavramlar) fragment).id = 14;
        }else if (id == R.id.birdunya_osmanli) {
            fragment = new Kavramlar();
            ((Kavramlar) fragment).id = 15;
        }else if (id == R.id.mondros) {
            fragment = new Kavramlar();
            ((Kavramlar) fragment).id = 16;
        }else if (id == R.id.cemiyetler) {
            fragment = new Kavramlar();
            ((Kavramlar) fragment).id = 17;
        }else if (id == R.id.isgaller) {
            fragment = new Kavramlar();
            ((Kavramlar) fragment).id = 18;
        }else if (id == R.id.kurtulus_savasi) {
            fragment = new Kavramlar();
            ((Kavramlar) fragment).id = 19;
        }else if (id == R.id.tbmm) {
            fragment = new Kavramlar();
            ((Kavramlar) fragment).id = 20;
        }else if (id == R.id.sevr) {
            fragment = new Kavramlar();
            ((Kavramlar) fragment).id = 21;
        }else if (id == R.id.düzenli_ordu) {
            fragment = new Kavramlar();
            ((Kavramlar) fragment).id = 22;
        }

        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.blank_fragment, fragment).commit();
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
