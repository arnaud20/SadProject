package com.example.alyarnaud.sadproject;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * Created by alyarnaud on 2/16/2018.
 */

public class Skin extends Face {
    Paint mySkinColor;

    public Skin(int initRed, int initGreen, int initBlue) {

        mySkinColor = new Paint();
        mySkinColor.setColor(Color.rgb(initRed, initGreen, initBlue));

    }

    public void drawFace(Canvas canvas) {
        canvas.drawCircle(500.0f, 500.0f, 100.0f, mySkinColor);
        canvas.drawCircle(1100.0f, 500.0f, 100.0f, mySkinColor);
    }
}

