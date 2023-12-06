package DaHinh3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Time;
import java.util.ArrayList;

public class Panel extends JPanel implements ActionListener, KeyListener {

    ArrayList<Rectangle> rects = new ArrayList<>();
    ArrayList<Circle> circles = new ArrayList<>();
    ArrayList<Triangle> tri = new ArrayList<>();
    JLabel label = new JLabel("(Press 'r' for Rectangle/ 't' for Triangle / 'c' for Circle) - ");
    JLabel countRect = new JLabel("Rect: " + 0 + " | ");
    JLabel countTri = new JLabel("Tri: " + 0 + " | ");
    JLabel countCircle = new JLabel("Circle:  " + 0);
    Timer timer;

    public Panel(){
        setFocusable(true);
        timer = new Timer(16, this);
        timer.start();
        addKeyListener(this);
        add(label);
        add(countRect);
        add(countTri);
        add(countCircle);
    }

    private void addNewRect(){
        rects.add(new Rectangle());
        countRect.setText("Rect: " + Rectangle.numOfShape++);
    }

    private void addNewCircle(){
        circles.add(new Circle());
        countCircle.setText("Circle: " + Circle.numOfShape++);
    }

    private void addNewTriangle(){
        tri.add(new Triangle());
        countTri.setText("Tri: " + Triangle.numOfShape++);
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        for(var i : rects){
            i.paint(g);
        }
        for(var i : circles){
            i.paint(g);
        }
        for(var i : tri){
            i.paint(g);
        }
    }

    public void update(){
        for(var i : rects){
            i.move();
        }
        for(var i : circles){
            i.move();
        }
        for (var i : tri){
            i.move();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
        update();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        char keyChar = e.getKeyChar();
        if (keyChar == 'R' || keyChar == 'r') {
            // Perform your action for the R key here
            addNewRect();
        }
        if(keyChar == 'C' || keyChar == 'c') {
            addNewCircle();
        }if(keyChar == 'T' || keyChar == 't') {
            addNewTriangle();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
