package com.maldonadofirstapp.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //this method will be called upon button click
    public void onClick (View view) {
        TextView text = (TextView) findViewById(R.id.textView);
        text.setText("Very simple!");

    }
}