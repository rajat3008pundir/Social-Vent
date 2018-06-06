package com.promotion.socialvent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    boolean loginState = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bundle getLoginState = getIntent().getExtras();
        loginState = getLoginState.getBoolean("LoginState");
        if(loginState == false){
            Intent gotoLogin = new Intent(this, LoginActivity.class);
            startActivity(gotoLogin);

        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        Bundle getLoginState = getIntent().getExtras();
        loginState = getLoginState.getBoolean("LoginState");
    }
}
