package com.example.pc.vtuecesyllabus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Semester3cbcsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester3cbcs);
        defineButtons();

    }


    public void defineButtons() {

        findViewById(R.id.math3cbcs).setOnClickListener(buttonClickListener);
        findViewById(R.id.aecbcs).setOnClickListener(buttonClickListener);
        findViewById(R.id.decbcs).setOnClickListener(buttonClickListener);
        findViewById(R.id.nacbcs).setOnClickListener(buttonClickListener);
        findViewById(R.id.eicbcs).setOnClickListener(buttonClickListener);
        findViewById(R.id.eecbcs).setOnClickListener(buttonClickListener);
        findViewById(R.id.aeclab).setOnClickListener(buttonClickListener);
        findViewById(R.id.declab).setOnClickListener(buttonClickListener);



    }


    private View.OnClickListener buttonClickListener = new View.OnClickListener() {

        @Override

        public void onClick(View view) {

            switch (view.getId()) {

                case R.id.math3cbcs:
                    startActivity(new Intent(Semester3cbcsActivity.this, Sem3cbcsmath3Activity.class));

                    break;

                case R.id.aecbcs:

                    startActivity(new Intent(Semester3cbcsActivity.this, Sem3cbcsaecActivity.class));

                    break;

                case R.id.decbcs:

                    startActivity(new Intent(Semester3cbcsActivity.this, Sem3cbcsdigitaleleActivity.class));

                    break;

                case R.id.nacbcs:
                    startActivity(new Intent(Semester3cbcsActivity.this, Sem3cbcsnaActivity.class));

                    break;

                case R.id.eicbcs:
                    startActivity(new Intent(Semester3cbcsActivity.this, Sem3cbcseiActivity.class));

                    break;

                case R.id.eecbcs:
                    startActivity(new Intent(Semester3cbcsActivity.this, Sem3cbcsemActivity.class));

                    break;

                case R.id.aeclab:
                    startActivity(new Intent(Semester3cbcsActivity.this, Sem3cbcsaeclab.class));

                    break;

                case R.id.declab:
                    startActivity(new Intent(Semester3cbcsActivity.this, Semester3cbcsdclab.class));

                    break;




            }

        }


    };

}




