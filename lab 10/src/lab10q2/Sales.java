package lab10q2;
import java.util.Scanner; 
public class Sales 
{ 
    public static void main(String[] args) 
    { 
        Scanner scan = new Scanner(System.in);
        int SALESPEOPLE;
        System.out.println("Enter number of salespersons: ");
        SALESPEOPLE = scan.nextInt();
        int[] sales = new int[SALESPEOPLE];
        int sum;
        int maxSale;
        int maxSalesMan=0;
        int minSale;
        int minSalesMan=0;
        
        
        for (int i=0; i<sales.length; i++)     
        { 
            System.out.print("Enter number of sales for salesperson " + (i+1) + ": ");
            sales[i] = scan.nextInt();
            
        } 
        System.out.println("\nSalesperson  Sales"); 
        System.out.println(" ------------------- "); 
        sum = 0; 
        maxSale = 0;
        minSale = 9999;
        for (int i=0; i<sales.length; i++)     
        { 
            System.out.println("     " + (i+1) + "         " + sales[i]);
            sum += sales[i];
            if (sales[i]>maxSale)
            {
                maxSale=sales[i];
                maxSalesMan = i+1;
            }
            if (sales[i]<minSale)
            {
                minSale=sales[i];
                minSalesMan =i+1;
            }
        } 

        System.out.println("\nTotal sales: " + sum);
        System.out.println("Average numbers of sales per person: " + (sum/SALESPEOPLE));
        System.out.println("Largest sale of " +maxSale + " was made by "+maxSalesMan);
        System.out.println("Smallest sale of " +minSale + " was made by "+minSalesMan);
        
    } 
} 
