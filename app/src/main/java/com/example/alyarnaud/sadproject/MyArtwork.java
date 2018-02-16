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
    private Random gen = new Random();
    private Paint randomColor = new Paint();


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
    public Paint randomPaint(){
        int randomRed = gen.nextInt(256);
        int randomBlue = gen.nextInt(256);
        int randomGreen = gen.nextInt(256);
        randomColor.setColor(Color.rgb(randomRed, randomBlue, randomGreen));
        return randomColor;
    }
    public void onDraw(Canvas canvas)
    //draw face stuff here
    {
        //Paint skinColor = new Paint();
        //skinColor.setColor(Color.YELLOW);
        randomPaint();
        canvas.drawCircle(800.0f, 800.0f, 600.0f, randomColor);
        randomPaint();
        canvas.drawCircle(500.0f, 500.0f, 100.0f, randomColor);
        canvas.drawCircle(1100.0f, 500.0f, 100.0f, randomColor);
        randomPaint();
        canvas.drawRect(700.0f,100.0f,900.0f,400.0f,randomColor);

    }

}
