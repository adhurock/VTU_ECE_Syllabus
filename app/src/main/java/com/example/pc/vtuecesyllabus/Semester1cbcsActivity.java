package com.example.pc.vtuecesyllabus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Semester1cbcsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester1cbcs);
        defineButtons();
    }


    public void defineButtons() {

        findViewById(R.id.button1).setOnClickListener(buttonClickListener);
        findViewById(R.id.button2).setOnClickListener(buttonClickListener);
        findViewById(R.id.button3).setOnClickListener(buttonClickListener);
        findViewById(R.id.button4).setOnClickListener(buttonClickListener);
        findViewById(R.id.button5).setOnClickListener(buttonClickListener);


    }


    private View.OnClickListener buttonClickListener = new View.OnClickListener() {

        @Override

        public void onClick(View view) {

            switch (view.getId()) {

                case R.id.button1:
                    startActivity(new Intent(Semester1cbcsActivity.this, Sem1cbcsm1Activity.class));

                    break;

                case R.id.button2:

                    startActivity(new Intent(Semester1cbcsActivity.this, Sem1cbcsm2Activity.class));

                    break;

                case R.id.button3:

                    startActivity(new Intent(Semester1cbcsActivity.this, Sem1phycActivity.class));

                    break;

                case R.id.button4:
                    startActivity(new Intent(Semester1cbcsActivity.this, Sem1checyActivity.class));

                    break;

                case R.id.button5:
                    startActivity(new Intent(Semester1cbcsActivity.this, Sem1lanActivity.class));

                    break;


            }

        }


    };

}



