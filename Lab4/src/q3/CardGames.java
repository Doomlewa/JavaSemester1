package q3;

public class CardGames {

    public enum Rank{
        ACE,
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN,
        EIGHT,
        NINE,
        TEN,
        JACK,
        QUEEN,
        KING
    }
    public static void main(String[] args) {
        Rank highCard=Rank.ACE;
        Rank faceCard=Rank.JACK;
        Rank card1=Rank.SIX;
        Rank card2=Rank.NINE;
        int card1Val=card1.ordinal()+1;
        int card2Val=card2.ordinal()+1;
        System.out.println("A blackjack hand is: "+highCard.name()
                +" and "+faceCard.name());
        System.out.println("\nA two card Hand: "+card1.name()
                +" and "+card2.name());
        System.out.println("Hand Value: "+(card1Val+card2Val));

    }

}
