package com.androidtutors.buttonandroidexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //TODO 7 : Add TextView variable with name helloTextView
    private TextView helloTextView;

    //TODO 8: Add Button variable with name clickButton
    private Button clickButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO 9 Use findViewById to link helloTextView to TextView textview-hello

        //TODO 10 Use findViewById to link clickButton to Button button_example

    }
}
