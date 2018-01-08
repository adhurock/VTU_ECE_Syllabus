package com.example.pc.vtuecesyllabus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;



public class Semester5oldActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester5old);

        defineButtons();

    }


    public void defineButtons() {

        findViewById(R.id.meold).setOnClickListener(buttonClickListener);
        findViewById(R.id.dspold).setOnClickListener(buttonClickListener);
        findViewById(R.id.acold).setOnClickListener(buttonClickListener);
        findViewById(R.id.mwrold).setOnClickListener(buttonClickListener);
        findViewById(R.id.itcold).setOnClickListener(buttonClickListener);
        findViewById(R.id.cmosold).setOnClickListener(buttonClickListener);
        findViewById(R.id.dspoldlab).setOnClickListener(buttonClickListener);
        findViewById(R.id.acliclab).setOnClickListener(buttonClickListener);



    }


    private View.OnClickListener buttonClickListener = new View.OnClickListener() {

        @Override

        public void onClick(View view) {

            switch (view.getId()) {

                case R.id.meold:
                    startActivity(new Intent(Semester5oldActivity.this, Sem5mneoldActivity.class));

                    break;

                case R.id.dspold:

                    startActivity(new Intent(Semester5oldActivity.this, Sem5dspoldActivity.class));

                    break;

                case R.id.acold:

                    startActivity(new Intent(Semester5oldActivity.this, Sem5acoldActivity.class));

                    break;

                case R.id.mwrold:
                    startActivity(new Intent(Semester5oldActivity.this, Sem5mwroldActivity.class));

                    break;

                case R.id.itcold:
                    startActivity(new Intent(Semester5oldActivity.this, Sem5itcoldActivity.class));

                    break;

                case R.id.cmosold:
                    startActivity(new Intent(Semester5oldActivity.this, Sem5cmosoldActivity.class));

                    break;

                case R.id.dspoldlab:
                    startActivity(new Intent(Semester5oldActivity.this, Sem5dsplaboldActivity.class));

                    break;

                case R.id.acliclab:
                    startActivity(new Intent(Semester5oldActivity.this, Sem5aclaboldActivity.class));

                    break;




            }

        }


    };

}



