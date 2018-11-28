package javademo;

public class FuncationInJava {
// Main methods is starting point of excution 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//
		
		//after creating the object the copy all non static methods will  be given to this object. 
		FuncationInJava obj = new FuncationInJava();
		
		obj.test();
		int i = obj.sum();
		System.out.println(i);
		
		int j = obj.divsion(20, 5);
		System.out.println(j);
		
		String s1 = obj.xyz();
		System.out.println(s1);
		
	}
		//Non static methods 
		
	// Void does not return any value
		public void test() { // no inupt no out put
			
			System.out.println("test");
		}

		// return type int
		public int sum() { //no input but some out put
			
			int a=10;
			int b=20;
			int c=a+b;
			
			return c;
		}
		
		// return type of String
		public String xyz() { //no input but some out put
			
			System.out.println("Hello");
			 String s = "Abhishek";
			 return s;
		}
		
		//x,y parameters/arguments 
		public int divsion(int x, int y) {
			
			System.out.println("division Methods");
			
			int d=x/y;
			return d;
		}
		
	}


