package javademo;

public class CarClass {

	
	//Class Vars Global Variable 
	
	int mod;
	int wheel;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		// New carclass is a Object -----> using new keyword we create object
		//a is object reference name
	CarClass a = new CarClass();
	CarClass b = new CarClass();
	CarClass c = new CarClass();
	
	a.mod =2016;
	a.wheel =4;
	
	System.out.println(a.mod);
	System.out.println(a.wheel);
	
		

	}

}
