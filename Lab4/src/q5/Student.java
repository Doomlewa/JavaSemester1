package q5;
import java.util.Scanner;
public class Student {
  //declare instance data 
    String studentName;
    Integer test1Score;
    Integer test2Score;
    
    // --------------------------------------------- 
    //constructor 
    // --------------------------------------------- 
    public Student(String Person) 
    {
        studentName=Person;
    }

    // --------------------------------------------- 
    //inputGrades: prompt for and read in student's grades for test1 and test2. 
    //Use name in prompts, e.g., "Enter's Joe's score for test1". 
    // --------------------------------------------- 
    public void inputGrades() 
    { 
        Scanner scan = new Scanner(System.in);
        String test1;
        String test2;
        System.out.println("Please enter what "+ studentName+" got on Test 1:");
        test1=scan.next();
        scan.nextLine();
        System.out.println("Please enter what "+ studentName+" got on Test 2:");
        test2=scan.next();
        test1Score=Integer.parseInt(test1);
        test2Score=Integer.parseInt(test2);
    }
 
    // --------------------------------------------- 
    //getAverage: compute and return the student's test average 
    // --------------------------------------------- 
    public double getAverage() 
    { 
        double avg;
        avg=(test1Score+test2Score)/2.0;
        return avg;
    } 
    // --------------------------------------------- 
    //getName: print the student's name 
    // --------------------------------------------- 
    public String getName()
    { 
        return studentName;
    }
    
    public String toString()
    {
        String output;
        String name= studentName;
        String test1=test1Score.toString();
        String test2=test2Score.toString();
        output=("Name:    "+name+"  Test 1:    "+ test1+ "   Test 2:    "+test2);
        return output;
    }

}
