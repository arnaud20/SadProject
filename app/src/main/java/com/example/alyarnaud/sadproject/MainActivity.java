package com.example.alyarnaud.sadproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SurfaceView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener,
        SeekBar.OnSeekBarChangeListener{

    MyArtwork mySurfaceView;
    Face artsyFace;
    Hair fancyHair;
    Skin rainbowSkin;
    Eyes crazyEyes;
    int whichRadio = 0;
    int redVal = 0;
    int greenVal = 0;
    int blueVal = 0;


    //Retrieve refs to relevant views
    //Radio Buttons
    //RadioButton hairRB = (RadioButton)findViewById(R.id.radioButtonHair);
    //RadioButton eyesRB = (RadioButton)findViewById(R.id.radioButtonEyes);
    //RadioButton skinRB = (RadioButton)findViewById(R.id.radioButtonSkin);
    //Text views that we'll want to change

    //Spinners
    //Spinner hairSpinner = (Spinner) findViewById(R.id.spinner2);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mySurfaceView = (MyArtwork) findViewById(R.id.surfaceView);
        artsyFace = new Face();

        //Register the listeners with the views
        //Button
        Button randomButton = (Button) findViewById(R.id.randomButton);
        randomButton.setOnClickListener(this);
        //SeekBars
        SeekBar redSB = (SeekBar)findViewById(R.id.seekBarRed);
        redSB.setOnSeekBarChangeListener(this);

        SeekBar blueSB = (SeekBar)findViewById(R.id.seekBarBlue);
        blueSB.setOnSeekBarChangeListener(this);

        SeekBar greenSB = (SeekBar)findViewById(R.id.seekBarGreen);
        greenSB.setOnSeekBarChangeListener(this);
        //Spinners
        //hairSpinner.setOnItemSelectedListener(this);

    }

    @Override
    public void onClick(View wasClicked) {
        Button buttonWasClicked = (Button) wasClicked;
        String buttonLabel = (String) buttonWasClicked.getText();

        if (buttonLabel.equalsIgnoreCase("Randomize!")) {
            artsyFace.randomPaint();
            mySurfaceView.invalidate();
        }
    }
    public void onRadioButtonClicked(View wasClicked) {
        // Is the button now checked?
        boolean checked = ((RadioButton) wasClicked).isChecked();

        // Check which radio button was clicked
        switch(wasClicked.getId()) {
            case R.id.radioButtonHair:
                if (checked)
                    // Change the hair color
                whichRadio = 1;
                    break;
            case R.id.radioButtonEyes:
                if (checked)
                    // change the eye color
                whichRadio = 2;
                    break;
            case R.id.radioButtonSkin:
                if (checked)
                    // change the skin color
                whichRadio = 3;
                    break;
        }
    }
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
       //parent.getItemAtPosition(pos);

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        // Do nothing, not applicable
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

        //initialize the Seek Bars
        SeekBar redSB = (SeekBar)findViewById(R.id.seekBarRed);
        SeekBar greenSB = (SeekBar)findViewById(R.id.seekBarGreen);
        SeekBar blueSB = (SeekBar)findViewById(R.id.seekBarBlue);

        //find the values of the seek bars after theyre moved
        int redVal = redSB.getProgress();
        int greenVal = greenSB.getProgress();
        int blueVal = blueSB.getProgress();

        //change the text views to correspond to the changed seek bars
        TextView blueRGBval = (TextView)findViewById(R.id.textViewBluergb);
        TextView redRGBval = (TextView)findViewById(R.id.textViewRedrgb);
        TextView greenRGBval = (TextView)findViewById(R.id.textViewGreenrgb);


        redRGBval.setText("" + redVal);
        blueRGBval.setText("" + blueVal);
        greenRGBval.setText("" + greenVal);

        if (whichRadio == 1){
            fancyHair = new Hair(1,redVal,blueVal,greenVal);
            mySurfaceView.invalidate();
        }
        else if (whichRadio ==2){
            crazyEyes = new Eyes(redVal,blueVal,greenVal);
            mySurfaceView.invalidate();
        }
        else {
            rainbowSkin = new Skin(redVal,blueVal,greenVal);
            mySurfaceView.invalidate();
        }

        }


    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        //Do nothing we dont care
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        //Do nothing we dont care
    }
}