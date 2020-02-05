package com.example.nearbycineplex.activities;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.example.nearbycineplex.MainActivity;
import com.example.nearbycineplex.R;
import com.example.nearbycineplex.Validators.InputValidation;
import com.example.nearbycineplex.database.DatabaseHelper;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{


    private final AppCompatActivity activity = LoginActivity.this;

    private TextView linkRegisterTextView;
    private Button loginButton;
    private EditText emailEditText;
    private EditText passwordEditText;
    private TextView emailTextView;
    private TextView passwordTextView;

    private InputValidation inputValidation;
    private DatabaseHelper databaseHelper;

    @Nullable
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //getSupportActionBar().hide();

        getSupportActionBar().setDisplayShowHomeEnabled(true);

        initViews();
        initListeners();
        initObjects();
    }

    private void initViews() {

        emailTextView = findViewById(R.id.emailTextView);
        passwordTextView = findViewById(R.id.passwordTextView);

        emailEditText = findViewById(R.id.emailEditText);
        passwordEditText = findViewById(R.id.passwordEditText);


        linkRegisterTextView = findViewById(R.id.linkRegisterTextView);
        linkRegisterTextView.setOnClickListener(new View.OnClickListener() {
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

    private void initObjects() {
        databaseHelper = new DatabaseHelper(activity);
        inputValidation = new InputValidation(activity);
    }

    private void initListeners() {
        loginButton.setOnClickListener(this);
        linkRegisterTextView.setOnClickListener(this);

    }

//    @Override
//    public void onClick(View v){
//        switch (v.getId()){
//            case R.id.appCompatButtonLogin:
//                verifyFromSQLite();
//                break;
//            case R.id.textViewLinkRegister:
//                Intent intentRegister = new Intent(getApplicationContext(), newregister.class);
//                startActivity(intentRegister);
//                break;
//            default:
//        }
//    }
//
    private void verifyFromSQLite(){
        if (!inputValidation.isInputEditTextFilled(textInputEditTextEmail, textInputLayoutEmail, getString(R.string.error_message_email))) {
            return;
        }
        if (!inputValidation.isInputEditTextEmail(textInputEditTextEmail, textInputLayoutEmail, getString(R.string.error_message_email))) {
            return;
        }
        if (!inputValidation.isInputEditTextFilled(textInputEditTextPassword, textInputLayoutPassword, getString(R.string.error_message_email))) {
            return;
        }

        if (databaseHelper.checkUser(textInputEditTextEmail.getText().toString().trim()
                , textInputEditTextPassword.getText().toString().trim())) {
            Intent accountsIntent = new Intent(activity, Main3Activity.class);
            //accountsIntent.putExtra("EMAIL", textInputEditTextEmail.getText().toString().trim());
            //emptyInputEditText();
            startActivity(accountsIntent);
        } else {
            Snackbar.make(nestedScrollView, getString(R.string.error_valid_email_password), Snackbar.LENGTH_LONG).show();
        }
    }





    private void openMainActivity() {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    private void openRegisterActivity() {

        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);

    }


    @Override
    public void onClick(View v) {

    }
}
