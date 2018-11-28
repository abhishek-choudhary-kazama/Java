package javademo;

public class GlobalAndLocalVariable {

	//Global Variable out side the class
	int i=20;
	String s ="Anhishek";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=30; // this local i for main methods
		
		System.out.println(i);

		GlobalAndLocalVariable obj = new GlobalAndLocalVariable();
		System.out.println(obj.i);
		
		
	}
	
	
	public void  sum() {
		
		int i =40;// this local i for sum methods
		String s = "choudhary";
	}

}
