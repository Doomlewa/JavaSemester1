package lab6q2;
import java.util.Scanner;
public class Factorials {

    public static void main(String[] args) {
        int factorial=1;
        int request=0;
        int initialRequest=0;
        int valid=0;
        Scanner scan= new Scanner(System.in);
        
        while(valid==0)
        {
            System.out.println("Enter a positive integer, and I will give you"
                    + " the factorial.");
            request=scan.nextInt();
            scan.nextLine();
            if (request>=0)
            {
                valid=1;
                System.out.println("Now calculating.");
            }
            else
            {
                System.out.println("I said a POSITIVE integer. Try again.");
            }
            
        }

        if (request==0)
        {
            System.out.println("The result for "+request+"! = "+factorial);
        }
        else
        {
            initialRequest=request;
            factorial=request;
            request--;
            while (request>0)
            {
                factorial*=request;
                request--;
            }
            System.out.println("The result for "+initialRequest+"! = "+factorial);
        }
    }

}
