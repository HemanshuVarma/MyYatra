package com.varma.hemanshu.myyatra.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.varma.hemanshu.myyatra.R;
import com.varma.hemanshu.myyatra.fragments.AdventureFragment;


public class AdventureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        //Setting up Fragment Adventure Activity
        getSupportFragmentManager().beginTransaction().replace(R.id.category_container, new AdventureFragment()).commit();
    }
}
