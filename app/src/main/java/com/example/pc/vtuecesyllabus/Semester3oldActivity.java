package com.example.pc.vtuecesyllabus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;



public class Semester3oldActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester3old);

        defineButtons();

    }


    public void defineButtons() {

        findViewById(R.id.math3old).setOnClickListener(buttonClickListener);
        findViewById(R.id.aecold).setOnClickListener(buttonClickListener);
        findViewById(R.id.ldold).setOnClickListener(buttonClickListener);
        findViewById(R.id.naold).setOnClickListener(buttonClickListener);
        findViewById(R.id.eiold).setOnClickListener(buttonClickListener);
        findViewById(R.id.ftold).setOnClickListener(buttonClickListener);
        findViewById(R.id.aecoldlab).setOnClickListener(buttonClickListener);
        findViewById(R.id.ldoldlab).setOnClickListener(buttonClickListener);



    }


    private View.OnClickListener buttonClickListener = new View.OnClickListener() {

        @Override

        public void onClick(View view) {

            switch (view.getId()) {

                case R.id.math3old:
                    startActivity(new Intent(Semester3oldActivity.this, Sem3m3oldActivity.class));

                    break;

                case R.id.aecold:

                    startActivity(new Intent(Semester3oldActivity.this, Sem3aecoldActivity.class));

                    break;

                case R.id.ldold:

                    startActivity(new Intent(Semester3oldActivity.this, Sem3ldoldActivity.class));

                    break;

                case R.id.naold:
                    startActivity(new Intent(Semester3oldActivity.this, Sem3naoldActivity.class));

                    break;

                case R.id.eiold:
                    startActivity(new Intent(Semester3oldActivity.this, Sem3eioldActivity.class));

                    break;

                case R.id.ftold:
                    startActivity(new Intent(Semester3oldActivity.this, Sem3ftoldActivity.class));

                    break;

                case R.id.aecoldlab:
                    startActivity(new Intent(Semester3oldActivity.this, Sem3aeclaboldActivity.class));

                    break;

                case R.id.ldoldlab:
                    startActivity(new Intent(Semester3oldActivity.this, Sem3ldlaboldActivity.class));

                    break;




            }

        }


    };

}



