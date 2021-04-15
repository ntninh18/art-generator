package com.deeparteffects.examples.android;

import android.os.Bundle;
import android.view.WindowManager;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.ismaeldivita.chipnavigation.ChipNavigationBar;

public class DashBoard extends AppCompatActivity {

    ChipNavigationBar chipNavigationBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_dashboard);

        chipNavigationBar = findViewById(R.id.bott_nav_menu);
        chipNavigationBar.setItemSelected(R.id.bott_nav_menu, true);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new DashBoard_Home_Fragment()).commit();
        bottomMenu();
    }

    private void bottomMenu() {
        chipNavigationBar.setOnItemSelectedListener(new ChipNavigationBar.OnItemSelectedListener() {
            @Override
            public void onItemSelected(int i) {
                Fragment fragment = null;
                switch (i){
                    case R.id.bt_nav_home:
                        fragment = new DashBoard_Home_Fragment();
                        break;
                    case R.id.bt_nav_take_pic:
                        fragment = new DashBoard_Home_Fragment();
                        break;
                    case R.id.bt_nav_setting:
                        fragment = new DashBoard_Home_Fragment();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,fragment).commit();
            }
        });
    }
}
