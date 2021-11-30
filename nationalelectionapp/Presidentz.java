package com.example.nationalelectionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Presidentz extends AppCompatActivity {
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presidentz);

        TextView Display = findViewById(R.id.textView);
        Bundle bn = getIntent().getExtras();
        String name = bn.getString("key");
        Display.setText(String.valueOf(name));

        Button home=findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent (getApplicationContext (),MainActivity.class);
                startActivity (intent);
            }
        });


    }
}