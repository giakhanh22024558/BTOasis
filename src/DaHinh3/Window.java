package DaHinh3;

import javax.swing.*;

public class Window extends JFrame {

    public static int WIND_WIDTH = 600;
    public static int WIND_HEIGHT = 750;

    public Window(){
        setSize(WIND_WIDTH, WIND_HEIGHT);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Panel panel = new Panel();
        add(panel);

        setVisible(true);
    }

    public static void main(String[] args){
        new Window();
    }

}
