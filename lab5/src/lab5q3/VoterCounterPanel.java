package lab5q3;
import java.awt.*; 
import java.awt.event.*; 
import javax. swing. *; 

public class VoterCounterPanel extends JPanel
{
    private int votesForJoe; 
    private JButton joe; 
    private JLabel labelJoe; 
    private int votesForSam;
    private JButton sam;
    private JLabel labelSam;
    
    public VoterCounterPanel() 
    { 
        votesForJoe = 0; 
        votesForSam  =0;
        joe = new JButton("Vote for Joe"); 
        sam = new JButton("Vote for Sam");
        joe.addActionListener(new JoeButtonListener());
        sam.addActionListener(new SamButtonListener());
        
        labelJoe = new JLabel("Votes for Joe: " + votesForJoe);
        labelSam = new JLabel("Votes for Sam: " + votesForSam);
        add(joe); 
        add(sam);
        add(labelJoe); 
        add (labelSam);
        
        setPreferredSize(new Dimension(300, 40)); 
        setBackground(Color.cyan); 
    }
    private class JoeButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event) 
        { 
            votesForJoe++;
            labelJoe.setText("Votes for Joe: " + votesForJoe);
        }
    }
    private class SamButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event) 
        { 
            votesForSam++;
            labelSam.setText("Votes for Sam: " + votesForSam);
        }
    }
}
