package com.promotion.socialvent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    Button signup_link;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        signup_link = (Button) findViewById(R.id.btn_signup);
        login = (Button) findViewById(R.id.btn_login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginmethod();
            }
        });

        signup_link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signupmethod();
            }
        });

    }

    void loginmethod(){

        Intent gotoHome = new Intent(this, MainActivity.class);
        gotoHome.putExtra("LoginState", true);
        Toast.makeText(LoginActivity.this, "Login Ho gya Bhai", Toast.LENGTH_LONG).show();
        startActivity(gotoHome);
    }

    void signupmethod(){

        Intent gotoSignup = new Intent(this, SignupActivity.class);
        startActivity(gotoSignup);
    }
}