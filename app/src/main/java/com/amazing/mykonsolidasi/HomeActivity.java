package com.amazing.mykonsolidasi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class HomeActivity extends  AppCompatActivity implements View.OnClickListener {

    private CardView bookCard1,bookCard2,bookCard3,bookCard4,bookCard5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        bookCard1 = (CardView) findViewById(R.id.book1);
        bookCard2 = (CardView) findViewById(R.id.book2);
        bookCard3 = (CardView) findViewById(R.id.book3);
        bookCard4 = (CardView) findViewById(R.id.book4);
        bookCard5 = (CardView) findViewById(R.id.book5);

        bookCard1.setOnClickListener(this);
        bookCard2.setOnClickListener(this);
        bookCard3.setOnClickListener(this);
        bookCard4.setOnClickListener(this);
        bookCard5.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent i ;

        switch (v.getId()){
            case R.id.book1 : i = new Intent(this,BookActivity.class);startActivity(i);break;
            case R.id.book2 : i = new Intent(this,Book1Activity.class);startActivity(i);break;
            case R.id.book3 : i = new Intent(this,Book2Activity.class);startActivity(i);break;
            case R.id.book4 : i = new Intent(this,Book3Activity.class);startActivity(i);break;
            case R.id.book5 : i = new Intent(this,Book4Activity.class);startActivity(i);break;

            default:break;
        }

    }
}
