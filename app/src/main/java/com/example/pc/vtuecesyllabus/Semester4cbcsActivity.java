package com.example.pc.vtuecesyllabus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Semester4cbcsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester4cbcs);

        defineButtons();

    }


    public void defineButtons() {

        findViewById(R.id.math4cbcs).setOnClickListener(buttonClickListener);
        findViewById(R.id.mpcbcs).setOnClickListener(buttonClickListener);
        findViewById(R.id.cscbcs).setOnClickListener(buttonClickListener);
        findViewById(R.id.sscbcs).setOnClickListener(buttonClickListener);
        findViewById(R.id.pcscbcs).setOnClickListener(buttonClickListener);
        findViewById(R.id.liccbcs).setOnClickListener(buttonClickListener);
        findViewById(R.id.mplabcbcs).setOnClickListener(buttonClickListener);
        findViewById(R.id.liclab).setOnClickListener(buttonClickListener);



    }


    private View.OnClickListener buttonClickListener = new View.OnClickListener() {

        @Override

        public void onClick(View view) {

            switch (view.getId()) {

                case R.id.math4cbcs:
                    startActivity(new Intent(Semester4cbcsActivity.this, Semester4cbcsm4Activity.class));

                    break;

                case R.id.mpcbcs:

                    startActivity(new Intent(Semester4cbcsActivity.this, Sem4cbcsmpActivity.class));

                    break;

                case R.id.cscbcs:

                    startActivity(new Intent(Semester4cbcsActivity.this, Sem4cbcscontrolsysActivity.class));

                    break;

                case R.id.sscbcs:
                    startActivity(new Intent(Semester4cbcsActivity.this, Sem4cbcsssActivity.class));

                    break;

                case R.id.pcscbcs:
                    startActivity(new Intent(Semester4cbcsActivity.this, Sem4cbcspcsActivity.class));

                    break;

                case R.id.liccbcs:
                    startActivity(new Intent(Semester4cbcsActivity.this, Sem4cbcslicActivity.class));

                    break;

                case R.id.mplabcbcs:
                    startActivity(new Intent(Semester4cbcsActivity.this, Sem4cbcsmplabActivity.class));

                    break;

                case R.id.liclab:
                    startActivity(new Intent(Semester4cbcsActivity.this, Sem4cbcsliclabActivity.class));

                    break;




            }

        }


    };

}




