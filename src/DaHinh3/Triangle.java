package DaHinh3;

import java.awt.*;

public class Triangle extends Shape {

    public static int numOfShape = 1;

    @Override
    public void move() {
        x += velocityX;
        y += velocityY;

        if(x <= 50 || x >= Window.WIND_WIDTH - 80){
            velocityX = -velocityX;
        }

        if(y <= 0 || y >= Window.WIND_HEIGHT - 120){
            velocityY = -velocityY;
        }

    }

    @Override
    public void paint(Graphics g) {
        int[] xPoints = {x, x + 80, x - 80};
        int[] yPoints = {y, y + 100, y + 100};
        g.setColor(this.color);
        g.fillPolygon(xPoints, yPoints, 3);
    }
}
