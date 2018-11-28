package javademo;



public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1=0,n2=1,n3,i,count=10;
		
		System.out.println(n1+""+n2);
		
		for(i=2;i<count;i++) {
			
			n3=n1+n2;
			
			System.out.println(""+n3);
			
			n1=n2;
			n2=n3;
			
			
		}
		
		//Swap
		
		int a=10;
		
		int b=20;
		
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("value of A :"+a);
		System.out.println("Value of B :"+b);
			
	
		

	}

}
