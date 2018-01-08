package com.example.pc.vtuecesyllabus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        defineButtons();

    }


    public void defineButtons() {


        findViewById(R.id.semester3).setOnClickListener(buttonClickListener);
        findViewById(R.id.semester4).setOnClickListener(buttonClickListener);
        findViewById(R.id.semester5).setOnClickListener(buttonClickListener);
        findViewById(R.id.semester6).setOnClickListener(buttonClickListener);
        findViewById(R.id.semester7).setOnClickListener(buttonClickListener);
        findViewById(R.id.semester8).setOnClickListener(buttonClickListener);

    }


    private View.OnClickListener buttonClickListener = new View.OnClickListener() {

        @Override

        public void onClick(View view) {

            switch (view.getId()) {



                case R.id.semester3:

                    startActivity(new Intent(Main3Activity.this, Semester3oldActivity.class));

                    break;

                case R.id.semester4:

                    startActivity(new Intent(Main3Activity.this, Semester4oldActivity.class));

                    break;

                case R.id.semester5:
                    startActivity(new Intent(Main3Activity.this, Semester5oldActivity.class));

                    break;

                case R.id.semester6:
                    startActivity(new Intent(Main3Activity.this, Semester6oldActivity.class));

                    break;

                case R.id.semester7:
                    startActivity(new Intent(Main3Activity.this, Semester7oldActivity.class));

                    break;

                case R.id.semester8:
                    startActivity(new Intent(Main3Activity.this, Semester8oldActivity.class));

                    break;

            }

        }


    };

}







