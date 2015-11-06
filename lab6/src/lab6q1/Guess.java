package lab6q1;
import java.util.Scanner;
import java.util.Random;
public class Guess {
    public static void main(String[] args) { 
        int numToGuess;       //Number the user tries to guess
        int guess;           //The user's guess
        int lowGuess=0;
        int highGuess=0;
        int totalGuess=0;
        Scanner scan = new Scanner(System.in); 
        Random generator = new Random(); 
    
        numToGuess=generator.nextInt(10)+1;
        //randomly generate the  number to guess
    
        System.out.println("Please guess a number between 1 and 10:"); 
        //read in guess 
        guess=scan.nextInt();
        scan.nextLine();
    while (guess !=numToGuess )  //keep going as long as the guess is wrong   
        { 
        System.out.println("Nope! You'll have to try again.");
        if (guess > numToGuess)
        {
            System.out.println("Nope! That Guess was too high, You'll have to try again.");
            highGuess+=1;
            totalGuess+=1;
        }
        else
        {
            System.out.println("Nope! That Guess was too low, You'll have to try again.");
            lowGuess+=1;
            totalGuess+=1;
        }
        System.out.println("Please guess a number:");  
        guess=scan.nextInt();
        scan.nextLine();
        }

        System.out.println("You got it! Nice!");
        System.out.println("The Number of guesses was: "+totalGuess);
        System.out.println(highGuess+" were too high and "+lowGuess+" were too low!");
        System.out.println("Can we go now?");
    } 

}
