package com.belatrix.fundamentals;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;

import com.belatrix.fundamentals.ui.fragments.BlankFragment;
import com.belatrix.fundamentals.ui.fragments.BlankFragmentListener;


public class FragmentProgrammingActivity extends AppCompatActivity implements BlankFragmentListener {

    private FrameLayout frameLayoutContainer;
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_programming);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        frameLayoutContainer= (FrameLayout) findViewById(R.id.frameLayoutContainer);
        fragmentManager= getSupportFragmentManager();

        addFragment();
    }

    @Override
    public void actionFragment(Object object) {

    }

    @Override
    public void actionActivityCambiarColor() {

    }

    private void addFragment(){
        BlankFragment blankFragment=new BlankFragment();
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.frameLayoutContainer,blankFragment,"BlankFragment");
        fragmentTransaction.commit();

        //fragmentManager.findFragmentByTag()
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}