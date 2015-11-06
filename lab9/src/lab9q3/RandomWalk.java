package lab9q3;
import java.util.Random;
public class RandomWalk {
    int xPos;
    int yPos;
    int maxSteps;
    int curStep;
    int bounds;
    int maxDistance;
    Random gen = new Random();
    
    public RandomWalk(int max, int edge)
    {
        maxSteps = max;
        bounds = edge;
        xPos = 0;
        yPos = 0;
        curStep = 0;
        maxDistance=0;
    }
    
    public RandomWalk (int max, int edge, int startX, int startY)
    {
        maxSteps = max;
        bounds = edge;
        xPos = startX;
        yPos = startY;
        curStep = 0;
        maxDistance=0;
    }
    
    public String toString()
    {
        String Result;
        Result ="Steps Taken: " + curStep + "\nCurrent Position: (" + xPos +","+yPos+")\n";
        return Result;
    }
    
    public void takeStep()
    {
        int step =gen.nextInt(4)+1;
        switch (step)
        {
        case 1:
            yPos+=1;
            curStep++;
            break;
        case 2:
            xPos+=1;
            curStep++;
            break;
        case 3:
            yPos-=1;
            curStep++;
            break;
        case 4:
            xPos-=1;
            curStep++;
            break;
        }
        if (Math.abs(xPos)>Math.abs(yPos))
        {
            maxDistance = max(maxDistance, Math.abs(xPos));
        }
        else
        {
          maxDistance = max (maxDistance, Math.abs(yPos)); 
        }
    }
    
    public boolean moreSteps()
    {
        boolean over;
        if (curStep>maxSteps)
        {
            over = true;
        }
        else
        {
            over = false;
        }
        return over;
    }
    
    public boolean inBounds()
    {
        boolean safe;
        if (Math.abs(xPos)> bounds||Math.abs(yPos)>bounds)
        {
            safe = false;
        }
        else
        {
            safe = true;
        }
        return safe;
    }
    
    public void walk()
    {
        for (int i=0;i<maxSteps;i++)
        {
            takeStep();
            if (inBounds()==false)
            {
                break;
            }
        }
        
    }
    
    public int max(int first, int second)
    {
        if (first>second)
        {
            return first;
        }
        else
        {
            return second;
        }
        
    }

    public int getxPos() {
        return xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public int getMaxDistance() {
        return maxDistance;
    }
    

}
