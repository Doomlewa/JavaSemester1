package lab8q2;
import java.util.Scanner; 
public class Count 
{ 
    public static void main (String[] args) 
    { 
        String phrase=""; // a string of characters 
        int countBlank; // the number of blanks (spaces) in the phrase
        int countA;
        int countE;
        int countS;
        int countT;
        int length; // the length of the phrase 
        char ch; // an individual character in the string 
        Scanner scan = new Scanner(System.in); 
        
        // Print a program header 
        System.out.println (); 
        System.out.println ("Character Counter");
        System.out.println (); 
        while (phrase.equalsIgnoreCase("quit")==false)
        {
            // Read in a string and find its length 
            System.out.print ("Enter a sentence or phrase, or enter quit to exit: "); 
            phrase = scan.nextLine(); 
            length = phrase.length(); 
            if (phrase.equalsIgnoreCase("quit"))
            {
                break;
            }
            
            // Initialize counts 
            countBlank = 0;
            countA = 0;
            countE = 0;
            countS = 0;
            countT = 0;
            
            // a for loop to go through the string character by character 
            // and count the blank spaces 
            for (int i=0;i<length-1;i++)
            {
                ch=phrase.charAt(i);
                switch (ch)
                {
                    case ' ': countBlank++;
                              break;
                    case 'a':
                    case 'A': countA++;
                              break;
                    case 'e':
                    case 'E': countE++;
                              break;
                    case 's':
                    case 'S': countS++;
                              break;
                    case 't':
                    case 'T': countT++;
                              break;
                }
            }
            
            // Print the results 
            System.out.println (); 
            System.out.println ("Number of blank spaces in phrase: " + countBlank);
            System.out.println ("Number of A's in the phrase: "+countA);
            System.out.println ("Number of E's in the phrase: "+countE);
            System.out.println ("Number of S's in the phrase: "+countS);
            System.out.println ("Number of T's in the phrase: "+countT);
            System.out.println ();
        }
    }
}