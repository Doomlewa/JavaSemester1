package lab10q1;
import java.awt.*; 

import javax.swing.*; 

public class TelephonePanel extends JPanel 
{ 
    public TelephonePanel() 
    { 
        //set BorderLayout for this panel 
        setLayout(new BorderLayout());
        //create a JLabel with "Your Telephone" title
        JLabel title = new JLabel("Your Telephone");
        JPanel name = new JPanel();
        name.add(title);
        //add title label to north of this panel
        add(name,BorderLayout.NORTH);
        //create panel to hold keypad and give it a 4x3 GridLayout 
        JPanel key = new JPanel();
        key.setLayout(new GridLayout(4,3));
        //add buttons representing keys to key panel 
        JButton one = new JButton();
        JButton two = new JButton();
        JButton three = new JButton();
        JButton four = new JButton();
        JButton five = new JButton();
        JButton six = new JButton();
        JButton seven = new JButton();
        JButton eight = new JButton();
        JButton nine = new JButton();
        JButton star = new JButton();
        JButton zero = new JButton();
        JButton pound = new JButton();
        
        one.setText("1");
        two.setText("2");
        three.setText("3");
        four.setText("4");
        five.setText("5");
        six.setText("6");
        seven.setText("7");
        eight.setText("8");
        nine.setText("9");
        star.setText("*");
        zero.setText("0");
        pound.setText("#");
        
        key.add(one);
        key.add(two);
        key.add(three);
        key.add(four);
        key.add(five);
        key.add(six);
        key.add(seven);
        key.add(eight);
        key.add(nine);
        key.add(star);
        key.add(zero);
        key.add(pound);
        //add key panel to center of this panel
        add(key,BorderLayout.CENTER);
    }
}