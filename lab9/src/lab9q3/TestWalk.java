package lab9q3;
import java.util.Scanner;
public class TestWalk {
    public static void main (String[] args) 
    { 
        
        int maxSteps; // maximum number of steps in a walk 
        int maxCoord; // the maximum x and y coordinate 
        int x, y; // starting x and y coordinates for a walk
        RandomWalk adam;
        RandomWalk eve;
        Scanner scan = new Scanner(System.in); 
        System.out.println ("\nRandom Walk Test Program"); 
        System.out.println (); 
        System.out.print ("Enter the boundary for the square: ");
        maxCoord = scan.nextInt(); 
        System.out.print ("Enter the maximum number of steps: ");
        maxSteps = scan.nextInt(); 
        System.out.print ("Enter the starting x and y coordinates with " + "a space between: ");
        x = scan.nextInt();
        y = scan.nextInt(); 
        
        adam = new RandomWalk(10, 5);
        eve = new RandomWalk(maxSteps,maxCoord,x,y);
       for (int i=0;i<5;i++)
       {
           adam.takeStep();
           System.out.println("Walk 1: \n" + adam);
           System.out.println("Max distance: " +adam.getMaxDistance());
           eve.takeStep();
           System.out.println("Walk 2: \n"+eve);
           System.out.println("Max distance: " +eve.getMaxDistance());
       }
       
        RandomWalk cain = new RandomWalk(200, 10);
        cain.walk();
        
        System.out.println("Walk 3: \n" + cain);
    } 

}
