package lab9q1;
import java.util.Random;
public class Account 
{ 
    private double balance;
    private String name; 
    private long acctNum;
    Random gen = new Random();

    //------------------------------------------------- 
    //Constructor -- initializes balance, owner, and account number 
    //------------------------------------------------- 
    public Account(double initBal, String owner, long number) 
    { 
        balance = initBal; 
        name = owner; 
        acctNum = number; 
    } 
    
    public Account(double initBal, String owner)
    {
        balance = initBal;
        name = owner;
        acctNum = Math.abs(gen.nextLong());
    }
    
    public Account(String owner)
    {
        name = owner;
        balance = 0;
        acctNum = Math.abs(gen.nextLong());
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

    //------------------------------------------------- 
    // Returns balance. 
    //------------------------------------------------- 
    public double getBalance() 
    { 
        return balance; 
    } 

    //------------------------------------------------- 
    // Returns a string containing the name, account number, and balance. 
    //------------------------------------------------- 
    public String toString() 
    { 
        return "Name:" + name + "\nAccount Number: " + acctNum + "\nBalance: " + balance; 
    } 
} 