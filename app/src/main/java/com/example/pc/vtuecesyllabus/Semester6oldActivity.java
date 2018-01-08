package com.example.pc.vtuecesyllabus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;



public class Semester6oldActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester6old);

        defineButtons();

    }


    public void defineButtons() {

        findViewById(R.id.dcold).setOnClickListener(buttonClickListener);
        findViewById(R.id.mpold).setOnClickListener(buttonClickListener);
        findViewById(R.id.mecold).setOnClickListener(buttonClickListener);
        findViewById(R.id.apold).setOnClickListener(buttonClickListener);
        findViewById(R.id.osold).setOnClickListener(buttonClickListener);
        findViewById(R.id.adclabold).setOnClickListener(buttonClickListener);
        findViewById(R.id.mplabold).setOnClickListener(buttonClickListener);
        findViewById(R.id.amold).setOnClickListener(buttonClickListener);
        findViewById(R.id.scold).setOnClickListener(buttonClickListener);
        findViewById(R.id.rpold).setOnClickListener(buttonClickListener);
        findViewById(R.id.lpold).setOnClickListener(buttonClickListener);
        findViewById(R.id.cold).setOnClickListener(buttonClickListener);
        findViewById(R.id.dsold).setOnClickListener(buttonClickListener);
        findViewById(R.id.viold).setOnClickListener(buttonClickListener);



    }


    private View.OnClickListener buttonClickListener = new View.OnClickListener() {

        @Override

        public void onClick(View view) {

            switch (view.getId()) {

                case R.id.dcold:
                    startActivity(new Intent(Semester6oldActivity.this, Sem6dcoldActivity.class));

                    break;

                case R.id.mpold:

                    startActivity(new Intent(Semester6oldActivity.this, Sem6mpoldActivity.class));

                    break;

                case R.id.mecold:

                    startActivity(new Intent(Semester6oldActivity.this, Sem6mecoldActivity.class));

                    break;

                case R.id.apold:
                    startActivity(new Intent(Semester6oldActivity.this, Sem6apoldActivity.class));

                    break;

                case R.id.osold:
                    startActivity(new Intent(Semester6oldActivity.this, Sem6osoldActivity.class));

                    break;

                case R.id.adclabold:
                    startActivity(new Intent(Semester6oldActivity.this, Sem6adclaboldActivity.class));

                    break;

                case R.id.mplabold:
                    startActivity(new Intent(Semester6oldActivity.this, Sem6mplaboldActivity.class));

                    break;

                case R.id.amold:
                    startActivity(new Intent(Semester6oldActivity.this, Sem6amoldActivity.class));

                    break;

                case R.id.scold:
                    startActivity(new Intent(Semester6oldActivity.this, Sem6scoldActivity.class));

                    break;

                case R.id.rpold:
                    startActivity(new Intent(Semester6oldActivity.this, Sem6rpoldActivity.class));

                    break;

                case R.id.lpold:
                    startActivity(new Intent(Semester6oldActivity.this, Sem6lpoldActivity.class));

                    break;
                case R.id.cold:
                    startActivity(new Intent(Semester6oldActivity.this, Sem6cppoldActivity.class));

                    break;
                case R.id.dsold:
                    startActivity(new Intent(Semester6oldActivity.this, Sem6dsdoldActivity.class));

                    break;
                case R.id.viold:
                    startActivity(new Intent(Semester6oldActivity.this, Sem6violdActivity.class));

                    break;










            }

        }


    };

}



