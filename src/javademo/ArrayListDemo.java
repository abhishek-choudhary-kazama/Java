package javademo;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList ar = new ArrayList();
		
		ar.add(100);
		ar.add(200);
		ar.add(300);
		
		System.out.println(ar.size());
		
		ar.add("Hello");
		ar.add("Hi");
		
		
		System.out.println(ar.size());
		
		System.out.println(ar.get(3));
		
		//if you want to all the value print 
		
		for(int i=0;i<ar.size();i++) {
			
			System.out.println(ar.get(i));
			
			
			ArrayList<Integer> ar1 =new ArrayList<Integer>();
			
			ar1.add(100);
			
		}

	}

}
