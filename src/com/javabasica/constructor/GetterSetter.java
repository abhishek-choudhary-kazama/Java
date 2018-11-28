package com.javabasica.constructor;

public class GetterSetter {

	private int x = 10;
	double y = 11.3;

	void add() {

		double z = x + y;
		System.out.println(z);

	}

	void sub() {

		double z = x - y;

		System.out.println(z);
	}
	// Getter always need return type value.
	void getX() {
		
		
		
	}
	
void setX(int a) {
		
		//x=200; hardcode
	
	x=a;
		
	}

}
