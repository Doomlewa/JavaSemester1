package lab7q4;
import java.util.Scanner;
public class Temps {
    public static void main (String[] args) 
    { 
        final int HOURS_PER_DAY = 6; 
        int temp;   // a temperature reading 
        int maxTemp=-1000;
        int maxHour=-1;
        int minTemp=9000;
        int minHour=-1;
        Scanner scan = new Scanner(System.in); 
        // print program heading 
        System.out.println (); 
        System.out.println ("Temperature Readings for 24 Hour Period"); 
        System.out.println (); 
   
    
        for (int hour = 0; hour < HOURS_PER_DAY; hour++) 
        { System.out.print ("Enter the temperature reading at hour " + (hour+1) +": " );
            temp = scan.nextInt(); 
            if (temp>maxTemp) 
            {
                maxTemp=temp;
                maxHour=hour+1;
            }
            if (temp<minTemp)
            {
                minTemp=temp;
                minHour=hour+1;
            }
        } 
    
        System.out.println("\nThe max Temperature was: "+maxTemp);
        System.out.println("It occured during hour: "+maxHour);
        System.out.println("\nThe min Temperature was: "+minTemp);
        System.out.println("It occured during hour: "+minHour);
        scan.close();
        }
    }
