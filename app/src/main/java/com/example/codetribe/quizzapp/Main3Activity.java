package com.example.codetribe.quizzapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Main3Activity extends AppCompatActivity {


    Question question = new Question();
    RadioButton a;
    RadioButton b;
    RadioButton c;
    RadioButton d;
    Button score;
    public static int sco = 0;
    int sco1 = 0;
    int sco2 = 0;
    int sco3 = 0;
    int sco4 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        a = (RadioButton) findViewById(R.id.radioButton15);
        b = (RadioButton) findViewById(R.id.radioButton19);
        c = (RadioButton) findViewById(R.id.radioButton21);
        d = (RadioButton) findViewById(R.id.radioButton27);

      score= (Button) findViewById(R.id.button);
      score.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Quiz();

          }
      });
    }
    public  void Quiz(){

        question.setQ1(1);
        question.setQ2(0);

        if (a.isChecked()) {
            sco1 = question.getQ1();
        } else {
            sco1 = question.getQ2();
        }
        if (b.isChecked()) {
            sco2 = question.getQ1();
        } else {
            sco2 = question.getQ2();
        }
        if (c.isChecked()) {
            sco3 = question.getQ1();
        } else {
            sco3 = question.getQ2();
        }
        if (d.isChecked()) {
            sco4 = question.getQ1();
        } else {
            sco4 = question.getQ2();
        }
        sco = sco1 + sco2 + sco3 + sco4;
        //Toast.makeText(getApplicationContext(), "score is " + sco, Toast.LENGTH_SHORT).show();
        Intent i = new Intent(Main3Activity.this,Main4Activity.class);
        startActivity(i);
    }
}