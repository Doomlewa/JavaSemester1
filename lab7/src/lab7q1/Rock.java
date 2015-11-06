package lab7q1;
import java.util.Scanner;
import java.util.Random; 
public class Rock 
{          
    public static void main(String[] args) 
    { 
        String personPlay;    //User's play -- "R", "P", or "S" 
        String computerPlay;  //Computer's play -- "R", "P", or "S" 
        int computerInt;      //Randomly generated number used to determine 
                             //computer's play 
        Scanner scan = new Scanner(System.in); 
        Random generator = new Random(); 

        System.out.println("Please enter a Rock-Paper-Scicsors play(R,S or P):");
        personPlay = scan.nextLine();
        personPlay =personPlay.toUpperCase();
        //Make player's play uppercase for ease of comparison 
        //Generate computer's play (0,1,2) 
        computerInt = generator.nextInt(3);
        //Translate computer's randomly generated play to string 
        switch (computerInt) 
        { 
        case 0:
            computerPlay = "R";
            break;
        case 1:
            computerPlay = "S";
            break;
        case 2:
            computerPlay = "P";
            break;
        default:
            computerPlay = "R";
        }
        System.out.println("The Computer play was: " + computerPlay); 
        //See who won.  Use nested ifs instead of &&. 
        if (personPlay.equals(computerPlay)) 
        {
            System.out.println("It's a tie!");
        }
        else if (personPlay.equals("R"))
        {
            if (computerPlay.equals("S")) {
                System.out.println("Rock crushes scissors.  You win!!"); 
            }
            else if (computerPlay.equals("P")) {
                System.out.println("Paper covers rock somehow. You Lose!");
            }
        }
            else if (personPlay.equals("S"))
            {
                if (computerPlay.equals("P")) {
                     System.out.println("Scissors cut paper. You win!!");
                }
                else if (computerPlay.equals("R")) {
                    System.out.println("Rock crushes scissors.  You lose!!");
                }
            }
            else if (personPlay.equals("P"))
            {
                if (computerPlay.equals("R")) {
                    System.out.println("Paper covers rock somehow. You Win!");
                }
                else if (computerPlay.equals("S")) {
                    System.out.println("Scissors cut paper. You lose!!");
                }
            }
                } 
    
}
