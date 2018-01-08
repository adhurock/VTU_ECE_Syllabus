package com.example.pc.vtuecesyllabus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
//import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        defineButtons();

    }


    public void defineButtons() {


        findViewById(R.id.semester3).setOnClickListener(buttonClickListener);
        findViewById(R.id.semester4).setOnClickListener(buttonClickListener);
        findViewById(R.id.semester5).setOnClickListener(buttonClickListener);
        findViewById(R.id.semester6).setOnClickListener(buttonClickListener);
        findViewById(R.id.semester7).setOnClickListener(buttonClickListener);
        findViewById(R.id.semester8).setOnClickListener(buttonClickListener);
    }


    private View.OnClickListener buttonClickListener = new View.OnClickListener() {

        @Override

        public void onClick(View view) {

            switch (view.getId()) {



                case R.id.semester3:

                    startActivity(new Intent(Main2Activity.this, Semester3cbcsActivity.class));

                    break;

                case R.id.semester4:

                    startActivity(new Intent(Main2Activity.this, Semester4cbcsActivity.class));

                    break;

                case R.id.semester5:
                    startActivity(new Intent(Main2Activity.this, Semester5cbcsActivity.class));

                    break;

                case R.id.semester6:
                    startActivity(new Intent(Main2Activity.this, Semester6cbcsActivity.class));

                    break;

                case R.id.semester7:
                    Toast.makeText(Main2Activity.this, "Content will be added shortly:))", Toast.LENGTH_SHORT).show();

                    break;

                case R.id.semester8:
                    Toast.makeText(Main2Activity.this, "Content will be added shortly:))", Toast.LENGTH_SHORT).show();

                    break;

            }

        }


    };

}






