package com.example.spanishconjugatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.BtnPres);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPres();
            }
        });

        button = (Button)findViewById(R.id.BtnFuture);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFuture();
            }
        });

        button = (Button)findViewById(R.id.BtnPast);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPast();
            }
        });


    }

    public void openPres(){
        Intent intent = new Intent(this, PresentTense.class);
        startActivity(intent);
    }

    public void openFuture(){
        Intent intent = new Intent(this, FutureTense.class);
        startActivity(intent);
    }
    public void openPast(){
        Intent intent = new Intent(this, PastTense.class);
        startActivity(intent);
    }
}
