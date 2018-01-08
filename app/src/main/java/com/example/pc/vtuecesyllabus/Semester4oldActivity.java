package com.example.pc.vtuecesyllabus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;



public class Semester4oldActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester4old);

        defineButtons();

    }


    public void defineButtons() {

        findViewById(R.id.math4old).setOnClickListener(buttonClickListener);
        findViewById(R.id.mcold).setOnClickListener(buttonClickListener);
        findViewById(R.id.csold).setOnClickListener(buttonClickListener);
        findViewById(R.id.ssold).setOnClickListener(buttonClickListener);
        findViewById(R.id.hdlold).setOnClickListener(buttonClickListener);
        findViewById(R.id.licold).setOnClickListener(buttonClickListener);
        findViewById(R.id.mcoldlab).setOnClickListener(buttonClickListener);
        findViewById(R.id.hdloldlab).setOnClickListener(buttonClickListener);



    }


    private View.OnClickListener buttonClickListener = new View.OnClickListener() {

        @Override

        public void onClick(View view) {

            switch (view.getId()) {

                case R.id.math4old:
                    startActivity(new Intent(Semester4oldActivity.this, Sem4m4oldActivity.class));

                    break;

                case R.id.mcold:

                    startActivity(new Intent(Semester4oldActivity.this, Sem4mcoldActivity.class));

                    break;

                case R.id.csold:

                    startActivity(new Intent(Semester4oldActivity.this, Sem4csoldActivity.class));

                    break;

                case R.id.ssold:
                    startActivity(new Intent(Semester4oldActivity.this, Sem4ssoldActivity.class));

                    break;

                case R.id.hdlold:
                    startActivity(new Intent(Semester4oldActivity.this, Sem4hdloldActivity.class));

                    break;

                case R.id.licold:
                    startActivity(new Intent(Semester4oldActivity.this, Sem4licoldActivity.class));

                    break;

                case R.id.mcoldlab:
                    startActivity(new Intent(Semester4oldActivity.this, Sem4mclab1oldActivity.class));

                    break;

                case R.id.hdloldlab:
                    startActivity(new Intent(Semester4oldActivity.this, Sem4hdllaboldActivity.class));

                    break;




            }

        }


    };

}



