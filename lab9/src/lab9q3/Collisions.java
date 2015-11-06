package lab9q3;

public class Collisions {
    static int collisions;
   
    public static void main(String[] args)
    {
        RandomWalk Seth = new RandomWalk(100000, 200000, -3, 0);
        RandomWalk Abraham = new RandomWalk(100000, 200000, 3, 0);
        for (int i = 0; i<100000;i++)
        {
            Seth.takeStep();
            Abraham.takeStep();
            isCollide(Seth, Abraham);
        }
        System.out.println("There was " + collisions + " collisions.");
    }
    
    public static boolean isCollide(RandomWalk first,RandomWalk two)
    {
        if (first.getxPos() == two.getxPos() && first.getyPos() == two.getyPos())
        {
            collisions++;
            return true;
        }
        else
        {
            return false;
        }
    }
}
