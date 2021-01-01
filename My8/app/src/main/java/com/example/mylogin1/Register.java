package com.example.mylogin1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.jar.Attributes;

import static androidx.core.content.ContextCompat.startActivity;

public class Register extends AppCompatActivity implements OnClickListener{
    EditText name,email,password;
    Button mRegisterBtn,mLoginBtn;
    String Name,Email,Password;
  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        name = (EditText) findViewById(R.id.editName);
        email = (EditText) findViewById(R.id.editTextTextEmailAddress);
        password =(EditText) findViewById(R.id.editTextTextPassword);
        mRegisterBtn = (Button)findViewById(R.id.button);
        mLoginBtn = (Button)findViewById(R.id.button2);
      mRegisterBtn.setOnClickListener(this);
      mRegisterBtn.setOnClickListener(this);}
      @Override
        public void onClick(View v) {
            if (v==mRegisterBtn){
                UserRegister();
            }else if (v== mLoginBtn){
                startActivity(new Intent(Register.this,
                        login.class));
            }
        }

    private void UserRegister() {Name = name.getText().toString().trim();
        Email = email.getText().toString().trim();
        Password = password.getText().toString().trim();
    }

       }