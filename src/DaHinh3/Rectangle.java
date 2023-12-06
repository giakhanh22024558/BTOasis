package DaHinh3;

import java.awt.*;

public class Rectangle extends Shape{

    public static int numOfShape = 1;
    private static final int RECT_WIDTH = 150;
    private static final int RECT_HEIGHT = 100;

    @Override
    public void move() {
        x += velocityX;
        y += velocityY;

        if(x <= 0 || x + RECT_WIDTH + 10 >= Window.WIND_WIDTH){
            velocityX = -velocityX;
        }

        if(y <= 0 || y + RECT_HEIGHT + 30 >= Window.WIND_HEIGHT){
            velocityY = -velocityY;
        }
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(this.color);
        g.fillRect(x, y, RECT_WIDTH, RECT_HEIGHT);
    }
}
