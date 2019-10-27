package _06_duck;

public class mothRunner {
public static void main(String[] args) {
	
moth peppaPug = new moth(8,"kermitTheFrog");
peppaPug.getName();
peppaPug.skillet();
peppaPug.eat();
for (int i = 0; i < 10; i++) {
	
peppaPug.pluck();
System.out.println("Peppa has "+ peppaPug.numOfWings+ "wings");
}
peppaPug.eat();
peppaPug.skillet();
peppaPug.eat();
}
}
