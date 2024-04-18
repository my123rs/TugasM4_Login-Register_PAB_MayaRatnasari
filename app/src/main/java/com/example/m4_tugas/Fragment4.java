package com.example.m4_tugas;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment4 extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_4, container, false);

        Bundle bundle = getArguments();
        if (bundle != null) {
            String username = bundle.getString("username");
            String email = bundle.getString("email");
            String password = bundle.getString("password");

            TextView usernameEt = view.findViewById(R.id.tv_reguser);
            usernameEt.setText("Username : "+username);

            TextView emailEt = view.findViewById(R.id.tv_regemail);
            emailEt.setText("Email : "+email);

            TextView passwordEt = view.findViewById(R.id.tv_regpassword);
            passwordEt.setText("Password : "+password);
        }
        return view;
    }
}