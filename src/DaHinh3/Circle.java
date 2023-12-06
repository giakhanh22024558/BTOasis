package DaHinh3;

import java.awt.*;

public class Circle extends Shape{

    private static final int DIAMETER = 120;
    public static int numOfShape = 1;

    @Override
    public void move() {
        x += velocityX;
        y += velocityY;

        if(x < 0 || x > Window.WIND_WIDTH - DIAMETER){
            velocityX = -velocityX;
        }

        if(y < 0 || y > Window.WIND_HEIGHT - DIAMETER){
            velocityY = -velocityY;
        }

    }

    @Override
    public void paint(Graphics g) {
        g.setColor(this.color);
        g.fillOval(x, y, DIAMETER, DIAMETER);
    }

}
