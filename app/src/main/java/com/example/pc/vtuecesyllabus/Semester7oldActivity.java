package com.example.pc.vtuecesyllabus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;



public class Semester7oldActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester7old);

        defineButtons();

    }


    public void defineButtons() {

        findViewById(R.id.ccnold).setOnClickListener(buttonClickListener);
        findViewById(R.id.ofcold).setOnClickListener(buttonClickListener);
        findViewById(R.id.peold).setOnClickListener(buttonClickListener);
        findViewById(R.id.esdold).setOnClickListener(buttonClickListener);
        findViewById(R.id.vlsilabold).setOnClickListener(buttonClickListener);
        findViewById(R.id.pelabold).setOnClickListener(buttonClickListener);
        findViewById(R.id.daaold).setOnClickListener(buttonClickListener);
        findViewById(R.id.msold).setOnClickListener(buttonClickListener);
        findViewById(R.id.anold).setOnClickListener(buttonClickListener);
        findViewById(R.id.cadold).setOnClickListener(buttonClickListener);
        findViewById(R.id.aeold).setOnClickListener(buttonClickListener);
        findViewById(R.id.spold).setOnClickListener(buttonClickListener);
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

                case R.id.ccnold:
                    startActivity(new Intent(Semester7oldActivity.this, Sem7ccnoldActivity.class));

                    break;

                case R.id.ofcold:

                    startActivity(new Intent(Semester7oldActivity.this, Sem7ofcoldActivity.class));

                    break;

                case R.id.peold:

                    startActivity(new Intent(Semester7oldActivity.this, Sem7pelaboldActivity.class));

                    break;

                case R.id.esdold:
                    startActivity(new Intent(Semester7oldActivity.this, Sem7esoldActivity.class));

                    break;

                case R.id.vlsilabold:
                    startActivity(new Intent(Semester7oldActivity.this, Sem7vlsilaboldActivity.class));

                    break;
                case R.id.pelabold:
                    startActivity(new Intent(Semester7oldActivity.this, Sem7pelaboldActivity.class));

                    break;

                case R.id.daaold:
                    startActivity(new Intent(Semester7oldActivity.this, Sem7dspaoldActivity.class));

                    break;
                case R.id.msold:
                    startActivity(new Intent(Semester7oldActivity.this, Sem7msoldActivity.class));

                    break;

                case R.id.anold:
                    startActivity(new Intent(Semester7oldActivity.this, Sem7anoldActivity.class));

                    break;

                case R.id.cadold:
                    startActivity(new Intent(Semester7oldActivity.this, Sem7vlsioldActivity.class));

                    break;

                case R.id.aeold:
                    startActivity(new Intent(Semester7oldActivity.this, Sem7aesoldActivity.class));

                    break;

                case R.id.spold:
                    startActivity(new Intent(Semester7oldActivity.this, Sem7speecholdActivity.class));

                    break;

                case R.id.pcold:
                    startActivity(new Intent(Semester7oldActivity.this, Sem7pcppoldActivity.class));

                    break;
                case R.id.rtold:
                    startActivity(new Intent(Semester7oldActivity.this, Sem7rtsoldActivity.class));

                    break;
                case R.id.ipold:
                    startActivity(new Intent(Semester7oldActivity.this, Sem7ipoldActivity.class));

                    break;
                case R.id.rfold:
                    startActivity(new Intent(Semester7oldActivity.this, Sem7rfoldActivity.class));

                    break;
                case R.id.wtold:
                    startActivity(new Intent(Semester7oldActivity.this, Sem7wtoldActivity.class));

                    break;
                case R.id.mnold:
                    startActivity(new Intent(Semester7oldActivity.this, Sem7masoldActivity.class));

                    break;

            }

        }


    };

}



