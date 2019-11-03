package _07_binary_converter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class binary implements ActionListener {
	JPanel panel = new JPanel();
	JTextField field = new JTextField(20);
JFrame frame = new JFrame();
JButton button = new JButton();
JLabel label = new JLabel();
	void makeAMethod(){
panel.add(button);
frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
frame.setVisible(true);
frame.add(panel);
button.addActionListener(this);
button.setText("convert");
panel.add(field);
panel.add(label);
frame.pack();
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
String text = field.getText();
 String ans = convert(text);
 //System.out.println(ans);
 label.setText(ans);
}
String convert(String input) {
    if(input.length() != 8){
        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
        return "-";
    }
    String binary = "[0-1]+";//must contain numbers in the given range
    if (!input.matches(binary)) {
        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
        return "-";   
    }
    try {
        int asciiValue = Integer.parseInt(input, 2);
        char theLetter = (char) asciiValue;
        return "" + theLetter;
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
        return "-";
    }
}
}
