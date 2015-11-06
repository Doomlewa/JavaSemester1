package q1;
import java.util.Scanner; 

public class Distance 
{ 
    public static void main (String[] args) 
    {
        double x1, y1, x2, y2;  // coordinates of two points
        double xSide,ySide;     // the sum of both values on given side
        double xSquare,ySquare; // the square values of both sides
        double squareDist;   //  The combined squares
        double distance;      // distance between the points 

        Scanner scan = new Scanner(System.in); 
        // Read in the two points
        System.out.print ("Enter the coordinates of the first point " +
        "(put a space between them): ");
        x1 = scan.nextDouble(); y1 = scan.nextDouble(); 
        System.out.print ("Enter the coordinates of the second point: "); 
        x2 = scan.nextDouble(); y2 = scan.nextDouble(); 
        scan.close();
        
        // Compute the distance 
       xSide=x1-x2;
       ySide=y1-y2;
       xSquare=Math.pow(xSide, 2);
       ySquare=Math.pow(ySide, 2);
       squareDist=xSquare+ySquare;
       distance=Math.pow(squareDist, 0.5);
        
        // Print out the answer 
       System.out.println("The distance between ("+x1+","+y1+") and ("
               +x2+","+y2+") is: "+distance);
    } 
}