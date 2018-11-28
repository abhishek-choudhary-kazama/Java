package javademo;

public class MethodOverloding {

	public static void main(String[] args) {
		
		MethodOverloding obj = new MethodOverloding();

		obj.sum();
		obj.sum(10);
		obj.sum(10, 20);
	
		
	}
	// yes we can overload main methods 
	
	public static void main(int i) {
		
		
	}
	
	//duplicate method are not allowed inside methods 
	
	// method overloding --->when the method name is same with different parameter or 
	public void sum() {//0 input 
		
		System.out.println("Sum Methods  Zero Para");
	}
	
public void sum(int i) {
		
	System.out.println("Sum Methods  Single");
	System.out.println(i);
	}

public void sum(int i,int k) {
	System.out.println("Sum Methods  Two Para");
	System.out.println(i+k);

	
}



}
