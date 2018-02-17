package com.example.alyarnaud.sadproject;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceView;



/**
 * <!-- class MyArtwork -->
 *
 *
 *
 * @author Alyssa Arnaud
 * Date: 2/14/18
 * Course: CS 301 A
 * Description:  This class draws the Face object on the surface view
 */

/**
 External Citation
 Date: 12 February 2018
 Problem: Forgot how to set up surface view
 Resource: Nux's example code on moodle
 Solution: I used the example code from moodle as an outline.
 */

/**
 External Citation
 Date: 12 February 2018
 Problem: SurfaceView was not drawing on the creen
 Resource: Older student
 Solution: I had to change the XML from a generic surface view to
 one that mapped to my java code
 */


public class MyArtwork extends SurfaceView{


    Face myFace = new Face();

    public MyArtwork(Context context) {
        super(context);
        generalInit();

    }
    public MyArtwork(Context context, AttributeSet attrs) {
        super(context, attrs);
        generalInit();


    }

    public MyArtwork(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        generalInit();


    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        setWillNotDraw(false);
    }
    private void generalInit() {
        setWillNotDraw(false);
    }
    public void randomFace(){
        myFace.randomize();
    }

    public void newHair(Paint newHairColor){
        myFace.setHairColor(newHairColor);
    }
    public Paint whichHairColor(){
        return myFace.getHairColor();

    }
    public Paint whichSkinColor(){
        return myFace.getSkinColor();
    }
    public Paint whichEyeColor(){
        return myFace.getEyeColor();
    }
    /**
     External Citation
     Date: 16 February 2018
     Problem: Face was completely redrawing every time i pressed the random button
     Resource: Nux!
     Solution: I moved my face declaration out of onDraw
     */
    public void onDraw(Canvas canvas)
    //draw face stuff here
    {
        myFace.drawFace(canvas);

    }

}
