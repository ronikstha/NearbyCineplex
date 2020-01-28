package com.example.nearbycineplex.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.nearbycineplex.MainActivity;
import com.example.nearbycineplex.R;

public class LoginActivity extends AppCompatActivity {


    private final AppCompatActivity activity = LoginActivity.this;

    private Button signupButton;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        signupButton = findViewById(R.id.signupButton);
        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openRegisterActivity();

            }
        });


        loginButton = findViewById(R.id.loginButton);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openMainActivity();

            }
        });
    }


    private void openMainActivity() {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    private void openRegisterActivity() {

        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);

    }


}
