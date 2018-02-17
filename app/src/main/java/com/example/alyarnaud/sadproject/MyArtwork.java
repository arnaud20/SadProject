package com.example.alyarnaud.sadproject;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceView;

import java.util.Random;

/**
 * Created by alyarnaud on 2/15/2018.
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

    public void onDraw(Canvas canvas)
    //draw face stuff here
    {
        myFace.drawFace(canvas);

    }

}
