package lab5q2;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

public class Square {

    
    int size;
    int xCorner;
    int yCorner;
    int r;
    int green;
    int b;
    Color squareColor;
    
    private static Random generator=new Random();
    
    public Square()
    {
        
        xCorner=generator.nextInt(600);
        yCorner=generator.nextInt(400);
        r=generator.nextInt(255);
        green=generator.nextInt(255);
        b=generator.nextInt(255);
        squareColor=new Color(r, green, b);
        
    }    
    
    public void draw(Graphics g)
    {
        g.setColor(squareColor);
        g.fillRect(xCorner, yCorner, size, size);
    }
}
