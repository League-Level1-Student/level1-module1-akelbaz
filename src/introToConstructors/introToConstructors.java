package introToConstructors;

import javax.swing.JOptionPane;

public class introToConstructors {
	private String name;
    void sayHi(){
    name = JOptionPane.showInputDialog("NAME A PLATYPUS");
    System.out.println("The platypus " + name + " is smarter than your average platypus.");

    }
}
