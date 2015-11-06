package lab6q4;
import java.awt.*;
import java.awt.event.*;
import javax.swing. *;
public class VoteCounterPanel extends JPanel {

    private int votesForJoe;
    private int votesForSam;
    private JButton joe;
    private JButton sam;
    private JLabel labelJoe;
    private JLabel labelSam;
    private JLabel labelWin;
    
    public VoteCounterPanel() 
    { 
        votesForJoe = 0; 
    
        joe = new JButton("Vote for Joe"); 
        joe.addActionListener(new VoteButtonListener()); 
        
        sam = new JButton("Vote for Sam");
        sam.addActionListener(new VoteButtonListener());
    
        labelJoe = new JLabel("Votes for Joe: " + votesForJoe);
        labelSam = new JLabel("Votes for Sam: " + votesForSam);
        labelWin = new JLabel("They're Neck and Neck!");
    
        add(joe); 
        add(labelJoe); 
        add(sam);
        add(labelSam);
        add(labelWin);
    
        setPreferredSize(new Dimension(300, 40)); 
        setBackground(Color.cyan); 
    }
    
    private class VoteButtonListener implements ActionListener { 
      //---------------------------------------------- 
     // Updates the appropriate vote counter when a 
     // button is pushed for one of the candidates. 
     //---------------------------------------------- 
        public void actionPerformed(ActionEvent event) 
        { 
            if (event.getSource()==joe)
            {
                votesForJoe++; 
                labelJoe.setText("Votes for Joe: " + votesForJoe); 
            }
            else if (event.getSource()==sam)
            {
            
                votesForSam++;
                labelSam.setText("Votes For Sam: " + votesForSam);
            }
            if (votesForJoe>votesForSam)
            {
                labelWin.setText("Joe is in the lead by "+(votesForJoe-votesForSam));
            }
            else if (votesForSam>votesForJoe)
            {
                labelWin.setText("Sam is in the lead by "+(votesForSam-votesForJoe));
            }
            else
                labelWin.setText("They're Neck and Neck!");
            
        } 
      } 
}
