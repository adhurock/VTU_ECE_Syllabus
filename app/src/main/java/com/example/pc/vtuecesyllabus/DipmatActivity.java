package com.example.pc.vtuecesyllabus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DipmatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dipmat);

        defineButtons();

    }


    public void defineButtons() {


        findViewById(R.id.button1).setOnClickListener(buttonClickListener);
        findViewById(R.id.button2).setOnClickListener(buttonClickListener);

    }


    private View.OnClickListener buttonClickListener = new View.OnClickListener() {

        @Override

        public void onClick(View view) {

            switch (view.getId()) {



                case R.id.button1:

                    startActivity(new Intent(DipmatActivity.this, Dipm1Activity.class));

                    break;

                case R.id.button2:

                    startActivity(new Intent(DipmatActivity.this, Dipm2Activity.class));

                    break;


            }

        }


    };

}




