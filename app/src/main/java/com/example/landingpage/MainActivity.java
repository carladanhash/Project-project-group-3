package com.example.landingpage;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText username;
    EditText password;
    Button loginButton;
    Button createAcountButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        loginButton = findViewById(R.id.loginButton);
        createAcountButton = findViewById(R.id.creataccountButton);


        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("Administrator") && password.getText().toString().equals("SEG2105")){
                    Toast.makeText(MainActivity.this, "You are logged in successfully", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "Incorrect username or password", Toast.LENGTH_SHORT).show();
                }
            }
        });

       /// createAcountButton.setOnClickListener(new View.OnClickListener() {
        ///    @Override
         ///   public void onClick(View view) {
           ///     Intent intent = new Intent(MainActivity.this,CreateAcount.class);
            ///    startActivity(intent);
          ///  }
       /// });

    }
}