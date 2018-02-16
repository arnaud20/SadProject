package com.example.alyarnaud.sadproject;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

import java.util.Random;

/**
 * Created by alyarnaud on 2/16/2018.
 */

public class Face {
    private Random gen = new Random();
    private Paint randomColor = new Paint();
    private Paint skinColor = new Paint();
    private Paint eyeColor = new Paint();
    private Paint hairColor = new Paint();



    public Face(){}

    public void drawFace(Canvas canvas){

        this.drawSkin(canvas);
        this.drawEyes(canvas);
        this.drawHair(canvas);

    }
    public Paint randomPaint(){
        int randomRed = gen.nextInt(256);
        int randomBlue = gen.nextInt(256);
        int randomGreen = gen.nextInt(256);
        randomColor.setColor(Color.rgb(randomRed, randomBlue, randomGreen));
        return randomColor;
    }
    public void drawSkin(Canvas canvas){
        skinColor = randomPaint();
        canvas.drawCircle(800.0f, 800.0f, 600.0f, skinColor);
    }
    public void drawEyes(Canvas canvas){
        eyeColor = randomPaint();
        canvas.drawCircle(500.0f, 500.0f, 100.0f, eyeColor);
        canvas.drawCircle(1100.0f, 500.0f, 100.0f, eyeColor);
    }
    public void drawHair(Canvas canvas){
        hairColor = randomPaint();
        int hairStyle = gen.nextInt(3);
        if (hairStyle == 0){
            canvas.drawRect(400.0f,100.0f,1200.0f,400.0f,hairColor);

        }
        else if (hairStyle == 1){
            canvas.drawCircle(800.0f,300.0f,200.0f,hairColor);

        }
        else{
            canvas.drawRect(700.0f,100.0f,900.0f,400.0f,hairColor);

        }
    }
}
