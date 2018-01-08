package com.example.pc.vtuecesyllabus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Semester5cbcsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester5cbcs);
        defineButtons();

    }


    public void defineButtons() {

        findViewById(R.id.mnecbcs).setOnClickListener(buttonClickListener);
        findViewById(R.id.dspcbcs).setOnClickListener(buttonClickListener);
        findViewById(R.id.hdlcbcs).setOnClickListener(buttonClickListener);
        findViewById(R.id.itccbcs).setOnClickListener(buttonClickListener);
        findViewById(R.id.necbcs).setOnClickListener(buttonClickListener);
        findViewById(R.id.swfcbcs).setOnClickListener(buttonClickListener);
        findViewById(R.id.oscbcs).setOnClickListener(buttonClickListener);
        findViewById(R.id.eemcbcs).setOnClickListener(buttonClickListener);
        findViewById(R.id.mccbcs).setOnClickListener(buttonClickListener);
        findViewById(R.id.dsplabcbcs).setOnClickListener(buttonClickListener);
        findViewById(R.id.hdllabcbcs).setOnClickListener(buttonClickListener);



    }


    private View.OnClickListener buttonClickListener = new View.OnClickListener() {

        @Override

        public void onClick(View view) {

            switch (view.getId()) {

                case R.id.mnecbcs:
                    startActivity(new Intent(Semester5cbcsActivity.this, Sem5cbcsmneActivity.class));

                    break;

                case R.id.dspcbcs:

                    startActivity(new Intent(Semester5cbcsActivity.this, Sem5cbcsdspActivity.class));

                    break;

                case R.id.hdlcbcs:

                    startActivity(new Intent(Semester5cbcsActivity.this, Sem5cbcsvhdlActivity.class));

                    break;

                case R.id.itccbcs:
                    startActivity(new Intent(Semester5cbcsActivity.this, Sem5cbcsitcActivity.class));

                    break;

                case R.id.necbcs:
                    startActivity(new Intent(Semester5cbcsActivity.this, Sem5cbcsneActivity.class));

                    break;

                case R.id.swfcbcs:
                    startActivity(new Intent(Semester5cbcsActivity.this, Sem5cbcsswfActivity.class));

                    break;

                case R.id.oscbcs:
                    startActivity(new Intent(Semester5cbcsActivity.this, Sem5cbcsosActivity.class));

                    break;

                case R.id.eemcbcs:
                    startActivity(new Intent(Semester5cbcsActivity.this, Sem5cbcseemActivity.class));

                    break;
                case R.id.mccbcs:
                    startActivity(new Intent(Semester5cbcsActivity.this, Sem5cbcsmcActivity.class));

                    break;

                case R.id.dsplabcbcs:
                    startActivity(new Intent(Semester5cbcsActivity.this, Sem5cbcsdsplabActivity.class));

                    break;

                case R.id.hdllabcbcs:
                    startActivity(new Intent(Semester5cbcsActivity.this, Sem5cbcshdllabActivity.class));

                    break;




            }

        }


    };

}




