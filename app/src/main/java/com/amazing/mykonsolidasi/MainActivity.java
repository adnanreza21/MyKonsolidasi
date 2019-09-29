package com.amazing.mykonsolidasi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends  AppCompatActivity implements View.OnClickListener {

    private CardView bookCard,silabusCard,profilCard,quizCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bookCard = (CardView) findViewById(R.id.materi);
        silabusCard = (CardView) findViewById(R.id.silabus);
        profilCard = (CardView) findViewById(R.id.profil);
        quizCard = (CardView) findViewById(R.id.quis);

        bookCard.setOnClickListener(this);
        silabusCard.setOnClickListener(this);
        profilCard.setOnClickListener(this);
        quizCard.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i ;

        switch (v.getId()){
            case R.id.materi : i = new Intent(this,HomeActivity.class);startActivity(i);break;
            case R.id.silabus : i = new Intent(this,SilabusActivity.class);startActivity(i);break;
            case R.id.profil : i = new Intent(this,ProfileActivity.class);startActivity(i);break;
            case R.id.quis : i = new Intent(this,QuizActivity.class);startActivity(i);break;
            default:break;
        }

    }
}
