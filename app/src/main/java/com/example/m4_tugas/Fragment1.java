package com.example.m4_tugas;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class Fragment1 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private EditText userEt;
    private EditText passwordEt;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_1, container, false);

        userEt = view.findViewById(R.id.et_username);
        passwordEt = view.findViewById(R.id.et_password);


        Button loginButton = view.findViewById(R.id.login);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToSuccessLogin();
            }
        });

        Button registerButton = view.findViewById(R.id.BTN_register);
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                navigateToRegister();

            }
        });
        return view;
    }

    private void navigateToSuccessLogin() {
        String username = userEt.getText().toString();
        String password = passwordEt.getText().toString();

        Bundle bundle = new Bundle();
        bundle.putString("username", username);
        bundle.putString("password", password);

        Fragment3 fragment3 = new Fragment3();
        fragment3.setArguments(bundle);

        getParentFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, fragment3)
                .addToBackStack(null)
                .commit();
    }
    private void navigateToRegister() {
        Fragment2 fragment2 = new Fragment2();

        getParentFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, fragment2)
                .addToBackStack(null)
                .commit();
    }
}