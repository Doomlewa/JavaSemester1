package lab8q4;
import java.util.Scanner;
public class Comparisons {

    public static void main(String[] args) {
        Comparable first;
        Comparable second;
        Comparable third;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an item to be compared:");
        first=scan.nextLine();
        System.out.println("Please enter another item to be compared:");
        second=scan.nextLine();
        System.out.println("Please enter a final item to be compared:");
        third=scan.nextLine();
        System.out.println("The largest is :"+Compare3.Largest(first, second, third));
        
        System.out.println("Please enter an integer to be compared:");
        first=scan.nextInt();
        System.out.println("Please enter another integer to be compared:");
        second=scan.nextInt();
        System.out.println("Please enter a final integer to be compared:");
        third=scan.nextInt();
        System.out.println("The Largest is: "+Compare3.Largest(first, second, third));
        
        
        scan.close();
    }

}
