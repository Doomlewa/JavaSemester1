package lab8q3;

public class Run {
    public static void main (String[] args) 
    { 
        final int FLIPS = 100; // number of coin flips 
        
        int currentRun =0; // length of the current run of HEADS 
        int maxRun =0;     // length of the maximum run so far 

        Coin coin = new Coin();

        //Flip the coin FLIPS times 
        for (int i = 0; i < FLIPS; i++)     
        { 
            // Flip the coin & print the result 
            coin.flip();
            System.out.println("It was: "+coin.toString());
            //Update the run information 
            if(coin.isHeads()==true)
            {
                currentRun++;
                if (currentRun>maxRun)
                {
                    maxRun=currentRun;
                }
            }
            else
            {
                currentRun=0;
            }
        } 
        System.out.println("The Longest streak of heads was: " +maxRun); 

    } 

}
