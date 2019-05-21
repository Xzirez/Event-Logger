package com.example.eventlogger

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.R
import android.support.annotation.NonNull
import android.support.v4.app.Fragment
import android.view.MenuItem


class home_fragment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation)
        bottomNav.setOnNavigationItemSelectedListener(navListener);
    }
    private val navListener = object : BottomNavigationView.OnNavigationItemSelectedListener {
        fun onNavigationItemSelected(item: MenuItem): Boolean {
            var selectedFragment: Fragment? = null

            when (item.getItemId()) {
                R.id.nav_home -> selectedFragment = HomeFragment()
                R.id.nav_favorites -> selectedFragment = FavoritesFragment()
                R.id.nav_search -> selectedFragment = SearchFragment()
            }

            supportFragmentManager.beginTransaction().replace(
                R.id.fragment_container,
                selectedFragment!!
            ).commit()

            return true
        }
    }
}