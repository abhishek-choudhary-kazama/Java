package javademo;

public class Looping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	for(int i=1;i<=100;i++) {//Initialization,conditional,Incremental/decremantal
			
			System.out.println("Print: "+i);
			
		}
		
		

	}
	
	*/
		
		//dis advantage it will genrate infinite loop 
	int a=1; //Initialization
	
	while(a<=100) {//conditional
		
		System.out.println("Print "+a);
		a=a+1;//Incremental/decremantal 
		
		
	}
	
	}
}
