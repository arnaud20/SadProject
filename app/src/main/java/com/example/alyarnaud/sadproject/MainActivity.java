package com.example.alyarnaud.sadproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;

import static com.example.alyarnaud.sadproject.R.id.randomButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    MyArtwork mySurfaceView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mySurfaceView = (MyArtwork) findViewById(R.id.surfaceView);

        Button randomButton = (Button)findViewById(R.id.randomButton);
        randomButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View wasClicked) {
        Button buttonWasClicked = (Button)wasClicked;
        String buttonLabel = (String)buttonWasClicked.getText();

        if (buttonLabel.equalsIgnoreCase("Randomize!"))
        {
            mySurfaceView.randomPaint();
            mySurfaceView.invalidate();
        }
    }
}
