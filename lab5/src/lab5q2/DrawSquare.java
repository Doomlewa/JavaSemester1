package lab5q2;
import java.awt.Dimension;


import javax.swing.JFrame;
public class DrawSquare {

    public static void main(String[] args) {
        JFrame frame = new JFrame("HELLO");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(800, 600));
        SquarePanel makeStuff0 = new SquarePanel();
        frame.getContentPane().add(makeStuff0);
        frame.pack();
        frame.setVisible(true);
        

    }

}
