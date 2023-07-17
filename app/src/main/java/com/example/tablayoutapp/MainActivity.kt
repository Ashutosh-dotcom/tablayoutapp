package com.example.tablayoutapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.tablayoutapp.Adapter.ViewPagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    val tabsArray = arrayOf("Books","Game","Movie")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager =findViewById<ViewPager2>(R.id.viewpager)
        val tablayout= findViewById<TabLayout>(R.id.tablayout)

        val my_adapter = ViewPagerAdapter(
            supportFragmentManager,
            lifecycle
        )
        viewPager.adapter =my_adapter

        TabLayoutMediator(tablayout,viewPager){
            tab,position ->tab.text =tabsArray[position]
        }.attach()
    }
}