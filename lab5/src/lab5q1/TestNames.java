package lab5q1;
import java.util.Scanner;
public class TestNames {

    public static void main(String[] args) {
       String firstName;
       String middleName;
       String lastName;
       Scanner scan=new Scanner(System.in);
       Name name1;
       Name name2;
       System.out.println("Please enter a first name: ");
       firstName=scan.nextLine();
       System.out.println("\nPlease enter a middle name: ");
       middleName=scan.nextLine();
       System.out.println("\nPlease enter a last name: ");
       lastName=scan.nextLine();
       name1=new Name(firstName, middleName, lastName);
       
       System.out.println("\nPlease enter a second first name: ");
       firstName=scan.nextLine();
       System.out.println("\nPlease enter a second middle name: ");
       middleName=scan.nextLine();
       System.out.println("\nPlease enter a second last name: ");
       lastName=scan.nextLine();
       scan.close();
       name2=new Name(firstName, middleName, lastName);
       
       System.out.println("\nThe first name is: "+name1.firstMiddleLast());
       System.out.println("It can also be written as: "+name1.lastFirstMiddle());
       System.out.println("The initals of this name are: "+name1.initials());
       System.out.println("The name is "+ name1.length() +" characters long without spaces.");
       
       System.out.println("\nThe second name is: "+name2.firstMiddleLast());
       System.out.println("It can also be written as: "+name2.lastFirstMiddle());
       System.out.println("The initals of this name are: "+name2.initials());
       System.out.println("The name is "+ name2.length() +" characters long without spaces.");
       
       if (name1.equals(name2)==true)
       {
           System.out.println("\nThe two names are the same.");
       }
       else
       {
           System.out.println("\nThe two names are not the same.");   
       }

    }

}
