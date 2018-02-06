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

    public static final String EXTRA_MESSAGE1 =
            "com.example.android.studycase1.extra.MESSAGE1";

    public static final String EXTRA_MESSAGE2 =
            "com.example.android.studycase1.extra.MESSAGE2";

    public static final String EXTRA_MESSAGE3 =
            "com.example.android.studycase1.extra.MESSAGE3";


    private EditText mMenuEditText;
    private EditText mPorsiEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMenuEditText = (EditText) findViewById(R.id.Menu);
        mPorsiEditText = (EditText) findViewById(R.id.Porsi);


    }

    public void returnSugestion(View view) {
        Button mbuttonText = (Button)view;


        Intent intent = new Intent (this,Main2Activity.class);
        String mMenu = mMenuEditText.getText().toString();
        String mPorsi =mPorsiEditText.getText().toString();
        String buttonText = mbuttonText.getText().toString();


        intent.putExtra(EXTRA_MESSAGE1, mMenu);
        intent.putExtra(EXTRA_MESSAGE2, mPorsi);
        intent.putExtra(EXTRA_MESSAGE3, buttonText);

        startActivity(intent);







    }
}

