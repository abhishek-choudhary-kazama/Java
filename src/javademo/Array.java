package javademo;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//array store similar data type value in a array  variable 
		
		
		//Dis Advantage fixed size --static array---->To over come this problem, we use collations hash table, Array list,
		//Array is only similar data type ---> To over come this problem, we use object Array.
		int i[] =new int[4];
		
		i[0]=1;
		i[1]=3;
		i[2]=44;
		i[3]=5;
		
		System.out.println(i[3]);
		
		//ArrayIndexOutOfBoundsException
	//	System.out.println(i[4]);
		
		System.out.println(i.length);//Size of Array
		
		
		// i want all the value of array use for loop
		
		for(int j=0;j<i.length;j++) {
			
			System.out.println(i[j]);
		}
		
	System.out.println("************************************************************************");
	
	//dobule
	
/*	String x[] =new String[4];
	
x[0]="hello";
x[1]="GoodMornig";
x[2]="Abhi";
x[3]="Arun";

for(int k=0;k<=i.length;k++) {
	
	System.out.println(x[k]);
}
*/
	//Object Array can store different datatypes values like string,int,double
	
	Object ob[] =new Object[4];
	
	ob[0]=20;
	ob[1]=20.20;
	ob[2]="hello";
	ob[3]="Abhishek";
	
	for(int t=0;t<=i.length;t++) {
		
		System.out.println(ob[t]);
		
	}
	
	
	
	
	
	
System.out.println("**********************************************************************");

	}

}
