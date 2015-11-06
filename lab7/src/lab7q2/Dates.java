package lab7q2;
import java.util.Scanner;
public class Dates
{ 
    public static void main(String[] args)
    { 
        int month, day, year;   //date read in from user 
        int daysInMonth;        //number of days in month read in 
        boolean monthValid, yearValid, dayValid;  //true if input from user is valid 
        boolean leapYear;      //true if user's year is a leap year  
        

        Scanner scan = new Scanner(System.in);  

        //Get integer month, day, and year from user 
        System.out.println("Please select a month in number form (1-12):");
        month = scan.nextInt();
        scan.nextLine();
        if (month >=1 && month <=12) {
            monthValid = true;
        }
        else {
            monthValid = false;
        }
        System.out.println("Please enter a day of the month:");
        day = scan.nextInt();
        scan.nextLine();
        System.out.println("Please enter a year between 1000 and 1999:");
        year = scan.nextInt();
        scan.close();
        if (year >=1000 && year<=1999) {
            yearValid = true;
        }
        else {
            yearValid=false;
        }
        if (year%400 == 0 || (year%4==0 && year%100 !=0)){
            leapYear = true;
        }
        else {
            leapYear = false;
        }
        switch (month){
        case 1:
           
            daysInMonth=31;
            break;
        case 2:
            
            if (leapYear == true){
                daysInMonth=29;
                break;
            }
            else {
                daysInMonth=28;
                break;
            }
        case 3:
            daysInMonth =31;
            break;
        case 4:
            daysInMonth=30;
            break;
        case 5:
            daysInMonth=31;
            break;
        case 6:
            daysInMonth=30;
            break;
        case 7: 
            daysInMonth = 31;
            break;
        case 8:
            daysInMonth=31;
            break;
        case 9:
            daysInMonth=30;
            break;
        case 10:
            daysInMonth=31;
            break;
        case 11:
            daysInMonth=30;
            break;
        case 12:
            daysInMonth=31;
            break;
        default:
            daysInMonth=0;
            break;
        }
        if (day>0 && day<=daysInMonth){
            dayValid= true;
        }
        else {
            dayValid=false;
        }
        if (dayValid==true&&yearValid==true&&monthValid==true){
            System.out.println("Date is valid.");
            if (leapYear==true){
                System.out.println("Year is a leap year.");
            }
            else {
                System.out.println("Year is not a loop year.");
            }
        }
        else {
            System.out.println("Date is not valid.");
        }
        
} 
}