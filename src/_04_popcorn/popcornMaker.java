package _04_popcorn;

import javax.swing.JOptionPane;

public class popcornMaker {
public static void main(String[] args) {
String flavor = JOptionPane.showInputDialog("What flavor popcorn");
	Popcorn pops = new Popcorn(flavor);	
Microwave micro = new Microwave();
micro.putInMicrowave(pops);
String oof = JOptionPane.showInputDialog("How many minutes do you want to cook the popcorn");
int cookTime = Integer.parseInt(oof);
micro.setTime(cookTime);
micro.startMicrowave();
}
}
