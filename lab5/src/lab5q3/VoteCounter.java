package lab5q3;
import javax.swing.JFrame;
public class VoteCounter {
    public static void main(String[] args) 
    { 
        JFrame frame = new JFrame("Vote Counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new VoterCounterPanel()); 
        frame.pack(); frame.setVisible(true);
    }


}
