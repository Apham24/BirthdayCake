package cs301.birthdaycake;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/** This class represents a single round spot (circle) on the screen */
public class blueBalloon {

    protected int x;
    protected int y;
    protected int size = 100;
    private Paint myPaint = new Paint();
    private Paint stringz = new Paint();

    public blueBalloon(int initX, int initY) {

        this.x = initX;
        this.y = initY;
        myPaint.setColor(Color.BLUE);
        stringz.setColor(Color.BLACK);

    }

    public void draw(Canvas canvas) {

        canvas.drawCircle(x, y, size, myPaint);
        canvas.drawRect(x,y+size,x+10,y+200,stringz);


        //canvas.drawOval(x,y,x+50,size, myPaint);
        //canvas.drawOval(2,2,2,2,myPaint);






    }
}// class Spot


