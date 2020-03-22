package com.example.deliveryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import java.lang.reflect.UndeclaredThrowableException;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        Button createAccountBtn = (Button) findViewById(R.id.createAccountBtn);
        EditText nameEditText = (EditText) findViewById(R.id.nameEditText);
        String name = nameEditText.getText().toString();

        //if (name == "User") {
            createAccountBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent userIntent = new Intent(getApplicationContext(), MakeOrderActivity.class);
                    startActivity(userIntent);
                }
            });
        /*}else if(name == "Driver"){
            createAccountBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent driverIntent = new Intent(getApplicationContext(), AcceptOrderActivity.class);
                    startActivity(driverIntent);
                }
            });
        }else{
            return;
        }*/


        }
    }
