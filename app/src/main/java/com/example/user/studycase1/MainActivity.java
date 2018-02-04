package com.example.user.studycase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    EditText tempatMakan;
    EditText menu;
    EditText Porsi;
    Button eatBus;
    Button Abnormal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    tempatMakan = (EditText) findViewById(R.id.eatbusButton);



    public void returnSugestion(View view) {

        Intent intent = new Intent (this, Main2Activity.class);


        String message = messegeTempat.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);

        startActivityForResult(intent, );
    }
}
