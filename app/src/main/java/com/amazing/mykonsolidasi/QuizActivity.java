package com.amazing.mykonsolidasi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuizActivity extends AppCompatActivity implements View.OnClickListener{
    private Button but1, but2, but3, but4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        but1 = (Button) findViewById(R.id.kuis1);
        but2 = (Button) findViewById(R.id.kuis2);
        but3 = (Button) findViewById(R.id.kuis3);
        but4 = (Button) findViewById(R.id.kuis4);

        but1.setOnClickListener(this);
        but2.setOnClickListener(this);
        but3.setOnClickListener(this);
        but4.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.kuis1 : i = new Intent(this, Quiz1Activity.class);startActivity(i);break;
            case R.id.kuis2 : i = new Intent(this, Quiz2Activity.class);startActivity(i);break;
            case R.id.kuis3 : i = new Intent(this, Quiz3Activity.class);startActivity(i);break;
            case R.id.kuis4 : i = new Intent(this, Quiz4Activity.class);startActivity(i);break;
            default:break;
        }
    }
}
