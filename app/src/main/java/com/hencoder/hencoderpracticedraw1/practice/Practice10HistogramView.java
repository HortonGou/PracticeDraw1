package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {
    Paint paint = new Paint();
    Paint paintRect = new Paint();

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    private void drawData(int index, String text, int value, Canvas canvas) {
        canvas.drawText(text, 200 + index * 125, 630, paint);
        canvas.drawRect(175+125*index, 600-value, 275+125*index, 600, paintRect);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paintRect.setColor(Color.GREEN);
//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        paint.setStrokeWidth(2);
        paint.setColor(Color.WHITE);


        canvas.drawLine(150, 100, 150, 600, paint);
        canvas.drawLine(150, 600, 950, 600, paint);

        paint.setTextSize(28);
        drawData(0, "Froyo", 5, canvas);
        drawData(1, "GB", 20, canvas);
        drawData(2, "ICS", 20, canvas);
        drawData(3, "JB", 150, canvas);
        drawData(4, "KitKat", 350, canvas);
        drawData(5, "L", 400, canvas);
        drawData(6, "M", 200, canvas);
    }
}
