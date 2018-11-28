package javademo;

public class IfElseConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Comparison operators
		//< > 	>= <= == !=
	/*	int a=10;
		
		int b=20;
		
		if(b>a) {
			
			System.out.println("B is greater then A");
			
			
			
		}
		else
			System.out.println("A is greater B");

	}
	
*/	
	int x =30;
	int y =30;
	
	if(x==y) {
		System.out.println("x and y is equal");
		
		
	}
	else {
		
		System.out.println("x and y not is equal");
	}
	
	// Write the program highest Number
	
	int a1=100;
	int b1=500;
	int c1=300;
	
	if (a1>b1& a1>c1) {
		
		System.out.println("a1 is a highest number");
		
	}
	
	else if(b1>c1) {
		
		System.out.println("b1 is a highest number");
	}
	
	else{
		
		System.out.println("c1 is highest number ");
	}
}
}
