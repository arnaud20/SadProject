package com.example.alyarnaud.sadproject;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * Created by alyarnaud on 2/16/2018.
 */

public class Hair extends Face {

    int whichHair;
    Paint myHairColor;

    public Hair (int initHair, int initRed, int initGreen, int initBlue){

        whichHair = initHair;
        myHairColor = new Paint();
        myHairColor.setColor(Color.rgb(initRed,initGreen,initBlue));

    }
    public void drawFace(Canvas canvas){

        int hairStyle = whichHair;
        if (hairStyle == 0){
            canvas.drawRect(400.0f,100.0f,1200.0f,400.0f,myHairColor);

        }
        else if (hairStyle == 1){
            canvas.drawCircle(800.0f,300.0f,200.0f,myHairColor);

        }
        else{
            canvas.drawRect(700.0f,100.0f,900.0f,400.0f,myHairColor);

        }

    }
}
