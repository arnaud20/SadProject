package com.example.alyarnaud.sadproject;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

import java.util.Random;


/**
 * <!-- class Face -->
 *
 *
 *
 * @author Alyssa Arnaud
 * Date: 2/14/18
 * Course: CS 301 A
 * Description:  This is the class that determines what is drawn on the screen
 *
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


    /**
     *  * Constructor sets all the paints and hairstyle to random
     *  initial values by calling the randomize method
     *  */
    public Face(){
        skinPaint = new Paint();
        eyePaint = new Paint();
        hairPaint = new Paint();
        this.randomize();
    }
    /**
     *  * Draws the face object onto the surface view using helper methods
     *  * @param canvas     where the Face is actually drawn
     *  */
    public void drawFace(Canvas canvas){

        this.drawSkin(canvas);
        this.drawEyes(canvas);
        this.drawHair(canvas);

    }
    /**
     *  * Creates random Paints and hairstyles to draw the face with
     *  */
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
    /**
     *  * Helper method for face
     *  * draws the bottom layer
     *  * @param canvas     where the Face is actually drawn
     *  */
    public void drawSkin(Canvas canvas){
        canvas.drawCircle(800.0f, 800.0f, 600.0f, this.skinPaint);
    }
    /**
     *  * Helper method for face
     *  * draws the eyes
     *  * @param canvas     where the Face is actually drawn
     *  */
    public void drawEyes(Canvas canvas){
        canvas.drawCircle(500.0f, 500.0f, 100.0f, this.eyePaint);
        canvas.drawCircle(1100.0f, 500.0f, 100.0f, this.eyePaint);
    }
    /**
     *  * Helper method for face
     *  * draws the hair
     *   * three different possible ways
     *  * @param canvas     where the Face is actually drawn
     *  */
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
    /**
     External Citation
     Date: 16 February 2018
     Problem: I had lots of problems
     Resource: Nux!
     Solution: I changed my Face object to not have child classes
     and added getters and setters
     */
    public int getHairStyle(){ return hairStyle;}

    public void setHairStyle(int myHairStyle){hairStyle = myHairStyle;}

    public Paint getHairColor(){ return hairPaint;}

    public void setHairColor(Paint myHairColor){hairPaint = myHairColor;}

    public Paint getEyeColor(){ return eyePaint;}

    public void setEyeColor(Paint myEyeColor){eyePaint = myEyeColor;}

    public Paint getSkinColor(){ return skinPaint;}
    public void setSkinColor(Paint mySkinColor){skinPaint = mySkinColor;}


}

