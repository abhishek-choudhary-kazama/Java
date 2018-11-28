package javademo;

import java.util.Scanner;

public class SumTwoNumberWithScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c;
		
		Scanner s =new Scanner(System.in);
		System.out.println("Enter Value A");
		a=s.nextInt();
		
		System.out.println("Enter Value B");
		b=s.nextInt();
		
		c=a+b;
		System.out.println("Sum Of Two Values :"+c);
		

	}

}
