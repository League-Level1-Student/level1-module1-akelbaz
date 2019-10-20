package _05_vault;

import java.util.Random;

public class JamesBond {
public static void main(String[] args) {
Random rand = new Random();
int boom = rand.nextInt(1000000);
	vault v = new vault(boom);
	findCode(v);
}
static void findCode(vault v) {
for (int i = 0; i<i+1; i++) {
v.tryCode(i);	
if(v.tryCode(i)) {
System.out.println("YOU WIN!!! The Code was "+i);
	break;	
}
}	
}
}

