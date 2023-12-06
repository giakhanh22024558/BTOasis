package DaHinh3;

import java.awt.*;
import java.util.Random;

public abstract class Shape {

    protected Color[] colors = {
            Color.RED,
            Color.GREEN,
            Color.BLUE,
            Color.YELLOW,
            Color.ORANGE,
            Color.CYAN,
            Color.MAGENTA,
            Color.PINK,
            Color.DARK_GRAY,
            Color.BLACK
    };
    protected Color color;
    protected int velocityX = 7;
    protected int velocityY = 7;
    protected int x = Window.WIND_WIDTH/2;
    protected int y = Window.WIND_HEIGHT/2;

    public Shape(){
        this.color = randomColor(colors);
    }

    private static Color randomColor(Color[] colors){
        Random random = new Random();
        int index = random.nextInt(colors.length);
        return colors[index];
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getVelocityX() {
        return velocityX;
    }

    public int getVelocityY() {
        return velocityY;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public abstract void move();
    public abstract void paint(Graphics g);



}
