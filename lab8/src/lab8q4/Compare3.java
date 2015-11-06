package lab8q4;

public class Compare3 {

    public static Comparable Largest(Comparable first,Comparable second,Comparable third) {
   
        Comparable last = third;
        if (first.compareTo(second)>0)
        {
            if (first.compareTo(third)>0)
            {
                last = first;
            }
        }
        else if (second.compareTo(third)>0)
        {
            last = second;
        }
      
        return last;
       
    
    }
}
