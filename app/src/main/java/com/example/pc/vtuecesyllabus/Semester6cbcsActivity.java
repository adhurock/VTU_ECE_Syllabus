package com.example.pc.vtuecesyllabus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Semester6cbcsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester6cbcs);
        defineButtons();
    }
    public void defineButtons() {

        findViewById(R.id.dccbcs).setOnClickListener(buttonClickListener);
        findViewById(R.id.armecbcs).setOnClickListener(buttonClickListener);
        findViewById(R.id.vlsicbcs).setOnClickListener(buttonClickListener);
        findViewById(R.id.ccncbcs).setOnClickListener(buttonClickListener);
        findViewById(R.id.cmccbcs).setOnClickListener(buttonClickListener);
        findViewById(R.id.aspcbcs).setOnClickListener(buttonClickListener);
        findViewById(R.id.anncbcs).setOnClickListener(buttonClickListener);
        findViewById(R.id.dsscbcs).setOnClickListener(buttonClickListener);
        findViewById(R.id.meccbcs).setOnClickListener(buttonClickListener);
        findViewById(R.id.eclabcbcs).setOnClickListener(buttonClickListener);
        findViewById(R.id.cnlabcbcs).setOnClickListener(buttonClickListener);
    }

    private View.OnClickListener buttonClickListener = new View.OnClickListener() {

        @Override

        public void onClick(View view) {

            switch (view.getId()) {

                case R.id.dccbcs:
                    startActivity(new Intent(Semester6cbcsActivity.this, Sem6cbcsdcActivity.class));

                    break;

                case R.id.armecbcs:

                    startActivity(new Intent(Semester6cbcsActivity.this, Sem6cbcsarmneActivity.class));

                    break;

                case R.id.vlsicbcs:

                    startActivity(new Intent(Semester6cbcsActivity.this, Sem6cbcsvlsiActivity.class));

                    break;

                case R.id.ccncbcs:
                    startActivity(new Intent(Semester6cbcsActivity.this, Sem6cbcsccnActivity.class));

                    break;

                case R.id.cmccbcs:
                    startActivity(new Intent(Semester6cbcsActivity.this, Sem6cbcscmcActivity.class));

                    break;

                case R.id.aspcbcs:
                    startActivity(new Intent(Semester6cbcsActivity.this, Sem6cbcsaspActivity.class));

                    break;

                case R.id.anncbcs:
                    startActivity(new Intent(Semester6cbcsActivity.this, Sem6cbcsannActivity.class));

                    break;

                case R.id.dsscbcs:
                    startActivity(new Intent(Semester6cbcsActivity.this, Sem6cbcsdssActivity.class));

                    break;

                case R.id.meccbcs:
                    startActivity(new Intent(Semester6cbcsActivity.this, Sem6cbcsmecActivity.class));

                    break;

                case R.id.eclabcbcs:
                    startActivity(new Intent(Semester6cbcsActivity.this, Sem6cbcseclabActivity.class));

                    break;

                case R.id.cnlabcbcs:
                    startActivity(new Intent(Semester6cbcsActivity.this, Sem6cbcscnlabActivity.class));

                    break;

            }

        }

    };

}




