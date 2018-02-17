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
    private Paint randomColorA = new Paint();
    private Paint randomColorB = new Paint();
    private Paint randomColorC = new Paint();

    private Paint skinPaint;
    private Paint eyePaint;
    private Paint hairPaint;

    private int hairStyle;
    MyArtwork mySurfaceView;



    public Face(){
        skinPaint = new Paint();
        eyePaint = new Paint();
        hairPaint = new Paint();
        this.randomize();
    }

    public void drawFace(Canvas canvas){

        this.drawSkin(canvas);
        this.drawEyes(canvas);
        this.drawHair(canvas);

    }

    public void randomize(){
        int randomRedA = gen.nextInt(256);
        int randomBlueA = gen.nextInt(256);
        int randomGreenA = gen.nextInt(256);
        randomColorA.setColor(Color.rgb(randomRedA, randomBlueA, randomGreenA));
        this.skinPaint= randomColorA;

        int randomRedB = gen.nextInt(256);
        int randomBlueB = gen.nextInt(256);
        int randomGreenB = gen.nextInt(256);
        randomColorB.setColor(Color.rgb(randomRedB, randomBlueB, randomGreenB));
        this.eyePaint = randomColorB;

        int randomRedC = gen.nextInt(256);
        int randomBlueC = gen.nextInt(256);
        int randomGreenC = gen.nextInt(256);
        randomColorC.setColor(Color.rgb(randomRedC, randomBlueC, randomGreenC));
        this.hairPaint = randomColorC;

        this.hairStyle = gen.nextInt(2);

    }

    public void drawSkin(Canvas canvas){
        canvas.drawCircle(800.0f, 800.0f, 600.0f, this.skinPaint);
    }
    public void drawEyes(Canvas canvas){
        canvas.drawCircle(500.0f, 500.0f, 100.0f, this.eyePaint);
        canvas.drawCircle(1100.0f, 500.0f, 100.0f, this.eyePaint);
    }
    public void drawHair(Canvas canvas){
        if (this.hairStyle == 0){
            canvas.drawRect(400.0f,100.0f,1200.0f,400.0f,this.hairPaint);

        }
        else if (this.hairStyle == 1){
            canvas.drawCircle(800.0f,300.0f,200.0f,this.hairPaint);

        }
        else{
            canvas.drawRect(700.0f,100.0f,900.0f,400.0f,this.hairPaint);

        }
    }
    public int getHairStyle(){ return hairStyle;}

    public void setHairStyle(int myHairStyle){hairStyle = myHairStyle;}

    public Paint getHairColor(){ return hairPaint;}

    public void setHairColor(Paint myHairColor){hairPaint = myHairColor;}

    public Paint getEyeColor(){ return eyePaint;}

    public void setEyeColor(Paint myEyeColor){eyePaint = myEyeColor;}

    public Paint getSkinColor(){ return skinPaint;}
    public void setSkinColor(Paint mySkinColor){skinPaint = mySkinColor;}


}

