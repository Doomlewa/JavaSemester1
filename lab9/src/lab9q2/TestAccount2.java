package lab9q2;
import java.util.Scanner;
public class TestAccount2 {

    public static void main(String[] args) {
        Account acct1;
        Account acct2;
        Account acct3;
        Account acct4;
        String nam1;
        String nam2;
        String nam3;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter a name for the first account:");
        nam1 = scan.nextLine();
        
        System.out.println("Please enter a name for the second account:");
        nam2 = scan.nextLine();
        
        System.out.println("Please enter a name for the third account:");
        nam3 = scan.nextLine();
        
        acct1 = new Account(100,nam1,0);
        acct2 = new Account(100,nam2,1);
        acct3 = new Account(100,nam3,2);
        
        System.out.println(acct1);
        System.out.println("");
        System.out.println(acct2);
        System.out.println("");
        System.out.println(acct3);
        System.out.println("");
        
        System.out.println("Closing Account 1\n");
        acct1.close();
        
        System.out.println("Attempting to consolidate accounts 2 and 3\n");
        acct4 = Account.consolidate(acct2, acct3);
        
        System.out.println("Displaying results:\n");
        System.out.println(acct1);
        System.out.println("");
        System.out.println(acct2);
        System.out.println("");
        System.out.println(acct3);
        System.out.println("");
        if (acct4 != null)
        {
            System.out.println(acct4);
        }
        System.out.println("\nGoodbye.");
    }

}
