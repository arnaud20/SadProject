package com.example.alyarnaud.sadproject;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.TextView;


/**
 * <!-- class MainActivity -->
 *
 *
 *
 * @author Alyssa Arnaud
 * Date: 2/14/18
 * Course: CS 301 A
 * Description:  This is the main class that all the other classes interact with
 * Establishes the listeners for the views
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener,
        SeekBar.OnSeekBarChangeListener{

    MyArtwork mySurfaceView;//where the face gets drawn
    Face myFace;//Face object that gets drawn on the screen

    /**
     *  * initializes all of your views and layout to the screen
     *  * @param savedInstanceState    required stuff
     *  */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mySurfaceView = (MyArtwork) findViewById(R.id.surfaceView);
        myFace = new Face();

        //Find the relevant views by ID
        //Register the listeners with those views
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


    }
    /**
     External Citation
     Date: 12 February 2018
     Problem: Forgot how to respond to buttons
     Resource: Nux's example code on moodle
     Solution: I used the example code from moodle as an outline.
     */
    /**
     *  * registers when a button is clicked
     *  * @param wasClicked    the button or view that was interacted with
     *  */
    @Override
    public void onClick(View wasClicked) {
        //figure out which button was clicked
        Button buttonWasClicked = (Button) wasClicked;
        String buttonLabel = (String) buttonWasClicked.getText();

        //Randomize button paints a new face with random hairstyle and colors
        if (buttonLabel.equalsIgnoreCase("Randomize!")) {
            mySurfaceView.randomFace();
            mySurfaceView.invalidate();
        }
    }
    /**
     External Citation
     Date: 12 February 2018
     Problem: I did not know how to put items into a spinner
     Resource: https://www.mkyong.com/android/android-spinner-drop-down-list-example/
     Solution: I made an array in values like it said to
     */
    /**
     External Citation
     Date: 12 February 2018
     Problem: I did not know how radio buttons worked
     Resource: http://journals.ecs.soton.ac.uk/java/tutorial/post1.0/ui/radiobutton.html
     Solution: I copied things from the example code
     */
    /**
     *  * initializes all of you views and layout to the screen
     *  * @param savedInstanceState    required stuff
     *  */
    public void onRadioButtonClicked(View wasClicked) {
        // Is the button now checked?
        boolean checked = ((RadioButton) wasClicked).isChecked();

        // Check which radio button was clicked
        switch(wasClicked.getId()) {
            case R.id.radioButtonHair:
                if (checked)
                    // Change the hair color
                    break;
            case R.id.radioButtonEyes:
                if (checked)
                    // change the eye color
                    mySurfaceView.whichEyeColor();

                    break;
            case R.id.radioButtonSkin:
                if (checked)
                    // change the skin color
                    mySurfaceView.whichSkinColor();
                    break;
        }

    }
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
        //Did not get to using this
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        // Did not get to using this
    }

    /**
     *  * registers when Seekbars are changed
     *  * @param seekbar     which seekbar was moved
     *  * @param progress    how far along the seek bar is dragged
     *  * @param fromUser    checks if it was from the user or something else
     *  */
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



        }


    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        //Do nothing we wont use this method
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        //Do nothing we wont use this method
    }
}