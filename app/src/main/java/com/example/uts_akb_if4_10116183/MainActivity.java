package com.example.uts_akb_if4_10116183;

//tanggal 18 mei 2019
//10116183
//abdul karim malik a
//IF-4


import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.annotation.NonNull;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    ProfilFragment profilFragment = new ProfilFragment();
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.content, profilFragment);
                    fragmentTransaction.commit();
                    return true;
                case R.id.navigation_dashboard:
                    KontakFragment kontakFragment = new KontakFragment();
                    FragmentTransaction fragmentkontakTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentkontakTransaction.replace(R.id.content, kontakFragment);
                    fragmentkontakTransaction.commit();
                    return true;
                case R.id.navigation_notifications:
                    TemanFragment temanFragment = new TemanFragment();
                    FragmentTransaction fragmenttemanTransaction = getSupportFragmentManager().beginTransaction();
                    fragmenttemanTransaction.replace(R.id.content, temanFragment);
                    fragmenttemanTransaction.commit();
                    return true;
            }
            return false;
        }
    };

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);

        ProfilFragment profilFragment = new ProfilFragment();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.content, profilFragment);
        fragmentTransaction.commit();

        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        //VIEW PAGER
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PrefManager prefManager = new PrefManager(getApplicationContext());
                prefManager.setFirstTimeLaunch(true);
                startActivity(new Intent(MainActivity.this, WelcomeActivity.class));
                finish();
            }
        });




    }

}
