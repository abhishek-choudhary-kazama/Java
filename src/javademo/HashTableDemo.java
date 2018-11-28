package javademo;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Hashtable hs = new Hashtable();
		
		hs.put(1, 100);
		
		hs.put(2, "hello");
		
		hs.put("A", "Abhishek");

		
		System.out.println(hs.get(2));
	}

}
