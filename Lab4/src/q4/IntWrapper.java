package q4;
import java.util.Scanner;
public class IntWrapper {

    public static void main(String[] args) {
       Integer test;
       Integer dec1;
       Integer dec2;
       Integer decFin;
       String val1;
       String val2;
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter an integer: ");
       test=scan.nextInt();
       
       System.out.println(test+" in binary is: "+Integer.toBinaryString(test));
       System.out.println(test+" in octal is: "+Integer.toOctalString(test));
       System.out.println(test+" in Hexadecimal is: "+ Integer.toHexString(test));
       System.out.println("\nThe Max Integer value is: "+Integer.MAX_VALUE);
       System.out.println("The Min Integer value is: "+ Integer.MIN_VALUE);
       System.out.println("\nPlease enter an integer in base 10: ");
       val1=scan.next();
       scan.nextLine();
       System.out.println("And another: ");
       val2=scan.next();
       scan.close();
       dec1=Integer.parseInt(val1);
       dec2=Integer.parseInt(val2);
       decFin=dec1+dec2;
       System.out.println("The sum is: "+ decFin);
    }

}
