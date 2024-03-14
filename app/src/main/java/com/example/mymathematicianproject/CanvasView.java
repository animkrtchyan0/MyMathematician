package com.example.mymathematicianproject;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.NonNull;

public class CanvasView extends View {

    private Paint paint;
    private float startX, startY;
    public CanvasView(Context context) {
        super(context);
        paint = new Paint();
        paint.setColor(Color.BLACK);

        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.WHITE);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        float x = event.getX();
        float y = event.getY();

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                startX = x;
                startY = y;
                break;
            case MotionEvent.ACTION_MOVE:
                drawLine(startX, startY, x, y, );
                startX = x;
                startY = y;
                break;
            case MotionEvent.ACTION_UP:
                break;
        }
        invalidate();
        return true;
    }
        private void drawLine(float startX,float startY,float endX,float endY) {
            Canvas canvas = new Canvas();
            canvas.drawLine(startX,startY,endX,endY, paint);
    }
}
