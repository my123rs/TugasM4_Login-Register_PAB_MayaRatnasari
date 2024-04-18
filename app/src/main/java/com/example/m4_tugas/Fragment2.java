package com.example.m4_tugas;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class Fragment2 extends Fragment {

    private EditText etUser;
    private EditText etEmail;
    private EditText etPassword;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_2, container, false);

        etUser = view.findViewById(R.id.et_regusername);
        etEmail = view.findViewById(R.id.et_regemail);
        etPassword = view.findViewById(R.id.et_regpassword);

        Button loginButton = view.findViewById(R.id.create);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                navigateToSuccessRegister(); }
        });
        Button registerButton = view.findViewById(R.id.BT_login);
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                navigateToLogin(); }
        });
        return view;
    }
    private void navigateToSuccessRegister() {
        String username = etUser.getText().toString();
        String email = etEmail.getText().toString();
        String password = etPassword.getText().toString();

        Bundle bundle = new Bundle();
        bundle.putString("username", username);
        bundle.putString("email", email);
        bundle.putString("password", password);

        Fragment4 fragment4 = new Fragment4();
        fragment4.setArguments(bundle);

        getParentFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, fragment4)
                .addToBackStack(null)
                .commit();
    }
    private void navigateToLogin() {
        Fragment1 fragment1 = new Fragment1();

        getParentFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, fragment1)
                .addToBackStack(null)
                .commit();
    }
}
