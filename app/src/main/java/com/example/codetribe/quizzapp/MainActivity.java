package com.example.codetribe.quizzapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnLove, btnEdu, btnFuture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLove = (Button) findViewById(R.id.btnlove);
        btnFuture = (Button) findViewById(R.id.btnfuture);

        btnLove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, quiz1.class);
                startActivity(intent);

            }

        });

//        btnEdu.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Intent intent = new Intent(MainActivity.this, quizz2.class);
//                startActivity(intent);
//
//
//            }
//        });
//
//
       btnFuture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               Intent intent = new Intent(MainActivity.this, Main3Activity.class);
              startActivity(intent);
            }
       });


    }

}