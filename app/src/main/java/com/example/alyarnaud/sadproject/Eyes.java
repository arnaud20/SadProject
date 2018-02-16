package com.example.alyarnaud.sadproject;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * Created by alyarnaud on 2/16/2018.
 */

public class Eyes extends Face {

    Paint myEyeColor;

    public Eyes(int initRed, int initGreen, int initBlue) {

        myEyeColor = new Paint();
        myEyeColor.setColor(Color.rgb(initRed, initGreen, initBlue));

    }

    public void drawFace(Canvas canvas) {
        canvas.drawCircle(500.0f, 500.0f, 100.0f, myEyeColor);
        canvas.drawCircle(1100.0f, 500.0f, 100.0f, myEyeColor);
    }
    public void onDraw(Canvas canvas){

    }
}
