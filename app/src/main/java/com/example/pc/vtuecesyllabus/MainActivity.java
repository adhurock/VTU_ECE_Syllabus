package com.example.pc.vtuecesyllabus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
//import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        defineButtons();

    }


    public void defineButtons() {

        findViewById(R.id.button1).setOnClickListener(buttonClickListener);

        findViewById(R.id.button2).setOnClickListener(buttonClickListener);

        findViewById(R.id.button3).setOnClickListener(buttonClickListener);

        findViewById(R.id.button4).setOnClickListener(buttonClickListener);

    }


    private View.OnClickListener buttonClickListener = new View.OnClickListener() {

        @Override

        public void onClick(View view) {

            switch (view.getId()) {

                case R.id.button1:
                    startActivity(new Intent(MainActivity.this, Main2Activity.class));

                    break;

                case R.id.button2:

                    startActivity(new Intent(MainActivity.this, Main3Activity.class));

                    break;

                case R.id.button3:

                    startActivity(new Intent(MainActivity.this, Main4Activity.class));

                    break;

                case R.id.button4:
                    startActivity(new Intent(MainActivity.this, Main4Activity.class));

                    break;

            }

        }


    };

}






