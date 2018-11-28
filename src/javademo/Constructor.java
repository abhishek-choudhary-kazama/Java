package javademo;

public class Constructor {
	
	String name ="Abhishek"; //class and instance variable
	int age=20;
	
	//Yes we can overloading constructor 
	public Constructor(){//0 Parameter 
		
		System.out.println("Constructor");
		
	}
	
public Constructor(int i){//1 Parameter 
		
		System.out.println(i);
		
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Constructor cs = new Constructor();
	//System.out.println(cs.age);
	Constructor cs1 = new Constructor(10);
	Constructor cs2 = new Constructor(20,70);
		

	}

}
