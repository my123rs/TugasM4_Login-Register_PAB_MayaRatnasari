package com.example.m4_tugas;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment3 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_3, container, false);

        Bundle bundle = getArguments();
        if (bundle != null) {
            String username = bundle.getString("username");
            String password = bundle.getString("password");

            TextView usernameEt = view.findViewById(R.id.tv_loguser);
            usernameEt.setText("Username : "+username);

            TextView passwordEt = view.findViewById(R.id.tv_logpassword);
            passwordEt.setText("Password : "+password);
        }
        return view;
    }
}