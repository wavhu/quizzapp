package com.example.codetribe.quizzapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static com.example.codetribe.quizzapp.Main3Activity.sco;

public class Main4Activity extends AppCompatActivity {
    TextView a;
    TextView b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        a= (TextView) findViewById(R.id.textView11);
        b= (TextView) findViewById(R.id.textView12);

        a.setText("score is "+sco);

        if(sco==4){
            b.setText("congra");
        }
        else if(sco==3){
            b.setText("tried");
        }
        else if(sco==2){
            b.setText("atleast");
        }
        else {
            b.setText("dom");
        }
    }
}
