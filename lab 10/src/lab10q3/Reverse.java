package lab10q3;
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args)
    {
        int[] vals;
        int numbs;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the number of elements: ");
        numbs=scan.nextInt();
        vals = new int[numbs];
        
        for (int i=0;i<numbs;i++)
        {
            System.out.println("Enter a number to place in the array:");
            vals[i] = scan.nextInt();
        }
        
        for (int i=0;i<numbs;i++)
        {
            System.out.println("The Element in location "+i+" is "+vals[i]);
        }
        
        System.out.println("\nArray is being reversed.\n");
        
        int end = vals.length-1;
        int temp1;
        int temp2;
        for (int i=0;i<numbs/2;i++)
        {
            temp1 = vals[i];
            temp2 = vals[end];
            vals[i] = temp2;
            vals[end] = temp1;
            temp1=0;
            temp2=0;
            end--;
        }
        
        
        
        for (int i=0;i<numbs;i++)
        {
            System.out.println("The Element in location "+i+" is "+vals[i]);
        }
    }
    
}
