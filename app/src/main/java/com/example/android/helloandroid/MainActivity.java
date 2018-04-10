package com.example.android.helloandroid;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void displayInfo (View view){
        TextView infoTextView = (TextView) findViewById(R.id.address_text);
        if (infoTextView.getVisibility() == 0){
            infoTextView.setVisibility(View.INVISIBLE);
        } else {
            infoTextView.setVisibility(View.VISIBLE);
        }
    }


}

