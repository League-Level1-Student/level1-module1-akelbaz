package _06_duck;

public class moth {
	String name;
	int numOfWings;
	
	moth(int numOfWings, String name){
		this.numOfWings=numOfWings;
		this.name=name;
	
	}
boolean isLive = true;
boolean hasWings=true;

	public String getName() {
		return this.name;
	}
	public int getWings() {
	 return this.numOfWings;	
	}
	public void pluck(){
	numOfWings--;
	System.out.println("ouch");
	if(numOfWings<=0) {
		hasWings=false;
		}
	}
	public void skillet() {
	if(hasWings==false) {
	System.out.println(name + " is a delicous moth skillet");
	isLive=false;
	}else {
	System.out.println("Pluck  "+name+ "'s wings off first");
	}
	}
	public void eat() {
	if(isLive) {
	System.out.println("NO EATING LIVE MOTHS, COOK IT FIRST");
	}else if(isLive==false) {
	System.out.println("yum, "+name+"has been eaten");	
	
	}
	
	}
	

}

