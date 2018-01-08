package com.example.pc.vtuecesyllabus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Third1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third1);
        defineButtons();
    }


    public void defineButtons() {

        findViewById(R.id.wcold).setOnClickListener(buttonClickListener);
        findViewById(R.id.dssold).setOnClickListener(buttonClickListener);
        findViewById(R.id.dsmold).setOnClickListener(buttonClickListener);
        findViewById(R.id.nsold).setOnClickListener(buttonClickListener);
        findViewById(R.id.onold).setOnClickListener(buttonClickListener);
        findViewById(R.id.hpold).setOnClickListener(buttonClickListener);
        findViewById(R.id.ieold).setOnClickListener(buttonClickListener);
        findViewById(R.id.mcsold).setOnClickListener(buttonClickListener);
        findViewById(R.id.rtosold).setOnClickListener(buttonClickListener);
        findViewById(R.id.gsmold).setOnClickListener(buttonClickListener);
        findViewById(R.id.awnold).setOnClickListener(buttonClickListener);
        findViewById(R.id.ocold).setOnClickListener(buttonClickListener);
        findViewById(R.id.pcold).setOnClickListener(buttonClickListener);
        findViewById(R.id.rtold).setOnClickListener(buttonClickListener);
        findViewById(R.id.ipold).setOnClickListener(buttonClickListener);
        findViewById(R.id.rfold).setOnClickListener(buttonClickListener);
        findViewById(R.id.wtold).setOnClickListener(buttonClickListener);
        findViewById(R.id.mnold).setOnClickListener(buttonClickListener);

    }


    private View.OnClickListener buttonClickListener = new View.OnClickListener() {

        @Override

        public void onClick(View view) {

            switch (view.getId()) {

                case R.id.wcold:
                    startActivity(new Intent(Third1Activity.this, Main2Activity.class));

                    break;

                case R.id.dssold:

                    startActivity(new Intent(Third1Activity.this, Main3Activity.class));

                    break;

                case R.id.dsmold:

                    startActivity(new Intent(Third1Activity.this, Main4Activity.class));

                    break;

                case R.id.nsold:
                    startActivity(new Intent(Third1Activity.this, Main4Activity.class));

                    break;

                case R.id.onold:
                    startActivity(new Intent(Third1Activity.this, Main4Activity.class));

                    break;
                case R.id.hpold:
                    startActivity(new Intent(Third1Activity.this, Main4Activity.class));

                    break;

                case R.id.ieold:
                    startActivity(new Intent(Third1Activity.this, Main4Activity.class));

                    break;
                case R.id.mcsold:
                    startActivity(new Intent(Third1Activity.this, Main4Activity.class));

                    break;

                case R.id.rtosold:
                    startActivity(new Intent(Third1Activity.this, Main4Activity.class));

                    break;

                case R.id.gsmold:
                    startActivity(new Intent(Third1Activity.this, Main4Activity.class));

                    break;

                case R.id.awnold:
                    startActivity(new Intent(Third1Activity.this, Main4Activity.class));

                    break;

                case R.id.ocold:
                    startActivity(new Intent(Third1Activity.this, Main4Activity.class));

                    break;

                case R.id.pcold:
                    startActivity(new Intent(Third1Activity.this, Main4Activity.class));

                    break;
                case R.id.rtold:
                    startActivity(new Intent(Third1Activity.this, Main4Activity.class));

                    break;
                case R.id.ipold:
                    startActivity(new Intent(Third1Activity.this, Main4Activity.class));

                    break;
                case R.id.rfold:
                    startActivity(new Intent(Third1Activity.this, Main4Activity.class));

                    break;
                case R.id.wtold:
                    startActivity(new Intent(Third1Activity.this, Main4Activity.class));

                    break;
                case R.id.mnold:
                    startActivity(new Intent(Third1Activity.this, Main4Activity.class));

                    break;

            }

        }


    };

}



