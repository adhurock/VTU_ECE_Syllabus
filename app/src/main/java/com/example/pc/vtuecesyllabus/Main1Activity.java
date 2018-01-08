package com.example.pc.vtuecesyllabus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
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
        findViewById(R.id.button8).setOnClickListener(buttonClickListener);
        findViewById(R.id.button9).setOnClickListener(buttonClickListener);
        findViewById(R.id.button10).setOnClickListener(buttonClickListener);




    }


    private View.OnClickListener buttonClickListener = new View.OnClickListener() {

        @Override

        public void onClick(View view) {

            switch (view.getId()) {

                case R.id.button1:
                    startActivity(new Intent(Main1Activity.this, Main2Activity.class));

                    break;

                case R.id.button2:

                    startActivity(new Intent(Main1Activity.this, Main3Activity.class));

                    break;

                case R.id.button3:

                    startActivity(new Intent(Main1Activity.this, Semester1cbcsActivity.class));

                    break;

                case R.id.button4:
                    startActivity(new Intent(Main1Activity.this, DipmatActivity.class));

                    break;

                case R.id.button5:
                    startActivity(new Intent(Main1Activity.this, Ads2Activity.class));

                    break;

                case R.id.button6:
                    startActivity(new Intent(Main1Activity.this, Ads2Activity.class));

                    break;

                case R.id.button7:
                    startActivity(new Intent(Main1Activity.this, CodesActivity.class));
                    break;

                case R.id.button8:
                    startActivity(new Intent(Main1Activity.this, GatesyllabusActivity.class));

                    break;

                case R.id.button9:
                    startActivity(new Intent(Main1Activity.this, Ads3Activity.class));

                    break;

                case R.id.button10:
                    startActivity(new Intent(Main1Activity.this, Ads4Activity.class));

                    break;

            }

        }


    };

}






