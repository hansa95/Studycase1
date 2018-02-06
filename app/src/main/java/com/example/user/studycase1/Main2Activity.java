package com.example.user.studycase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        Intent intent = getIntent();

        String mMenu = intent.getStringExtra(MainActivity.EXTRA_MESSAGE1);
        String mPorsi = intent.getStringExtra(MainActivity.EXTRA_MESSAGE2);
        String buttonText = intent.getStringExtra(MainActivity.EXTRA_MESSAGE3);

        TextView mMenuEditText = (TextView) findViewById(R.id.Menu);
        TextView mPorsiEditText = (TextView) findViewById(R.id.Porsi);
        TextView mbuttonText = (TextView) findViewById(R.id.tempattext);
        TextView mHargaTexview = (TextView) findViewById(R.id.Harga);

        mMenuEditText.setText(mMenu);
        mPorsiEditText.setText(mPorsi);
        mbuttonText.setText(buttonText);


        if (buttonText=="Eatbus"){
            mHargaTexview.setText("60000");

        }

    }
}