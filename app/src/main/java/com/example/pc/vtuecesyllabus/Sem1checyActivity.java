package com.example.pc.vtuecesyllabus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Sem1checyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem1checy);
        defineButtons();
    }


    public void defineButtons() {

        findViewById(R.id.button1).setOnClickListener(buttonClickListener);
        findViewById(R.id.button2).setOnClickListener(buttonClickListener);
        findViewById(R.id.button3).setOnClickListener(buttonClickListener);
        findViewById(R.id.button4).setOnClickListener(buttonClickListener);
        findViewById(R.id.button5).setOnClickListener(buttonClickListener);
        findViewById(R.id.button6).setOnClickListener(buttonClickListener);
        findViewById(R.id.button7).setOnClickListener(buttonClickListener);




    }


    private View.OnClickListener buttonClickListener = new View.OnClickListener() {

        @Override

        public void onClick(View view) {

            switch (view.getId()) {


                case R.id.button1:

                    startActivity(new Intent(Sem1checyActivity.this, Sem12cheActivity.class));

                    break;

                case R.id.button2:
                    startActivity(new Intent(Sem1checyActivity.this, Sem12pcdActivity.class));

                    break;

                case R.id.button3:
                    startActivity(new Intent(Sem1checyActivity.this, Sem12caedActivity.class));

                    break;

                case R.id.button4:
                    startActivity(new Intent(Sem1checyActivity.this, Sem12elnActivity.class));

                    break;

                case R.id.button5:
                    startActivity(new Intent(Sem1checyActivity.this, Sem12enviActivity.class));

                    break;

                case R.id.button6:
                    startActivity(new Intent(Sem1checyActivity.this, Sem12pcdlabActivity.class));

                    break;

                case R.id.button7:

                    startActivity(new Intent(Sem1checyActivity.this, Sem12chelabActivity.class));

                    break;
            }

        }


    };

}
