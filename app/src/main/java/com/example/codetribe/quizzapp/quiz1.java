package com.example.codetribe.quizzapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class quiz1 extends AppCompatActivity {

    Question question = new Question();
    RadioButton a;
    RadioButton b;
    RadioButton c;
    RadioButton d;
    Button score;
    RadioGroup grp1;
    RadioGroup grp2;
    RadioGroup grp3;
    RadioGroup grp4;
    public static int sco = 0;
    int sco1 = 0;
    int sco2 = 0;
    int sco3 = 30;
    int sco4 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz1);

        a = (RadioButton) findViewById(R.id.radioButton4);
        b = (RadioButton) findViewById(R.id.radioButton8);
        c = (RadioButton) findViewById(R.id.radioButton11);
        d = (RadioButton) findViewById(R.id.radioButton13);

        grp1 = (RadioGroup) findViewById(R.id.grp1);
        grp2 = (RadioGroup) findViewById(R.id.grp2);
        grp3 = (RadioGroup) findViewById(R.id.grp3);
        grp4 = (RadioGroup) findViewById(R.id.grp4);

        score = (Button) findViewById(R.id.button);

        score.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Q();
            }
        });
    }

    public void Q() {
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
        Intent i = new Intent(quiz1.this,Main2Activity.class);
        startActivity(i);
    }
}