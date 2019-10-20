package _05_vault;

public class vault {
int secretCode;
vault(int code){
secretCode=code;	
}
boolean tryCode(int guess){
System.out.println(guess);
	if(guess==secretCode) {
return true;
}
return false;
}

}

