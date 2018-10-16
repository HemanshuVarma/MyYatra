package com.varma.hemanshu.myyatra.activities;


import android.content.DialogInterface;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.varma.hemanshu.myyatra.R;
import com.varma.hemanshu.myyatra.adapter.CategoryAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager pager = (ViewPager) findViewById(R.id.viewPager);

        // Create an adapter that knows which fragment should be shown on each page
        CategoryAdapter adapter = new CategoryAdapter(MainActivity.this, getSupportFragmentManager());

        // Set the adapter onto the view pager
        pager.setAdapter(adapter);

        // Find the tab layout that shows the tabs
        TabLayout tabs = (TabLayout) findViewById(R.id.tabLayout);

        // Connect the tab layout with the view pager. This will
        //   1. Update the tab layout when the view pager is swiped
        //   2. Update the view pager when a tab is selected
        //   3. Set the tab layout's tab names with the view pager's adapter's titles
        //      by calling getPageTitle()
        tabs.setupWithViewPager(pager);

        //Dialog to Greet the User and Tell about the App
        new AlertDialog.Builder(this)
                .setTitle(R.string.app_name)
                .setMessage(R.string.greeting_message)
                .setPositiveButton(android.R.string.yes, null).create().show();
    }

    /**
     * System method invoked when Back Button is pressed.
     * Exit Dialog to Quit App
     */
    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setTitle(R.string.exit_title)
                .setMessage(R.string.exit_message)
                .setNegativeButton(android.R.string.no, null)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface arg0, int arg1) {
                        MainActivity.super.onBackPressed();
                    }
                }).create().show();

    }
}
