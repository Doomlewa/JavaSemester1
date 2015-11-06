package lab9q2;
import java.util.Random;
public class Account 
{ 
    private double balance;
    private String name; 
    private long acctNum;
    private static int numAccounts;
    Random gen = new Random();

    //------------------------------------------------- 
    //Constructor -- initializes balance, owner, and account number 
    //------------------------------------------------- 
    public Account(double initBal, String owner, long number) 
    { 
        balance = initBal; 
        name = owner; 
        acctNum = number;
        numAccounts++;
    } 
    
    public Account(double initBal, String owner)
    {
        balance = initBal;
        name = owner;
        acctNum = Math.abs(gen.nextLong());
        numAccounts++;
    }
    
    public Account(String owner)
    {
        name = owner;
        balance = 0;
        acctNum = Math.abs(gen.nextLong());
        numAccounts++;
    }

    //------------------------------------------------- 
    // Checks to see if balance is sufficient for withdrawal. 
    // If so, decrements balance by amount; if not, prints message. 
    //------------------------------------------------- 
    public void withdraw(double amount) 
    { 
        if (balance >= amount) 
            balance -= amount; 
        else 
            System.out.println("Insufficient funds"); 
    }
    
    public void withdraw(double amount, double fee) 
    { 
        if (balance >= amount+fee) 
            balance -= (amount + fee); 
        else 
            System.out.println("Insufficient funds"); 
    }

    //------------------------------------------------- 
    // Adds deposit amount to balance. 
    //------------------------------------------------- 

    public void deposit(double amount) 
    { 
        balance += amount; 
    } 
    
    public void close()
    {
        name+="-CLOSED";
        balance = 0;
        numAccounts--;
    }

    //------------------------------------------------- 
    // Returns balance. 
    //------------------------------------------------- 
    public double getBalance() 
    { 
        return balance; 
    } 
    
    public static long getNumAccounts()
    {
        return numAccounts;
    }

    //------------------------------------------------- 
    // Returns a string containing the name, account number, and balance. 
    //------------------------------------------------- 
    public String toString() 
    { 
        return "Name:" + name + "\nAccount Number: " + acctNum + "\nBalance: " + balance; 
    } 
    
    public static Account consolidate(Account acct1,Account acct2)
    {
        Account acct3;
        double bal;
        String nam;
        long num;
        if (acct1.name.equals(acct2.name))
        {
            if (acct1.acctNum ==acct2.acctNum)
            {
                System.out.println("Cannot consolidate an account with itself.");
                return null;
            }
            else
            {
                bal = acct1.getBalance() + acct2.getBalance();
                nam = acct1.name;
                num = numAccounts +1;
                acct3 = new Account(bal, nam, num);
                acct1.close();
                acct2.close();
                return acct3;
            }
        }
        else 
        {
            System.out.println("Accounts must have the Same user.");
            return null;
        }
    }
} 