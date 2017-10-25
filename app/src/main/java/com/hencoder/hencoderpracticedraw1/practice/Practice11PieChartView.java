package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    private void drawData(int index, String text, int value, Canvas canvas) {

    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图

        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.RED);
        canvas.drawArc(200,50,700,550,180,120,true, paint);


        paint.setColor(Color.YELLOW);
        canvas.drawArc(225,75,725,575,-60,60-2,true, paint);
        paint.setColor(Color.parseColor("#9900ff"));
        canvas.drawArc(225,75,725,575,0,10-2,true, paint);
        paint.setColor(Color.GRAY);
        canvas.drawArc(225,75,725,575,10,10-2,true, paint);
        paint.setColor(Color.GREEN);
        canvas.drawArc(225,75,725,575,20,40-2,true, paint);
        paint.setColor(Color.BLUE);
        canvas.drawArc(225,75,725,575,60,120,true, paint);

        paint.setColor(Color.WHITE);
        paint.setTextSize(28);
        canvas.drawText("Lolipop",0,80,paint);

        paint.setStrokeWidth(2);
        canvas.drawLine(100,66,300,66,paint);
        canvas.drawLine(300,66,(float)(450-250*Math.cos(Math.PI/3d)),(float)(300-250*Math.sin(Math.PI/3d)),paint);
    }
}
