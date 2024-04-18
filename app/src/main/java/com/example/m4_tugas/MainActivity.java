package com.example.m4_tugas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        showLoginFragment();
//        showRegisterFragment();

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        Fragment1 fragment1 = new Fragment1();
        fragmentTransaction.replace(R.id.fragment_container, fragment1);
        fragmentTransaction.commit();

    }
    }


//    private void showLoginFragment() {
//        Fragment1 loginFragment = new Fragment1();
//        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
//        transaction.replace(R.id.fragment_container, loginFragment);
//        transaction.addToBackStack(null);
//        transaction.commit();
//    }
//
//    public void showRegisterFragment() {
//        Fragment2 registerFragment = new Fragment2();
//        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
//        transaction.replace(R.id.fragment_container, registerFragment);
//        transaction.addToBackStack(null);
//        transaction.commit();
