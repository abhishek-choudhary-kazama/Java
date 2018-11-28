package javademo;

public class StaticAndNonStatic {
	
	// gobal variable will be available across all the functions with some conditions.
	
	String name ="Tom";// non static variable 
	
	static int age = 25; //static variable 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// *how to call static variable and static method*
		
		// 1) direct call 
		
		 sendmail();
		 
		 // 2) calling by class name
		 StaticAndNonStatic.sendmail();
		 
		 
		 // *How to call  static variable directly and by class name*
		 
		 System.out.println(age);
		 
		 System.out.println(StaticAndNonStatic.age);
		 
		 
		 // * How to call Non static variable you can create object
		 
		 StaticAndNonStatic obj = new StaticAndNonStatic();
		 System.out.println(obj.name);
		 
		 // Non static Method 
		 obj.sum();
		 
		 
		 // Can i access static method by using reference ? yes
		 
		 obj.sendmail();//The static method sendmail() from the type StaticAndNonStatic should be accessed in a static way
	}
	
	public void sum() {//non static methods 
		
		System.out.println("Sum Sum");
		
	}
	
	public static void sendmail() { //static methods 
		
		System.out.println("Send Mail");
	}

}




