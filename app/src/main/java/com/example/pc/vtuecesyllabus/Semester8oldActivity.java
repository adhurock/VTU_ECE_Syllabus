package com.example.pc.vtuecesyllabus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;



public class Semester8oldActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester8old);

        defineButtons();

    }


    public void defineButtons() {

        findViewById(R.id.wcold).setOnClickListener(buttonClickListener);
        findViewById(R.id.dssold).setOnClickListener(buttonClickListener);
        findViewById(R.id.dsmold).setOnClickListener(buttonClickListener);
        findViewById(R.id.nsold).setOnClickListener(buttonClickListener);
        findViewById(R.id.onold).setOnClickListener(buttonClickListener);
        findViewById(R.id.hpold).setOnClickListener(buttonClickListener);
        findViewById(R.id.ieold).setOnClickListener(buttonClickListener);
        findViewById(R.id.mcsold).setOnClickListener(buttonClickListener);
        findViewById(R.id.rtosold).setOnClickListener(buttonClickListener);
        findViewById(R.id.gsmold).setOnClickListener(buttonClickListener);
        findViewById(R.id.awnold).setOnClickListener(buttonClickListener);
        findViewById(R.id.ocold).setOnClickListener(buttonClickListener);


    }


    private View.OnClickListener buttonClickListener = new View.OnClickListener() {

        @Override

        public void onClick(View view) {

            switch (view.getId()) {

                case R.id.wcold:
                    startActivity(new Intent(Semester8oldActivity.this, Sem8wcoldActivity.class));

                    break;

                case R.id.dssold:

                    startActivity(new Intent(Semester8oldActivity.this, Sem8dssoldActivity.class));

                    break;

                case R.id.dsmold:

                    startActivity(new Intent(Semester8oldActivity.this, Sem8dsoldActivity.class));

                    break;

                case R.id.nsold:
                    startActivity(new Intent(Semester8oldActivity.this, Sem8nsoldActivity.class));

                    break;

                case R.id.onold:
                    startActivity(new Intent(Semester8oldActivity.this, Sem8onoldActivity.class));

                    break;
                case R.id.hpold:
                    startActivity(new Intent(Semester8oldActivity.this, Sem8hpoldActivity.class));

                    break;

                case R.id.ieold:
                    startActivity(new Intent(Semester8oldActivity.this, Sem8ieoldActivity.class));

                    break;
                case R.id.mcsold:
                    startActivity(new Intent(Semester8oldActivity.this, Sem8mucoldActivity.class));

                    break;

                case R.id.rtosold:
                    startActivity(new Intent(Semester8oldActivity.this, Sem8rtosoldActivity.class));

                    break;

                case R.id.gsmold:
                    startActivity(new Intent(Semester8oldActivity.this, Sem8gsmoldActivity.class));

                    break;

                case R.id.awnold:
                    startActivity(new Intent(Semester8oldActivity.this, Sem8adhocoldActivity.class));

                    break;

                case R.id.ocold:
                    startActivity(new Intent(Semester8oldActivity.this, Sem8ocoldActivity.class));

                    break;



            }

        }


    };

}



