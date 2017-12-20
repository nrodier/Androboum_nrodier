package com.example.android.androboum_nicolasr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bouton = (Button) findViewById(R.id.button);
        bouton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                lancerUser();
            }
        });
    }

    public void lancerUser(){
        Intent intent = new Intent (this, UserActivity.class);
        startActivity(intent);
    }
}
