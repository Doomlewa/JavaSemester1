package q5;

public class Grades 
{
    public static void main(String[] args) 
    { 
        
       
        Student student1 = new Student("Mary"); 
        Student student2 = new Student("Mike"); 
        student1.inputGrades();
        System.out.println("The average for "+student1.getName()+" is: "+student1.getAverage()); 
        student2.inputGrades();
        System.out.println("The average for "+student2.getName()+" is: "+student2.getAverage());
        
        System.out.println("Student 1: "+student1);
        System.out.println("Student 2: "+student2);
         
    }

    
}
