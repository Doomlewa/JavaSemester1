package lab9q3;

public class DrunkenWalk {
   
    
    public static void main(String[] args)
    {
        int deadDrunk=0;
        int numDrunk=10;
        RandomWalk abel;
        
        for (int i=0;i<numDrunk;i++)
        {
            abel = new RandomWalk(200, 20);
            abel.walk();
            System.out.println(abel);
            if (!abel.inBounds())
            {
                deadDrunk+=1;
            }
        }
        System.out.println(deadDrunk + " drunks drowned.");
    }
}
