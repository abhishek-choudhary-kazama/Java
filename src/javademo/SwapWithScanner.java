package javademo;

import java.util.Scanner;

public class SwapWithScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the value A :");
		a=s.nextInt();
		
		System.out.println("Enter the value B :");
		b=s.nextInt();
		
		c=a;
		a=b;
		b=c;
		
		System.out.println("Swap Number A :"+a);
		System.out.println("Swap Number B :"+b);

	}

}
