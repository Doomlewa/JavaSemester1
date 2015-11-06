package lab5q2;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;


public class SquarePanel extends JPanel{

    Square s1 = new Square();
    Square s2 = new Square();
    Square s3 = new Square();
    Square s4 = new Square();
    Square s5 = new Square();
    public SquarePanel()
    {

    }
    
   public void paintComponent(Graphics g)
   {
       s1.draw(g);
       s2.draw(g);
       s3.draw(g);
       s4.draw(g);
       s5.draw(g);

   }

  

        
}
 

    

